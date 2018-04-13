package com.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.TestUser;

@Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping(value = "/login", produces = "application/json; charset=utf-8")
	public String doLogin(){
		Map<String, List<TestUser>> map = new HashMap<>();
		TestUser t1 = new TestUser("1","王菲","11");
		TestUser t2 = new TestUser("2","测试","12");
		TestUser t3 = new TestUser("3","可以","13");
		TestUser t4 = new TestUser("4","跨域","14");
		List<TestUser> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		map.put("data", list);
		return JSON.toJSONString(map);
	}

}
