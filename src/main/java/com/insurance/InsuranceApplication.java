package com.insurance;

import com.insurance.model.Customer;

public class InsuranceApplication {
    public static void main(String[] args){
        Customer customer = new Customer(
                        1L,
                        "Riya",
                        "riya@example.com",
                        "9876543210"
                );

        System.out.println(customer);

    }
}
