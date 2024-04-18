package com;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Normal // Everytime give same instance on calling
{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototype // Everytime give new instance on calling
{

}

@ComponentScan
@Configuration
public class BeanScope {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(BeanScope.class);

		System.out.println(context.getBean(Normal.class));
		System.out.println(context.getBean(Normal.class));
		System.out.println(context.getBean(Normal.class));
		System.out.println(context.getBean(Normal.class));

		System.out.println(context.getBean(Prototype.class));
		System.out.println(context.getBean(Prototype.class));
		System.out.println(context.getBean(Prototype.class));
		System.out.println(context.getBean(Prototype.class));

		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

		context.close();
	}
}