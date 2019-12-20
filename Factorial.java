
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
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter A Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for(int i =num;i>0;i--)
        {
            fact = fact*i;
        }
        System.out.println(" Factorial is= "+fact);
    }
}
