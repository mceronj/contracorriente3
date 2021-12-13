package com.contracorriente.peripherals;

import com.contracorriente.peripherals.interfaces.InterfacePeripheral;
import com.contracorriente.peripherals.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class PeripheralsApplication implements CommandLineRunner {
	@Autowired
    private InterfacePeripheral interfacePeripheral;
	@Autowired
    private InterfaceUser interfaceUser;


	public static void main(String[] args) {
		SpringApplication.run(PeripheralsApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        interfacePeripheral.deleteAll();
        interfaceUser.deleteAll();
    }

}
