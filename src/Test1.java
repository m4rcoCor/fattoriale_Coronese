import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testFattoriale1() {
		//fail("Prova JUnit");
		
		FattorialeClass f=new FattorialeClass();
		int n=0;
		int risAtteso=1;
		int risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
		//assertEquals(1, f.fattoriale(n));
	}
	
	@Test
	public void testFattoriale2() {
		//fail("Prova JUnit");
		
		FattorialeClass f=new FattorialeClass();
		int n=1;
		int risAtteso=1;
		int risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
		//assertEquals(1, f.fattoriale(n));
	}
	
	@Test
	public void testFattoriale3() {
		//fail("Prova JUnit");
		
		FattorialeClass f=new FattorialeClass();
		int n=4;
		int risAtteso=24;
		float risOttenuto= f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto,0.1);
		//assertEquals(1, f.fattoriale(n));
	}
	
	
}

