/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAI
 */
public class NumberSwaping {
    public static void main(String[] args) {
        int FirstNumber = 10;
        int SecandNumber = 20;
        System.out.println("Befor Swapping " + "FirstNumber = " +FirstNumber +" "+ "SecandNumber = "+SecandNumber);
        FirstNumber  = FirstNumber - SecandNumber;
        SecandNumber = FirstNumber + SecandNumber;
        FirstNumber  = SecandNumber - FirstNumber;
        System.out.println("After Swapping " +  "FirstNumber = " +FirstNumber +" "+ "SecandNumber = "+SecandNumber);
    }
}
