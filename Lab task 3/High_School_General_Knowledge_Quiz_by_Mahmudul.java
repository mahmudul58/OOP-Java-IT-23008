///Mahmudul(ID:IT23008)

import java.util.Scanner;
public class High_School_General_Knowledge_Quiz_by_Mahmudul{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Welcome to the Quiz Game\nDo you want to play?\nIf \"YES\" enter ->\"1\" ,Otherwise enter ->\"2\"");
        int choice =sc.nextInt();
        if(choice==2) break;
        sc.nextLine();
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Hi "+name+"😊. Press \"Enter\" to start");
        sc.nextLine();
        int score=0;
        System.out.println("1.What is the capital of Bangladesh?");
        System.out.println("a.Dhaka\nb.Chattogram\nc.Rajshahi\nd.Barishal");
        System.out.print("Your answer : ");
        String ans1=sc.nextLine();
        if(ans1.equals("a")) {
            score+=5;
            System.out.println("Your answer is correct 😊");
        }
        else {
            score--;
            System.out.println("Your answer is wrong 😭! Correct answer is \"a\"");
        }
        System.out.println("2.What is the largest district of Bangladesh?");
        System.out.println("a.Tangail\nb.Rangamati\nc.Rajshahi\nd.Sylhet");
        System.out.print("Your answer : ");
        String ans2=sc.nextLine();
        if(ans2.equals("b")) {
            score+=5;
            System.out.println("Your answer is correct 😊");
        }
        else {
            score--;
            System.out.println("Your answer is wrong 😭! Correct answer is \"b\"");
        }
        System.out.println("3.What is the national flower of Bangladesh?");
        System.out.println("a.Marigold\nb.Rose\nc.Shapla\nd.Aster");
        System.out.print("Your answer : ");
        String ans3=sc.nextLine();
        if(ans3.equals("c")) {
            score+=5;
            System.out.println("Your answer is correct 😊");
        }
        else {
            score--;
            System.out.println("Your answer is wrong 😭! Correct answer is \"c\"");
        }
        System.out.println("4.On which continent is Bangladesh located ?");
        System.out.println("a.Africa\nb.Asia\nc.Australia\nd.Europe");
        System.out.print("Your answer : ");
        String ans4=sc.nextLine();
        if(ans4.equals("b")) {
            score+=5;
            System.out.println("Your answer is correct 😊");
        }
        else {
            score--;
            System.out.println("Your answer is wrong 😭! Correct answer is \"b\"");
        }
        System.out.println("5.What is the capital of Switzerland?");
        System.out.println("a.Zurich\nb.Bern\nc.New York\nd.Paris");
        System.out.print("Your answer : ");
        String ans5=sc.nextLine();
        if(ans5.equals("a")) {
            score+=5;
            System.out.println("Your answer is correct 😊");
        }
        else {
            score--;
            System.out.println("Your answer is wrong 😭! Correct answer is \"a\"");
        }
        
        System.out.println("You scored "+score+" out of 25");
    }
        sc.close();
    }
}