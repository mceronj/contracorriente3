/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contracorriente.peripherals.repository;

import com.contracorriente.peripherals.interfaces.InterfacePeripheral;
import com.contracorriente.peripherals.model.Peripheral;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Monica Ceron Jimenez
 * @since December 12 2021
 */
@Repository
public class PeripheralRepository {
    @Autowired
    private InterfacePeripheral interfacePeripheral;

    public List<Peripheral> getAll() {
        return interfacePeripheral.findAll();
    }

    public Optional<Peripheral> getPeripheral(String reference) {
        return interfacePeripheral.findById(reference);
    }
    public Peripheral create(Peripheral peripheral) {
        return interfacePeripheral.save(peripheral);
    }

    public void update(Peripheral peripheral) {
        interfacePeripheral.save(peripheral);
    }
    
    public void delete(Peripheral peripheral) {
        interfacePeripheral.delete(peripheral);
    }


}
