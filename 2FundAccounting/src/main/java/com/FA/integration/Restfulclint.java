package com.FA.integration;

import org.springframework.stereotype.Service;

import com.FA.dto.BOC;
@Service
public interface Restfulclint {
	BOC findById(long id);

}
