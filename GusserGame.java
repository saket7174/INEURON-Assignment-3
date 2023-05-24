//Enriching the Gusser Game project which i have learned in class Adding the user input feature in it 
// package com.practice;
import java.util.Arrays;
import java.util.Scanner;
// public class GusserGame {
    // public static void main(String[] args) {
        class Person{
     int num;
     int personVal(){
        Scanner r = new Scanner (System.in);
        System.out.println("WELCOME TO GUSSER GAME\n guss anumberbetween 0-10");
        num = r.nextInt();
        return num;
     }   
    }
    class Human {
        int [] ar = new int [3];
        int [] humanVal(){
            Scanner r = new Scanner (System.in);
            for (int i=0;i<3;i++){
            System.out.printf("Player %d : Guess the number ",i+1);
            ar[i]=r.nextInt();
        }
        System.out.print("Values guessed by player are:");
        System.out.print(Arrays.toString(ar));
        return(ar);
    }}
    class Comparision {
        Person p = new Person();
        Human h = new Human ();
        boolean flag= false;

        int guess =p.personVal();
        int [] humanGuess=h.humanVal();

        void compareVal(){
            if (guess<0||guess>10){
                System.out.println("\n Invalid Input ! enter the number b/w 0-10");

            }else{
                for (int i=0;i<3;i++){
                    if (guess ==humanGuess[i]){
                        System.out.printf("\n congrats! player %d won the game ",i+1);
                        flag = true;
                    }}}
                    System.out.println();
                    if (flag!=true){
                        System.out.println("Wrong answer ! Try again Later");
                    }
                    }
                }
                public class GusserGame {
                public static void main(String[] args) {
                    Comparision c= new Comparision();
                    c.compareVal();
                }
            }

        