package com.stackroute;
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSum
{
    String reverseStr(String str)
    {
        int i;
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        String rev = "";
        for(i=tempArray.length-1; i>=0; i--)
        {
            /*Your code here*/
        }
        System.out.println("Sorted number in non-increasing order : " + rev);
        return rev;
    }
    public static int CalculateSum(String str)
    {
        int i, sum = 0;
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        String rev = "";
        for(i=tempArray.length-1; i>=0; i--)
        {
            if(Character.getNumericValue(tempArray[i])%2 == 0)
            {
                /*Your code here*/
            }
        }
        System.out.println("Sum of even numbers : " + sum);
        return sum;
    }
    public static boolean checkSum(int sum)
    {
        if(sum > 15)
        {
        /*Your code here*/
        }
        else
        {
            /*Your code here*/
        }
    }
   boolean  checkIt(String str)
    {
        int sum = 0;

        if(str.matches("[0-9]+"))
        {
           /*Your code here*/
        }
        else{
            return false;
        }
    }
}
