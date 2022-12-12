package com.coqhanderson.codingChallenges.batch2;

import java.util.Arrays;

public class ArrayElementDeletion {

    // we want to move all elements down the target index (right to left) one index up
    // by assigning the elements to the previous indexes starting from
    // one index prior to the target index
    // then replace the last element with zero
    public static Integer[] delete(Integer[] array, int index){

        // do not remove element if index is out of bound
        if(index >= array.length) throw new IndexOutOfBoundsException("No such index exists in the given array.");

        // new array to return
        Integer[] newArray = new Integer[array.length-1];

        // using System.array instead of a for loop
        if (array.length - 1 - index >= 0)
           System.arraycopy(array, index + 1, array, index, (array.length - 1 - index));

        // set last element to null
        array[array.length-1] = null;

        // copy to new array
        System.arraycopy(array, 0, newArray, 0, array.length - 1);

        return newArray;

    }

    public static String[] delete(String[] array, int index){

        // do not remove element if index is out of bound
        if(index >= array.length) throw new IndexOutOfBoundsException("No such index exists in the given array.");

        // new array to return
        String[] newArray = new String[array.length-1];

        // using System.array instead of a for loop
        if (array.length - 1 - index >= 0)
            System.arraycopy(array, index + 1, array, index, (array.length - 1 - index));

        // set last element to null
        array[array.length-1] = null;

        // copy to new array
        System.arraycopy(array, 0, newArray, 0, array.length - 1);

        return newArray;

    }

    public static void main(String[] args) {
        Integer[] array = {2, 3, 4, 7};
        System.out.println(Arrays.toString(delete(array, 1)));
    }
}
