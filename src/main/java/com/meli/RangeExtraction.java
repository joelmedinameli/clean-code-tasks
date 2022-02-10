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
        Integer initialPosition = null;
        Integer finalPosition = null;
        Integer nextPosition;

        for (int actualPosition = 0; actualPosition < input.length; actualPosition++) {
            nextPosition = actualPosition + 1;
            if (nextPosition >= input.length){
                outputString += getPrintRangeStructure(input, actualPosition, initialPosition, finalPosition);
                return outputString;
            }
            if (input[nextPosition] == input[actualPosition] + 1) {
                if (initialPosition == null)
                    initialPosition = actualPosition;
                else
                    finalPosition = nextPosition;
            }else{
                outputString += getPrintRangeStructure(input, actualPosition, initialPosition, finalPosition) + ",";
                initialPosition = null;
                finalPosition = null;
            }
        }

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

        return outputString;
    }

    public String getPrintRangeStructure(Integer[] input, Integer actualPosition, Integer initialPosition, Integer finalPosition){
        if (initialPosition != null && finalPosition != null)
            return input[initialPosition] + "-" + input[finalPosition];
        else
            return String.valueOf(input[actualPosition]);
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
