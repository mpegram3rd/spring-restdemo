package com.captech.springmvc.rest.interfaces;

import com.captech.springmvc.rest.exceptions.DataNotFoundException;
import com.captech.springmvc.rest.model.HelloModel;
import com.captech.springmvc.rest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

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

	@GetMapping(value = "/hello/{name}", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<HelloModel> sayHello(@PathVariable final String name) {
		return ResponseEntity.ok(helloService.sayHello(name));

	}

	@GetMapping(value = "/goodbye", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity goodbye() throws DataNotFoundException {
		throw new DataNotFoundException("Ooopsie!  I couldn't find that");
	}
}
