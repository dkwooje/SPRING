module BookRentalPtj1 {
	exports com.office.library.book.admin.util;
	exports com.office.library.admin;
	exports com.office.library.admin.member;
	exports com.office.library;
	exports com.office.library.book;
	exports com.office.library.book.admin;

	requires java.mail;
	requires java.sql;
	requires servlet.api;
	requires slf4j.api;
	requires spring.beans;
	requires spring.context;
	requires spring.context.support;
	requires spring.core;
	requires spring.jdbc;
	requires spring.security.core;
	requires spring.tx;
	requires spring.web;
	requires spring.webmvc;
}