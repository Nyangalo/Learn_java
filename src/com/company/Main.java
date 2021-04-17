package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
     String name= scanner.nextLine();
        System.out.println("My name is " + name);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("I am " + age+ " years old!" );
        System.out.println("what is your favorite food?");
        String food= scanner.next();
        System.out.println("My best food is " + food);




        
    }
}
