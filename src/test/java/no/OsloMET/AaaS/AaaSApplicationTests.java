package no.OsloMET.AaaS;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AaaSApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void whenEmptyString_thenAccept() {
    		Palindrome palindromeTester = new Palindrome();
    		assertTrue(palindromeTester.isPalindrome(""));
	}

}

