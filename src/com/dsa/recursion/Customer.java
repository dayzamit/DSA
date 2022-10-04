package com.dsa.recursion;

public class Customer {

    public Customer(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "custName='" + custName + '\'' +
                '}';
    }

    private final String custName;

}
