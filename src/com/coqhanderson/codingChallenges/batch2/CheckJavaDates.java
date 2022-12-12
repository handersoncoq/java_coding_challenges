package com.coqhanderson.codingChallenges.batch2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckJavaDates {

    public static boolean isCardExpired(String expDate) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        java.util.Date expiry = simpleDateFormat.parse(expDate);
        boolean expired = expiry.before(new java.util.Date());

        return expired;
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        if (isCardExpired(input))
        {
            System.out.println("This card has expired");
        } else{
            System.out.println("This card has not expired");
        }
    }
}
