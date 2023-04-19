package org.yup;
import java.util.Scanner;

public class Challenges {
    public String greeting(String name, int age){

        if(age >= 21){
            return "Hello, " + name + ", welcome to the party!";

        }else{
           return "Hello, " + name + ", I'm sorry, but we cannot let you into the party.";
       }}
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
        }}
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
    public int interactiveCalculator() {
     //fire up scanner so we can use it
     Scanner theScanner = new Scanner(System.in);

     // displays some set of choices to the user
     System.out.println("Welcome to the calculator!");
     System.out.println("Press 1 to add numbers");
     System.out.println("Press 2 to subtract numbers");
     System.out.println("Press 3 to multiply numbers");
     System.out.print("Enter your selection and press ENTER");

     //this sits and waits for the user to give (1,2,3).
     //when they hit enter their selection is stored in userSelection
     int userSelection = theScanner.nextInt();

     //creating a variable to store the result of the math
     int result;

     //
     switch (userSelection) {
         case 1:
             result = this.addTwoNumbers();
             break;
         case 2:
             result = this.subtractTwoNumbers();
             break;
         case 3:
             result = this.multiplyTwoNumbers();
             break;
         default:
             System.out.println("The user chose nonsense(didn't exist as a choice)");
             return 0;
     }

     return result;

 }
    public String coinFlip() {

        //attempt to flip a coin
        //return heads or tails

        //this is where we flip the coin
        if (Math.random() > .5) {
            //here is where we return heads in the number generated was > .5
            return "heads";
        } else {
            //there is where we return if the number generated was less than .5
            return "tails";
        }
    }
    public String findTheBiggestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner  = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("Give me the first number please:");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("Now give me the second number please:");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;

    }
    public String findTheSmallestNumber(){

        //ref the above method to make one that finds the smallest of 2 numbers

            //this is the scanner that lets us take input from the user
            Scanner theScanner  = new Scanner(System.in);

            //this is where we ask the user for input
            System.out.print("Give me the first number please:");
            //this is where we capture that input and store it in a variable called firstNumber
            int firstNumber = theScanner.nextInt();

            //this is where we ask the user for input
            System.out.print("Now give me the second number please:");
            //this is where we capture that input and store it in a variable called secondNumber
            int secondNumber = theScanner.nextInt();

            int theSmallestNumber = Math.min(firstNumber, secondNumber);

            return "The smallest number between " + firstNumber + " and " + secondNumber + " is: " + theSmallestNumber;

        }
    public String findTheDifferenceBetweenTwoNumbers(){

        Scanner theScanner  = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("Give me the first number please:");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("Now give me the second number please:");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = theScanner.nextInt();

        int diff;

        if (firstNumber < secondNumber){

            diff = secondNumber - firstNumber;

        }else{

            diff = firstNumber - secondNumber;

        }
        return "The difference between " + firstNumber + " and " + secondNumber + " is: " + diff;

    }

    public String convertToUppercase(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided " + theWord + " and we converted it to: " + theWord.toUpperCase();

    }

    //convertToLowercase - works like convertToUppercase and return some text that shows us the word is converted
    public String convertToLowercase(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Provide a word to convert to all LOWERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided " + theWord + " and we converted it to: " + theWord.toLowerCase();

    }

    //lengthOfWord - return sth that lets us know how long the word provided was/is
    public String length(){

        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter the text you would like the character count for: ");
        String text = theScanner.nextLine();

        return "The character count for " + text + " is " + text.length();

    }

}