package cn.roilat.interspace;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.roilat.interspace.App;


public class AppTest{
	
	App app;
	
    @Before
    public void init() {
        app = new App();
    }

	@Test
	public void testDemo() {
		app.demo();
		throw new RuntimeException();
	}
	
	@After
	public void finish(){
		
	}

}
