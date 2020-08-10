package com.ordersproject.demo.services;

import com.ordersproject.demo.models.Customer;
import com.ordersproject.demo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "customerServices")
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    CustomersRepository customerrepos;

    @Override
    public Customer save(Customer customer) {
        return customerrepos.save(customer);
    }
}
