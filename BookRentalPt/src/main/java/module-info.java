module BookRentalPt {
	exports com.office.library.admin;
	exports com.office.library.admin.member;
	exports com.office.library;

	requires slf4j.api;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.jdbc;
	requires spring.security.core;
	requires spring.tx;
	requires spring.web;
}