module ch04_pjt_01 {
	exports ch04_pjt_01.ems;
	exports ch04_pjt_01.ems.member.service;
	exports ch04_pjt_01.ems.utils;
	exports ch04_pjt_01.ems.member;
	exports ch04_pjt_01.ems.member.dao;

	requires spring.beans;
	requires spring.context;
	requires spring.core;
}