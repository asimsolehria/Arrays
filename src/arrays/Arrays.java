/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter number of Tests of Students!");
        Scanner keyboard=new Scanner(System.in);
        int size=keyboard.nextInt();
        
        int array[]=new int[size];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input marks for all the Tests now ");
            System.out.println("Input Marks for Test "+(i+1));
            array[i]=keyboard.nextInt();
        }
        
        
        int lowest=array[0];
        int highest=array[0];
        int sum=0;
        int average=0;
        for (int i = 0; i < array.length; i++) {
            if (lowest>array[i])
            {
                lowest=array[i];
            }
            
            if(highest<array[i])
            {
                highest=array[i];
            }
            sum+=array[i];
        }
        average=sum/array.length;
        
        
        
        System.out.println("Lowest marks are :"+lowest);
        System.out.println("Highest marks are :"+highest);
        System.out.println("Average marks are :"+ average);
    }
    
    
    
    
}





