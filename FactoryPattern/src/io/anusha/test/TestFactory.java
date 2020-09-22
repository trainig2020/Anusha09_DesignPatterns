package io.anusha.test;

import io.anusha.ComputerFactor;
import io.anusha.ComputerType;
import io.anusha.model.Computer;



public class TestFactory {
	
	public static void main(String[] args) {
		
		
		
			Computer pc = ComputerFactor.createComputer(ComputerType.PC, "1GB", "256GB", "2.4 GHz");

			Computer server = ComputerFactor.createComputer(ComputerType.SERVER, "32GB", "1TB", "2.9 GHz");
			
			System.out.println("Factory PC Config: " +pc);
			System.out.println("Factory Server Config: "+server);
		}
		
		
		
		
	}
	
