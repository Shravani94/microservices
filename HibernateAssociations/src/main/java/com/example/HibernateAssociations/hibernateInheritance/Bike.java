package com.example.HibernateAssociations.hibernateInheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE")
public class Bike extends Vehicle{
    private boolean hasGear;
}
