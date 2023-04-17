package org.yup;

public class JavaChallengesApp {

    public static void main (String[] args){

        //this code is running greeting

        //create a new instance of the challenges class, so we can use the challenges in our application
        Challenges challenges = new Challenges();

        //this runs the greeting method from our challenges and returns a string greeting
        //and stores it in the greeting variable we created
        String greeting = challenges.greeting("Eric",20);

        //this prints the greeting to the console
        System.out.println(greeting);

        //code below is running greetingWithUserInput()

        String greetingWithUserInput = challenges.greetingWithUserInput();

        System.out.println(greetingWithUserInput);



        System.out.println(challenges.addTwoNumbers());

        System.out.println(challenges.subtractTwoNumbers());

        System.out.println(challenges.multiplyTwoNumbers());

    }
}