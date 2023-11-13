package com.springCloud.ITCCloudClient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ClientController {
	
	@Value("${name}")
	private String name;
	
	@Value("${city}")
	private String city;
	@GetMapping("configdata")
	public String getConfigData() {return city +" "+name;}
}
