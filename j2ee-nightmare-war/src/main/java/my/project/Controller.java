package my.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyClient.class);
	
	MyClient client = new MyClient();

	@RequestMapping("/")
	String home() {
		LOGGER.info("root endpoint");
		client.callMyLocalBusinessMethod();
		return "Hello World!";
	}

	@RequestMapping("/test")
	String test() {
		
		LOGGER.info("test endpoint");
		client.callMyLocalBusinessMethod();
		return "Hello World!";
	}
}
