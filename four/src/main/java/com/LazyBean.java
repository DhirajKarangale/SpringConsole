package com;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA
{

}

@Component @Lazy
class ClassB
{
	private ClassA classA;

	public ClassB(ClassA classA)
	{
		System.out.println("Init Class A");
		this.classA = classA;
	}
}

@Configuration @ComponentScan
public class LazyBean 
{
	public static void main(String[] args) 
	{
		var context = new AnnotationConfigApplicationContext(LazyBean.class);

		// context.getBean(ClassB.class);

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

		context.close();
	}
}