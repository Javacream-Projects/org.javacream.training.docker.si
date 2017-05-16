package org.javacream.training.docker.si;

import org.junit.Assert;
import org.junit.Test;


public class DemoTest {

	@Test public void testDemo(){
		Demo demo = new Demo();
		Assert.assertEquals("OK", demo.doSomething());
		
	}
}
