import java.io.*;
import java.util.*;

public class HW4
{
    public static void main(String[] args) 
    {
        //args [0] = Number of Pegs
        //args[1] = Number of Disks
        //args[2] = Output File Name
        
        Formatter file;
        PrintWriter pw = null;
        try
        {
            file = new Formatter(args[2]);
            pw = new PrintWriter(new FileOutputStream(args[2]));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }
        
        switch(args[0])
        {
            case "3":
            threePegs(Integer.parseInt(args[1]), "A", "B", "C", pw);
            break;
            
            case "4":
            fourPegs(Integer.parseInt(args[1]), "A", "B", "C", "D", pw);
            break;
            
            case "5":
            //fivePegs(Integer.parseInt(args[1]), "A", "B", "C", "D", "E", pw);
            break;
            
            default:
            System.out.println("The number of pegs you have inputted is not 3, 4, or 5.");
            System.exit(0);
        }
        pw.close();
    }
    
    public static void threePegs(int numOfDiscs, String first, String middle, String last, PrintWriter pw)
    {
        if(numOfDiscs == 1) 
        {
           pw.println(numOfDiscs + " " + first + " " + last);
        } 
        else 
        {
           threePegs(numOfDiscs - 1, first, last, middle, pw);
           pw.println(numOfDiscs + " " + first + " " + last);
           threePegs(numOfDiscs - 1, middle, first, last, pw);
        }
    }
  
    public static void fourPegs(int numOfDiscs, String first, String second, String third, String last, PrintWriter pw)
    {
        if(numOfDiscs == 0) 
        {
            return;
        }
        
        if(numOfDiscs == 1) 
        { 
            pw.println(numOfDiscs + " " + first + " " + last);
            return;
        } 
        else
        {
            fourPegs(numOfDiscs - 2, first, third, last, second, pw);
            pw.println((numOfDiscs - 1) + " " + first + " " + third);
            pw.println(numOfDiscs + " " + first + " " + last);
            pw.println((numOfDiscs - 1) + " " + third + " " + last);
            fourPegs(numOfDiscs - 2, second, first, third, last, pw);
        }
    }
    
    public static void fivePegs(int numOfDiscs, String first, String second, String third, String fourth, String last, PrintWriter pw)
    {
        
    }
}