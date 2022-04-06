package com.example.w22comp1008lhw12;

import java.util.Locale;

public class Person {
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.length()>=2 && firstName.length()<=20)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("name invalid - must be 2-20 characters");
    }
}
