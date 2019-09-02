package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt(); //or sc.nextLine() for String
        int currentYear = 2019;
        int yearBornIn = currentYear - age;
        System.out.println("You are: " + age + " years old");

        System.out.println("You are born in the year: " + yearBornIn);

        if (age >= 18){
            //todo continue from here
            System.out.println("Have you coded java?");
            String answer = sc.next();
            System.out.println("You answered: " + answer);
            if (answer.equalsIgnoreCase("Yes")){
                System.out.println("Good Job!");
            } else {
                System.out.println("I know one java course...");
            }
        }

        // todo calculate and print which year person was born in
        // todo if person is 18+ ask them whether they have coded java
        // todo if yes, print respect, if no, print good luck
        // todo we will use scanner only in this project, but it's a new thing you can google about a bit
    }
}
