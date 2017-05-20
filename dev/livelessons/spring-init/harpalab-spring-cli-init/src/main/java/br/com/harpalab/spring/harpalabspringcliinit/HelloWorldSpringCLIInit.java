/**
 * 
 */
package br.com.harpalab.spring.harpalabspringcliinit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denis
 *
 */
@RestController
public class HelloWorldSpringCLIInit {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World Spring CLI Init!";
	}

}
