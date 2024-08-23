module Test {
	exports com.office.member.admin;
	exports com.office.member.admin.member;
	exports com.office.member;

	requires slf4j.api;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.jdbc;
	requires spring.security.core;
	requires spring.tx;
	requires spring.web;
}