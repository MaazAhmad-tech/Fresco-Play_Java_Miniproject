package com.fresco;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;


public class LambdaFn {


    public static boolean isNarcissistic(String num){

        int power =  num.length();
        long n = Long.parseLong(num);
        long copyOfn = n;
        long sum = 0;
        while(copyOfn > 0){
            long r = copyOfn % 10;
            sum += Math.pow(r,power);
            copyOfn /= 10;
        }
        return (sum == n);
    }
    public List<Long> functionalProgramming(List<String> listOfIntegers)
    {
        //Write your code here
        List<Long> outputList = Collections.emptyList();
        outputList =listOfIntegers.stream().filter(x->isNarcissistic(x)).map(s->Long.parseLong(s)).collect(Collectors.toList());
        return outputList;
    }

}