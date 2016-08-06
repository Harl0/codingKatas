package test.java;

import static org.junit.Assert.*;
import org.junit.*;

import main.java.MessageUtil;

public class TestJunit {
	
	   String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      message = "Hello World";
	      assertEquals(message,messageUtil.printMessage());
	   }
}