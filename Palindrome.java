
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
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Ener a Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp,sum=0;
        temp = num;
        while(num>0)
        {
            int r = num%10;
            sum =(sum*10)+r;
            num = num/10;   
        }
        if(sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
