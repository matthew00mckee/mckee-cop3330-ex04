/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/
package Exercise_04;

import java.util.Scanner;

public class madLib {
    public static void main(String[] args){
        System.out.print("Enter a Noun: ");
        Scanner input = new Scanner(System.in);
        String Noun = input.nextLine();

        System.out.print("Enter a Verb: ");
        String Verb = input.nextLine();

        System.out.print("Enter an Adjective: ");
        String Adjective = input.nextLine();

        System.out.print("Enter an Adverb: ");
        String Adverb = input.nextLine();

        System.out.print("Do you "+ Verb + " your " + Adjective +" "+ Noun + " " + Adverb+ "? lol");

    }
}
