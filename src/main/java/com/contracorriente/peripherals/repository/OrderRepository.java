package com.contracorriente.peripherals.repository;

import com.contracorriente.peripherals.interfaces.InterfaceOrder;
import com.contracorriente.peripherals.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Monica Ceron JImenez
 * @since 12/12/2021
 *
 */

@Repository
public class OrderRepository {

    @Autowired
    private InterfaceOrder interfaceOrder;

    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }

    public void delete(Order order) {
        interfaceOrder.delete(order);
    }

    public Optional<Order> lastUserId(){
        return interfaceOrder.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return interfaceOrder.findByZone(zona);
    }


}
