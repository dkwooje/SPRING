module ch06_pjt_01 {
	exports ch06_pjt_01.ems.utils;
	exports ch06_pjt_01.ems.member.dao;
	exports ch06_pjt_01.ems.member;
	exports ch06_pjt_01.ems;
	exports ch06_pjt_01.ems.configuration;
	exports ch06_pjt_01.ems.member.service;

	requires spring.beans;
	requires spring.context;
	requires spring.core;
}