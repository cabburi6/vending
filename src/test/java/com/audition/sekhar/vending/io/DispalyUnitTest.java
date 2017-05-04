package com.audition.sekhar.vending.io;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.audition.sekhar.vending.state.MachineState;

public class DispalyUnitTest {

	private DisplayUnit displayUnit;
    private MachineState machineState;
	
	@Before
	public void setUp(){
		displayUnit = new DisplayUnit();
		machineState = new MachineState();
	}

	@Test
	public void shouldDisplayMessage(){
		String message = machineState.getState().getMessage();
		assertEquals(message, "INSERT COIN");
	}







}

	
