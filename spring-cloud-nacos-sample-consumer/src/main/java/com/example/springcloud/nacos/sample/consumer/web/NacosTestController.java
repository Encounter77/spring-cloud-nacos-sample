package com.example.springcloud.nacos.sample.consumer.web;

import org.apache.dubbo.config.annotation.Reference;
import org.example.service.NacosTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiangyf
 * @version 1.0.0
 * @ClassName NacosTestController.java
 * @Description TODO
 * @createTime 2020年08月26日 10:13:00
 */
@RestController
public class NacosTestController {

	@Reference
	private NacosTestService nacosTestService;

	@GetMapping(value = "say")
	public String sayHello() {
		return nacosTestService.sayHello("zhangsan");
	}
}
