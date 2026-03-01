
package com.example.autowire.type;

public class Car {
    private Specification specification;
//injected and set by name first finds the bean with specification and injects using setter
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details:" +specification.toString());
    }
}
