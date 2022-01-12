package org.example.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan("org.example")
@EnableWebMvc
        public class Myconfig {
    @Bean
    public ViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        resolver.setPrefix("/WEB-INF/view/");
        return resolver;
    }

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource combo = new ComboPooledDataSource();
        try {
            combo.setDriverClass("com.mysql.cj.jdbc.Driver");
            combo.setJdbcUrl("jdbc:mysql://localhost:3306/springmvc?useSSL=false&serverTimezone=UTC");
            combo.setUser("root");
            combo.setPassword("Crfkf1984!");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return combo;
    }
}
