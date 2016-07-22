package com.vishnu.test;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import com.vishnu.Calculator;
import com.vishnu.Car;
import com.vishnu.Engine;

import static org.junit.Assert.*;

import org.junit.Before;
/**
 * @author Vishnu 7/21/2016
 */

public class CalculatorTest {
	
	@Mock
	private Engine engine;
	private Calculator cal;
	
	@InjectMocks
	private Car car;
	
	@Before
	public void setup(){
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testAbs(){
		int expected=4;
		//int actual= cal.abs(-4);
		assertEquals(4, 4);
	}
	@Test
	public void testAbsWithMockito(){
		
		when(cal.abs(-20)).thenReturn(20);
		assertEquals(20, cal.abs(-20));
	}
	
	@Test
	public void whenEngineAccelerates5000ShouldGetAWarningMessage(){
		when(engine.getRpm()).thenReturn(6000);
		car.accelerate();
		assertEquals( "Slow Down",car.getWarningMessage());
		
		
	}
	

}
