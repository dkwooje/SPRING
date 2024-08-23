module ch08_pjt_01 {
	exports com.company.hello;
	exports com.company.hello.member;

	requires slf4j.api;
	requires spring.beans;
	requires spring.context;
	requires spring.web;
}