package com.company;

import java.util.Scanner;

public class Exo2 {
    public static void palindrome(){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String userInput = userInputScanner.nextLine();

        int mid = userInput.length() / 2;
        Boolean isPalindrome = false;
        //Si la String contient un nb de caractères impair
        if(userInput.length()%2!=0){
            //On récupère la partie gauche de la String sans le caractère mid
            String part1[] = {userInput.substring(0, mid)};
            //Puis on décale la récupération de la deuxième partie de String pour omettre le caractère mid
            String part2[] = {userInput.substring(mid+1)};
            isPalindrome = compareParts(part1[0], part2[0]);
        }else{
            //Sinon, on se contente de splitter la String en deux
            String[] parts = {userInput.substring(0, mid),userInput.substring(mid)};
            isPalindrome = compareParts(parts[0], parts[1]);
        }
        if(isPalindrome){
            System.out.println("This it!");
            System.out.println("");
        }else{
            System.out.println("That's not it");
        }
        return;
    }

    private static Boolean compareParts(String firstPart, String secondPart) {
        StringBuilder stringBuilder = new StringBuilder();
        //Ajout la String dans un objet stringBuilder pour bénificier de sa méthode reverse()
        stringBuilder.append(secondPart);
        //Reverse de la chaîne de caractères contenue dans le StringBuilder
        StringBuilder reversedStringBuilder = stringBuilder.reverse();
        //Conversion du StringBuilder en String pour comparaison avec la première partie
        String reversedString = reversedStringBuilder.toString();
        if(firstPart.equals(reversedString)){
            return true;
        }
        return false;
    }
}
