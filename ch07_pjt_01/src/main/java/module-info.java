module ch07_pjt_01 {
	exports com.company.hello;
	exports com.company.hello.member;

	requires slf4j.api;
	requires spring.context;
	requires spring.web;
}