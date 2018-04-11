package com.bigfactory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * **在最外侧,即包含所有子包 
 * @ClassName Application
 * @Description 入口,启动类
 * @author lide
 * @date 2018年2月9日 下午2:47:04
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableTransactionManagement(order = 2)	//设置事务执行顺序(需要在切换数据源之后，否则只走主库)
@MapperScan(basePackages = "com.bigfactory.*.domain.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//	package without tomcat
/*public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}*/
