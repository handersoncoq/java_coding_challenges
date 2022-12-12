package com.coqhanderson.codingChallenges.batch2;

import java.util.*;


public class Execute {


    public static void main (String[]args) {
        TreeSet<Double> priceRange = new TreeSet<>();

        priceRange.add(15.1);
        priceRange.add(14.1);

        double buyingPrice = 14.2;


        System.out.println(buyingPrice >= priceRange.first() && buyingPrice <= priceRange.last());
        System.out.println(priceRange.first());
        System.out.println(priceRange.last());

    }
}
