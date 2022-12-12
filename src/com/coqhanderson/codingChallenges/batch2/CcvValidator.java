package com.coqhanderson.codingChallenges.batch2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CcvValidator {

    public static void main(String[] args) throws ParseException {

        String expDate = "10/22";


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);   // date format not to be lenient (so we can perform date-expiry validation)
        java.util.Date expiry = simpleDateFormat.parse(expDate);

        System.out.println(expiry);
        System.out.println(expiry.before(new Date()));
    }

    public static boolean isValidCVVNumber(String str)
    {
        // Regex to check valid CVV number.
        String regex = "^\\d{3,4}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null)
        {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()

        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }
}
