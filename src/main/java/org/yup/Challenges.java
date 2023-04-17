package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){

        if(age >= 21){

            return "Hello, " + name + ", welcome to the party!";

        }else{
           return "Hello, " + name + ", I'm sorry, but we cannot let you into the party.";
       }
    }

    public String greetingWithUserInput(){

        Scanner theScanner  = new Scanner(System.in);

        //we need to ask the user what their name is
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //we need to ask the user their age
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        //let folks into the party if they are 21 and up
        //politely tell them that the cant enter underage
        if(age >= 21){

            return "Hello, " + name + ", welcome to the party!";

        }else{
            //this is what happens if the condition is false
            return "Hello, " + name + ", I'm sorry, but we cannot let you into the party.";
        }
    }

    public int addTwoNumbers (){

        Scanner theScanner  = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Give me a number please.");
        int number1 = theScanner.nextInt();

        //ask the user for number2
        System.out.print("Give me a number to add to the first number, please.");
        int number2 = theScanner.nextInt();

        return number1 + number2;


    }

    public int subtractTwoNumbers (){

        Scanner theScanner  = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Give me a number please.");
        int number1 = theScanner.nextInt();

        //ask the user for number2
        System.out.print("Give me a number to subtract from your first number, please.");
        int number2 = theScanner.nextInt();

        return number1 - number2;

    }

    public int multiplyTwoNumbers (){

        Scanner theScanner = new Scanner(System.in);


        //ask the user for number1
        System.out.print("Give me a number please.");
        int number1 = theScanner.nextInt();

        //ask the user for number2
        System.out.print("Give me a number to multiply with your first number, please.");
        int number2 = theScanner.nextInt();

        return number1 * number2;


    }
}