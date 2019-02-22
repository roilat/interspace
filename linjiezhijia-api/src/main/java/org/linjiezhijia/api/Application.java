package org.linjiezhijia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
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
@EnableJpaRepositories
@EntityScan
public class Application {
    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("spring boot is running");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args).getBean(Runnable.class).run();
    }
}
