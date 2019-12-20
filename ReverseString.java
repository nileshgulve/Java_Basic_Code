
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAI
 * 
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter A String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "   ";
        for(int i = str.length()-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse String is="+reverse);
    }
}
