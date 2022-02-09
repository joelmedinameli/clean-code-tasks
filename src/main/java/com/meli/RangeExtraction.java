package com.meli;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
    /**
     * Rules:
     * - Always receive a sorted array
     * - The list has ascendant order ({1,2,-1,3,4}) Rigth number always is mayor as left number in the array
     * - Can exists negative numbers
     * - A range is composed by 3 sequential numbers as minimum
     * - No sequential numbers must be returned as a single number
     * - The input array has maximum length of Integer.MAX_VALUE
     */
    public String solution(Integer[] input) {
        String outputString = "";
        if (input.length == 1) {
            outputString = String.valueOf(input[0]);
        } else {
            /*List<Integer> subList = new ArrayList<>(input[0]);
            for (int i = 1; i < input.length; i++) {
                if (subList.get(subList.size() - 1) == input[i] + 1) {
                    subList.add(input[i]);
                } else {
                    if (subList.size() >= 3) {
                        if(outputString.equals("")) {
                            outputString = subList.get(0) + "-" + subList.get(subList.size() - 1);
                        } else {
                            outputString += "," + subList.get(0) + "-" + subList.get(subList.size() - 1);
                        }
                    }

                    subList = new ArrayList<>(input[i]);
                }
            }*/


            for (int i = 0; i < input.length; i++) {
                if((i + 1) > input.length)
                if (input[i + 1] > input[i]) {
                    outputString += input[i] + "-";
                }else{
                    outputString += "," + input[i];
                }
            }
        }

        return outputString;
    }

    //ignoren esto
    /*
    public boolean isSequence( Integer[] sequence ){
        int firstNumber = sequence[0];
        for( int i = 1; i < sequence.length; i++ ){
            if( ( sequence[i] == firstNumber + i ) ){
                break;
            }
        }
        return false;
    }
    */
}
