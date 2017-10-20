package com.arun.service.service.magnificent;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagnificentRest {
	
	@RequestMapping("/")
    public String magnificentRest() throws RuntimeException {
		
		Random random = new Random();
		int randomInt = random.nextInt(100);
	    
		if (randomInt % 2 == 0 ) {
			return "Magnificent!";
		} else {
			throw new RuntimeException();
		}
    }

}
