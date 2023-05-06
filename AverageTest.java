import static org.junit.Assert.*;

import org.junit.Test;

public class AverageTest {

	@Test
	public void testAverageEmpty() {
		int[] list = new int[0];
		assertEquals(0, Average.average(-1,list));
		assertEquals(0, Average.average(0,list));
		assertEquals(0, Average.average(1,list));
		assertEquals(0, Average.average(10,list));
	}
	
	@Test
	public void testAverageSolo() {
		int[] list = new int[1];
		list[0] = 12;
		
		assertEquals(0, Average.average(-1,list));
		assertEquals(0, Average.average(0,list));
		assertEquals(12, Average.average(1,list));
		assertEquals(12, Average.average(10,list));
	}
	
	@Test
	public void testAverageLarge() {
		int[] list = new int[5];
		list[0] = 2; //2 =2
		list[1] = 4; //6 = 3
		list[2] = 6; //12 = 4
		list[3] = 12; // 24 = 6
		list[4] = 11; //35 = 7
		
		assertEquals(0, Average.average(-1,list));
		assertEquals(0, Average.average(0,list));
		assertEquals(2, Average.average(1,list));
		assertEquals(3, Average.average(2,list));
		assertEquals(6, Average.average(4,list));
		assertEquals(7, Average.average(5,list));
		assertEquals(7, Average.average(6,list));
	}

}
