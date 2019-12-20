
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAI
 */
public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter A Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 ==0)
        {
            System.out.println("Number is Even Number ");
        }
        else
        {
            System.out.println("Number is odd Number");
        }
    }    
}
