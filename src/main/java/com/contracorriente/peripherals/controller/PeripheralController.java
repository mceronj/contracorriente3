package com.contracorriente.peripherals.controller;

import com.contracorriente.peripherals.model.Peripheral;
import com.contracorriente.peripherals.service.UserPeripheral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @Author Monica Ceron JImenez
 * @since 12/12/2021
 */
@RestController
@RequestMapping("/api/peripherals")
@CrossOrigin("*")
public class PeripheralController {

    @Autowired
    private UserPeripheral userPeripheral;

    @GetMapping("/all")
    public List<Peripheral> getAll() {
        return userPeripheral.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Peripheral> getFragance(@PathVariable("reference") String reference) {
        return userPeripheral.getPeripheral(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripheral create(@RequestBody Peripheral peripheral) {
        return userPeripheral.create(peripheral);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripheral update(@RequestBody Peripheral peripheral) {
        return userPeripheral.update(peripheral);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return userPeripheral.delete(reference);
    }

}