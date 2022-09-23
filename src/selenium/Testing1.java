package selenium;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	//New line added
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
	
	
	//System.out.println("before");
	System.out.println("login");

	}

	@After
	public void tearDown() throws Exception {
	
		//System.out.println("after");
		System.out.println("logout");

	
	}

	// in java due to main method if line 43 fails then it will not execute line 44
	//in junit if line 43 fails then it will not execute after line 43 and test 1 will be failed,
	//however code will be run for test2 and test3 ,  test will pass only and only if the code pass in test
	@Test
	public void test1() {

		System.out.println("Test1");
				System.out.println("logout");
			}
			
			@Test
			public void test2() {

				System.out.println("Test2");
			}
			
			@Test
			public void test3() {

				System.out.println("Test3");
			}

		}