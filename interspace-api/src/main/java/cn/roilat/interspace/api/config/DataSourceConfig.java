package cn.roilat.interspace.api.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * 数据源及mybatis配置
 * 1.@MapperScan这个注解配置是搜索mapper接口，需要和yml文件中的mybatis.mapper-locations配合使用
 * 2.根据application.yml,应该已经为hibernate生成自己的sessionFactory
 * @author roilat-J
 * @version $Id: DataSourceConfig.java, v 0.1 2019年2月28日 下午5:05:13 roilat-J Exp $
 */
@Configuration
@MapperScan(basePackages = "cn.roilat.interspace.api.biz.*.dao.mappers", sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfig {

    /**
     * 如果不使用下列配置，则系统会根据我的spring.datasource.type使用druid连接管理池，如果使用下列数据源，则会使用默认的管理池HikariConfig
     * 
     * @param dataSource
     * @return
     */
/* @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }*/

 /*   @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("cn.roilat.interspace.api.demo.model,cn.roilat.interspace.api.demo.model");//可以多个用逗号隔开
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
            .getResources("classpath:org/interspace/api/ * /mappers/*.xml"));
        return bean.getObject();
    }*/

    /**
     * 适用的场景是“mybatis”，“ jdbctemplate”，"本地事务"
     * 
     * @param dataSource
     * @return
     */
   @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
   /******************************************/
   
   @Bean(name = "jpaTransactionManager")
   public JpaTransactionManager jpaTransactionManager(@Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean ) {
       return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getNativeEntityManagerFactory());
   }

    /**
     * 这是mybatis的sqlSessionTemplate
     * 
     * @param sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean(name = "sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
