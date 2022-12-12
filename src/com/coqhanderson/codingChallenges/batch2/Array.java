package com.coqhanderson.codingChallenges.batch2;

public class Array {

    // this class is to mimic the data structure of an array
    // but it's dynamic

    // attributes
    private int numberOfitem;
    private int[] intValue;
    private String[] stringValue;

    // constructors
    public Array(int length) {
        intValue = new int[length];
        stringValue = new String[length];
    }


    // method to get length
    public int length(){
        return numberOfitem;
    }

    // methods to insert
    public void insert(int integer){
        if(intValue.length == numberOfitem) {
            int[] newArray = new int[numberOfitem * 2];

            for(int i = 0; i<numberOfitem; i++){
                newArray[i] = intValue[i];
            }

            intValue = newArray;
        }

        intValue[numberOfitem] = integer;
        numberOfitem++;
    }

    public void insert(String string){
        if(stringValue.length == numberOfitem) {
            String[] newArray = new String[numberOfitem * 2];

            for(int i = 0; i<numberOfitem; i++){
                newArray[i] = stringValue[i];
            }

            stringValue = newArray;
        }

        stringValue[numberOfitem] = string;
        numberOfitem++;
    }

    // method to remove
    public void removeInt(int index) {

        for (int i = index; i < numberOfitem; i++) {
            intValue[i] = intValue[i+1];
        }

        numberOfitem--;
    }

    public void removeString(int index) {

        for (int i = index; i < numberOfitem; i++) {
            stringValue[i] = stringValue[i+1];
        }

        numberOfitem--;
    }

    // methods to print
    public void printInt(){
        for(int i=0; i<numberOfitem; i++){
            System.out.print(intValue[i] + " ");
        }
    }

    public void printString(){
        for(int i=0; i<numberOfitem; i++){
            System.out.print(stringValue[i] + " ");
        }
    }

}
