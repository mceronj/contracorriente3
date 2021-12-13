package com.contracorriente.peripherals.interfaces;

import com.contracorriente.peripherals.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Monica Ceron JImenez
 * @since 12/12/20/21
 */

public interface InterfaceOrder extends MongoRepository<Order, Integer> {



    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);


    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);


    Optional<Order> findTopByOrderByIdDesc();

}