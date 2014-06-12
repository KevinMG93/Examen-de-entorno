package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Mayor;
public class pruebasMayor {
	
	Mayor p=new Mayor();

	@Before
	public void setUp() throws Exception {
		
		p.setA(3);
		p.setB(5);
		
	}

	@Test
	public void test() {
		assertEquals(5,p.mayor());
	}

}
