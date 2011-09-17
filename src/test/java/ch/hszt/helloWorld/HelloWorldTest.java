package ch.hszt.helloWorld;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class HelloWorldTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final HelloWorld h = new HelloWorld();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testOutput(){
		h.printMessage();
		assertEquals("Hello World", outContent.toString());
	}
	
	@After
	public void cleanUpStreams(){
		System.setOut(null);
	}
}
