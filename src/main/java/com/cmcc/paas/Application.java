package com.cmcc.paas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author zrd
 * @E-mail 13552066077@163.com
 * @date 2021-5-18
 * @version 1.0
 * @Description Application
 */
@SpringBootApplication
public class Application {
	static {
	//解决URL中包含%2F的问题
		System.setProperty("org.apache.tomcat.util.buf.UDecoder.ALLOW_ENCODED_SLASH", "true");
//解决URL中包含%5C的问题
		System.setProperty("org.apache.catalina.connector.CoyoteAdapter.ALLOW_BACKSLASH", "true");
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
