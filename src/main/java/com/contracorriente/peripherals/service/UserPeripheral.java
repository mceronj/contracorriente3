/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contracorriente.peripherals.service;

import com.contracorriente.peripherals.repository.PeripheralRepository;
import com.contracorriente.peripherals.model.Peripheral;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Monice Ceron Jimenez
 * @since December 12 2021
 */
@Service
public class UserPeripheral {
     @Autowired
    private PeripheralRepository peripheralRepository;

    public List<Peripheral> getAll() {
        return peripheralRepository.getAll();
    }

   public Optional<Peripheral> getPeripheral(String reference) {
        return peripheralRepository.getPeripheral(reference);
    }

    public Peripheral create(Peripheral peripheral) {
        if (peripheral.getReference() == null) {
            return peripheral;
        } else {
            return peripheralRepository.create(peripheral);
        }
    }

    public Peripheral update(Peripheral peripheral) {

        if (peripheral.getReference() != null) {
            Optional<Peripheral> peripheralDb = peripheralRepository.getPeripheral(peripheral.getReference());
            if (!peripheralDb.isEmpty()) {
                
                if (peripheral.getBrand()!= null) {
                    peripheralDb.get().setBrand(peripheral.getBrand());
                }
                
                if (peripheral.getCategory() != null) {
                    peripheralDb.get().setCategory(peripheral.getCategory());
                }

                if (peripheral.getDescription() != null) {
                    peripheralDb.get().setDescription(peripheral.getDescription());
                }
                if (peripheral.getPrice() != 0.0) {
                    peripheralDb.get().setPrice(peripheral.getPrice());
                }

                if (peripheral.getQuantity() != 0) {
                    peripheralDb.get().setQuantity(peripheral.getQuantity());
                }
                if (peripheral.getPhotography() != null) {
                    peripheralDb.get().setPhotography(peripheral.getPhotography());
                }
                peripheralDb.get().setAvailability(peripheral.isAvailability());
                peripheralRepository.update(peripheralDb.get());
                return peripheralDb.get();
            } else {
                return peripheral;
            }
        } else {
            return peripheral;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getPeripheral(reference).map(peripheral -> {
            peripheralRepository.delete(peripheral);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    

}
