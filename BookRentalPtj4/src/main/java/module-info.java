module BookRentalPtj4 {
	exports com.office.library.book.admin.util;
	exports com.office.library.admin;
	exports com.office.library.admin.member;
	exports com.office.library;
	exports com.office.library.book;
	exports com.office.library.book.admin;
	exports com.office.library.config;
	exports com.office.library.user.member;
	exports com.office.library.user;
	exports com.office.library.book.user;

	requires java.mail;
	requires java.sql;
	requires lombok;
	requires servlet.api;
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