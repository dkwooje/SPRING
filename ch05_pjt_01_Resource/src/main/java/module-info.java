module ch05_pjt_01_Resource {
	exports ch05_pjt_01.contact.service;
	exports ch05_pjt_01.contact.utils;
	exports ch05_pjt_01.contact.dao;
	exports ch05_pjt_01.contact;

	requires java.annotation;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
}