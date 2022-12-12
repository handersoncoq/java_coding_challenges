package com.coqhanderson.codingChallenges.batch1;

import java.util.List;

class ArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        int sum=0;

        for(int i:ar){

            sum += i;
        }
        return sum;
    }

}
