package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import spring.Client2;

@ComponentScan(basePackages = {"spring"})


public class AppCtx {
	@Bean(initMethod="connect", destroyMethod="close")
	public Client2 client2() {
		return new Client2();
	}
}
