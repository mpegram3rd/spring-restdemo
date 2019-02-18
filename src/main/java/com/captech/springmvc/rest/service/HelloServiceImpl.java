package com.captech.springmvc.rest.service;

import com.captech.springmvc.rest.model.HelloModel;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * Hello Service implementation
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
@Service
public class HelloServiceImpl implements HelloService {

	/**
	 * Creates a Hello response with the date time stamp.
	 *
	 * @param name
	 *      Name to say hello to.
	 * @return
	 */
	public HelloModel sayHello(final String name) {
		return new HelloModel(name, new Date());
	}
}
