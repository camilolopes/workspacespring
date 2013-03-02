package br.com.camilolopes.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CentralMachine {
	@Autowired
	@Qualifier("caixa1")
	private MachineRegister machineRegister;
	@Autowired
	public CentralMachine(MachineRegister machineRegister) {
		super();
		this.machineRegister = machineRegister;
	}

	public void setMachineRegister(MachineRegister machineRegister) {
		this.machineRegister = machineRegister;
	}

	public MachineRegister getMachineRegister() {
		return machineRegister;
	}

	public void register() {
		machineRegister.register();
		
	}
}
