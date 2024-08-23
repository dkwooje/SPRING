package com.office.library.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class LibraryBeanNameGenerator implements BeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		
		System.out.println(definition.getBeanClassName());  
		
		return definition.getBeanClassName(); //bean 충돌 방지 :  generateBeanName으로
		 //com.office.library.book.admin.BookController 와 com.office.library.book.user.BookController 간의 bean충돌
	}

}
