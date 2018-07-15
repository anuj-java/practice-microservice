package com.sample.ms.application.model;

/**
 * Created by akothiyal on 15/07/2018.
 */
public class Customer {

    private String name;
    private Address address;
    private Integer age;
    private String gender;

    public Customer(String name, Address address, Integer age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
