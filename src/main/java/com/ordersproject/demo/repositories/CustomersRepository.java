package com.ordersproject.demo.repositories;

import com.ordersproject.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository <Customer, Long> {
}
