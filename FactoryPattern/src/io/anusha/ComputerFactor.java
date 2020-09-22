package io.anusha;

import io.anusha.model.Computer;
import io.anusha.model.Pc;
import io.anusha.model.Server;



public class ComputerFactor {
	
	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

		Computer comp = null;
		switch (type) {
		case PC:
			comp = new Pc(ram, hdd, cpu);
			break;
		case SERVER:
			comp = new Server(ram, hdd, cpu);
			break;
		}

		return comp;
	}
}
