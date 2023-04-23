package com.ml.springwithgraphql.controllers;

import com.ml.springwithgraphql.data.dto.Customer;
import lombok.Data;

@Data
public class CustomerInput {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public Customer getCustomerEntity() {
        return new Customer()
                .setFirstName(this.firstName)
                .setLastName(this.lastName)
                .setEmail(this.email)
                .setPhoneNumber(this.phoneNumber)
                .setAddress(this.address)
                .setCity(this.city)
                .setState(this.state)
                .setZipCode(this.zipCode);
    }
}