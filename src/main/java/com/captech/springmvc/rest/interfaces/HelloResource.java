package com.captech.springmvc.rest.interfaces;

import com.captech.springmvc.rest.model.HelloModel;
import com.captech.springmvc.rest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * <p>
 * Hello World Resource
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
@Validated
@RestController
public class HelloResource {

	private final HelloService helloService;

	@Autowired
	public HelloResource(final HelloService helloService) {
		this.helloService = helloService;
	}

	@RequestMapping(value = "/hello/{name}", method = GET, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<HelloModel> sayHello(@PathVariable final String name) {
		return ResponseEntity.ok(helloService.sayHello(name));

	}
}