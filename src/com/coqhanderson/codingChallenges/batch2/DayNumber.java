package com.coqhanderson.codingChallenges.batch2;

import java.util.ArrayList;

public class DayNumber {


    public int dayNumber(String day){

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int dayNum = -1;
        for(int i=0; i<days.length; i++){
            if(days[i].equals(day)) dayNum = i+1;
        }

        return dayNum;
    }

    // ------------------------------------------------------ //

    public int numberOfDay(String day){

        ArrayList<String> days = new ArrayList<>();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        return days.indexOf(day)+1;
    }
}
