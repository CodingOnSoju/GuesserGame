package com.accenture;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	
@Bean()
	public Umpire umpireBeanDefination() {
		return new Umpire();
	}

@Bean
	public Guesser guesserBeanDefination() {
		return new Guesser();
	}

@Bean
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public Player playerBeanDefination() {
	return new Player();
}
	
}
