import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	
	private FattorialeClass f;
	int risAtteso, risOttenuto, n;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
		f=new FattorialeClass();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void testFattoriale1() {
		//fail("test1");
		//FattorialeClass f=new FattorialeClass();
		n=0;
		risAtteso=1;
		risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
		//assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale2() {
		//fail("test2");
		//FattorialeClass f=new FattorialeClass();
		n=1;
		risAtteso=1;
		risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
		//assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale3() {
		//fail("test3");
		//FattorialeClass f=new FattorialeClass();
		n=4;
		risAtteso=24;
		risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto,0.1);
		//assertEquals(1, f.fattoriale(n));
	}

}
