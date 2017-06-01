package org.hangover.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestServicesTest {
	
	
	@LocalServerPort
	private int port;
	
	@Test
	public void testHello(){
		
		RestTemplate restTest = new RestTemplate();
		String url = "http://localhost:"+port+"/sample/hello";
		ResponseEntity<String> response = restTest.getForEntity(url, String.class);
		Assert.assertTrue("Should be success", response.getStatusCode().equals(HttpStatus.OK));
	}
	
	@Test
	public void testHelloNegative(){
		RestTemplate restTest = new RestTemplate();
		String url = "http://localhost:"+port+"/sample/hello";
		ResponseEntity<String> response = restTest.getForEntity(url, String.class);
		Assert.assertFalse("Should be success", response.getStatusCode().equals(HttpStatus.BAD_REQUEST));
	}


}
