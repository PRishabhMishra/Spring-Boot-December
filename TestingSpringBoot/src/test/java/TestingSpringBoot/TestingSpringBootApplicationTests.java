package TestingSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestingSpringBootApplicationTests {
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {


	}

	@Test
	void testSum() {

		int expectedResult = 10;
		//actualResult
		int actualResult = c.doSum(12, 3, 2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct(){
		int expectedResult = 10;
		int actualResult = c.doProduct(2,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testCompare(){
		//actualResult
		Boolean actualResult = c.compareToNums(3,3);
		assertThat(actualResult).isTrue();
	}
}
