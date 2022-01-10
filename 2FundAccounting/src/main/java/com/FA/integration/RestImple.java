package com.FA.integration;

import org.springframework.web.client.RestTemplate;

import com.FA.dto.BOC;

public class RestImple implements Restfulclint {

	@Override
	public BOC findById(long id) {
		RestTemplate rest =new RestTemplate();
		BOC forObject = rest.getForObject("http://localhost:8080/Rest/getBOCaccount/"+id,BOC.class);
		
		
	
		return forObject;
		
	}

	

}
