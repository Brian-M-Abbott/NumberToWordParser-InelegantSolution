package io.brianabbott.com;


import java.util.Scanner;

/**
 * Created by brianabbott on 6/9/16.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = "";

        while((s = input.nextLine()) != null){
            System.out.println(NumberToWordParser.numberToWordConverter(s));
        }


    }
}
