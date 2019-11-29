package cn.roilat.interspace.api;

import java.util.List;

import cn.roilat.interspace.api.biz.home.controller.BasicErrorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @SpringBootApplication注解会扫描当前包及其子包
 * 
 * @author roilat-J
 * @version $Id: Application.java, v 0.1 2019年2月20日 下午3:10:47 roilat-J Exp $
 */
@SpringBootApplication(/*exclude= {DataSourceAutoConfiguration.class}*/)
@ServletComponentScan("cn.roilat.interspace.api.config.filter")
@EnableJpaRepositories(basePackages = { "cn.roilat.interspace.api.biz.blog.dao.jpa",
                                        "cn.roilat.interspace.api.biz.demo.dao" }, transactionManagerRef = "jpaTransactionManager")
@EntityScan(basePackages= {"cn.roilat.interspace.api.biz.blog.model","cn.roilat.interspace.api.biz.demo.model"})
public class Application {
    
    @Autowired(required = false)
    private List<ErrorViewResolver> errorViewResolvers;
    private final ServerProperties serverProperties;

    public Application(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }

    @Bean
    public BasicErrorController basicErrorController(ErrorAttributes errorAttributes) {
        return new BasicErrorController(errorAttributes, this.serverProperties.getError(),
            this.errorViewResolvers);
    }
    
    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("spring boot is running");
        };
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        applicationContext.getBean(Runnable.class).run();
        /*System.out.println(applicationContext.getBean(AbstractPlatformTransactionManager.class));
        System.out.println(applicationContext.getBean(HibernateJpaVendorAdapter.class));
        System.out.println(applicationContext.getBean("entityManagerFactory"));
        System.out.println(applicationContext.getBean(LocalContainerEntityManagerFactoryBean.class));
        System.out.println(applicationContext.getBean(HibernateTransactionManager.class));
        System.out.println(applicationContext.getBean(JpaTransactionManager.class));*/
        /*ClassPathScanningCandidateComponentProvider clComponentProvider = new ClassPathScanningCandidateComponentProvider(false);
        clComponentProvider.resolveBasePackage("cn.roilat.*");*/
    }
}
