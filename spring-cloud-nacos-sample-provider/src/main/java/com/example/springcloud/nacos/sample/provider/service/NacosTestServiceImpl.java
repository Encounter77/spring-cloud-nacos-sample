package com.example.springcloud.nacos.sample.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.example.service.NacosTestService;

/**
 * @author Jiangyf
 * @version 1.0.0
 * @ClassName NacosTestServiceImpl.java
 * @Description TODO
 * @createTime 2020年08月25日 17:15:00
 */
@Service
public class NacosTestServiceImpl implements NacosTestService {

	@Override
	public String sayHello(String name) {
		return "Hello World : " + name;
	}
}
