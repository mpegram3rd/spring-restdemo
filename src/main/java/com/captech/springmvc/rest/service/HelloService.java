package com.captech.springmvc.rest.service;

import com.captech.springmvc.rest.model.HelloModel;

/**
 * <p>
 * HelloService interface definition.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public interface HelloService {

	HelloModel sayHello(final String name);
}
