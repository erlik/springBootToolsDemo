package com.versusmind.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Address {
    @Id
    private long id;

    private String number;
    private String street;
    private String postalCode;
    private String city;
}
