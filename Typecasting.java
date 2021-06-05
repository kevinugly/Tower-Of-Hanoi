import java.io.*;
import java.util.*;

public class Typecasting 
{
    public static void main(String[] args) 
    {
        int intOne = (int) 3.14; //double to int
        System.out.println(intOne); //returns an integer value of 3
        
        int intTwo = Integer.parseInt("2"); //String to int
        System.out.println(intTwo); //returns an integer value of 2
        
        double doubleOne = (double) 3; //int to double
        System.out.println(doubleOne); //returns a double value of 3.0
        
        double doubleTwo = Double.parseDouble("2"); //String to double
        System.out.println(doubleTwo); //returns a double value of 2.0
        
        String stringOne = String.valueOf(309); //int to String
        System.out.println(stringOne); //returns a String value of "309"
        
        String stringTwo = String.valueOf(3.09); //double to String
        System.out.println(stringTwo); // return a String value of "3.09"
    }
}





