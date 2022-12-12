package com.coqhanderson.codingChallenges.batch2;

import java.util.Arrays;


public class PhotoCopy {

    public static int numberOfShops(int[] A) {

        Arrays.sort(A);
        int shops = 0;
        for (int i = 0; i < A.length; i++) {

            if (i == A.length - 1) shops = A[i] + 1;
        }

        return shops;
    }
}
