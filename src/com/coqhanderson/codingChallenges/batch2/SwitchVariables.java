package com.coqhanderson.codingChallenges.batch2;

import java.util.Arrays;

public class SwitchVariables {

    public static int[] switchUp(int num1, int num2){

        num2 = num2 - num1;     // remove num1 from num2
        num1 = num2 + num1;     // add back what we removed from num2
        num2 = num1 - num2;     // remove back what we added to num1

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(switchUp(1175, 77333333)));
    }
}
