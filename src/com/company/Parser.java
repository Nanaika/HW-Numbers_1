package com.company;

public class Parser {


    public int parseArray(int[] inArray) {


        int max = inArray[1];
        int min = inArray[0];
        int count = 0;

        if (inArray[0] > inArray[1]) {
            min = inArray[1];
            max = inArray[0];
        }

        for (int i = 2; i < inArray.length; i++) {

            if (inArray[i] > min && inArray[i] < max) {
                count++;
            }

        }
        return count;

    }


}
