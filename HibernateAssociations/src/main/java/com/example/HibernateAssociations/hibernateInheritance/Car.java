package com.example.HibernateAssociations.hibernateInheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")
public class Car extends Vehicle{
    private int numSeats;
}
