package ui.api.frameworkTest;
import ui.api.framework.FrameworkBase;

import java.io.IOException;

import org.testng.annotations.Test;

public class BasicTest extends FrameworkBase{
	
	@Test
	public void test1() throws  Exception{
    System.out.println( "Hello World!  "+ SESSION.toString() +" "+  Thread.currentThread().getId());
    apiresponse();
	}
	
	@Test
	public void test2 () throws  Exception{
	    System.out.println( "Hello World!  "+ SESSION.toString()+ " " + Thread.currentThread().getId());
	    apiresponse();
		}
}
