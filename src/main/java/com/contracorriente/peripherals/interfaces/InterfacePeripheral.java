/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.contracorriente.peripherals.interfaces;

import com.contracorriente.peripherals.model.Peripheral;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Monica Ceron Jimenez
 * @since December 12 2021
 */
public interface InterfacePeripheral extends MongoRepository<Peripheral, String>{
    
}
