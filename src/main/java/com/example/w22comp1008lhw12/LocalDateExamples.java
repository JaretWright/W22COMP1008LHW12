package com.example.w22comp1008lhw12;

import java.time.LocalDate;

public class LocalDateExamples {

    public static void main(String[] args) {
        LocalDate expiryDate = LocalDate.now().plusDays(30);
        String dateToday = "2022-04-06";
        dateToday += "30";
        System.out.println("LocalDate: " + expiryDate);
        System.out.println("String:    " + dateToday);


    }
}
