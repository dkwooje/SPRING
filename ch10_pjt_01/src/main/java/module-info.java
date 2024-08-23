module ch10_pjt_01 {
	exports com.company.cookie.member;
	exports com.company.cookie;

	requires servlet.api;
	requires slf4j.api;
	requires spring.context;
	requires spring.web;
}