import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class DateDifferenceProviderTest {

	DateDifferenceProvider ddp;

	@Before
	public void init() {
		ddp = new DateDifferenceProvider();
		System.out.println("BEfore");
	}

	@Test
	public void test() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(06, 04, 2011));
	 assertEquals(0, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test1() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 04, 2011));
		assertEquals(12, DateDifference);
      System.out.println(DateDifference);
	}
	
	@Test
	public void test3() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 05, 2011));
		assertEquals(42, DateDifference);
       System.out.println(DateDifference);
	}
	
	@Test
	public void test4() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 06, 2011));
	 assertEquals(73, DateDifference);
         System.out.println(DateDifference); 
	}
	@Test
	public void test5() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2011));
	 assertEquals(256, DateDifference);
         System.out.println(DateDifference); 
  }
	@Test
	public void test6() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2012));
	 assertEquals(622, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test7() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2013));
	 assertEquals(987, DateDifference);
         System.out.println(DateDifference); 
	}
	
	
	@Test
	public void test8() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2113));
	 assertEquals(37511, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test9() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2413));
	 assertEquals(147084, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test10() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2813));
	 assertEquals(293181, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test11() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2011),new MyDate(06, 03, 2011));
	 assertEquals(59, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test12() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2012),new MyDate(06, 03, 2012));
	 assertEquals(60, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test13() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012),new MyDate(06, 03, 2012));
	 assertEquals(29, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test14() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(22, 01, 2012),new MyDate(15, 11, 2012));
	 assertEquals(298, DateDifference);
         System.out.println(DateDifference); 
	}
	
	@Test
	public void test15() {
		long DateDifference = DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012),new MyDate(06, 12, 2012));
	 assertEquals(304, DateDifference);
         System.out.println(DateDifference); 
	}
	
	
	
	
	
	
}
