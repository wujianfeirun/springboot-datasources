package com.bp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.bp")
@MapperScan("com.bp.dao")
/*public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}*/

//	package without tomcat
public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
