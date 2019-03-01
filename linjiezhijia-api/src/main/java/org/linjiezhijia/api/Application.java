package org.linjiezhijia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
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
@ServletComponentScan("org.linjiezhijia.api.config.filter")
@EnableJpaRepositories(basePackages = { "org.linjiezhijia.api.biz.blog.dao.jpa",
                                        "org.linjiezhijia.api.biz.demo.dao" }, transactionManagerRef = "jpaTransactionManager")
@EntityScan(basePackages= {"org.linjiezhijia.api.biz.blog.model","org.linjiezhijia.api.biz.demo.model"})
public class Application {
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
