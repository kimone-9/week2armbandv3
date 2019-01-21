package armband;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void shouldCalculateProduct()
	{
		Calculator calc = new Calculator();
		int result=calc.multiply(4,3,2);
		assertEquals(24,result,0);
	}

}
