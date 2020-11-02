package com.company;

import java.util.Scanner;

public class Exo2 {
    public static void palindrome(){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères: ");
        String userInput = userInputScanner.nextLine();

        int mid = userInput.length() / 2;
        Boolean isPalindrome = false;
        if(userInput.length()%2!=0){
            String part1[] = {userInput.substring(0, mid)};
            String part2[] = {userInput.substring(mid+1)};
            isPalindrome = compareParts(part1[0], part2[0]);
        }else{
            String[] parts = {userInput.substring(0, mid),userInput.substring(mid)};
            isPalindrome = compareParts(parts[0], parts[1]);
        }
        if(isPalindrome){
            System.out.println("This it!");
            return;
        }
    }

    private static Boolean compareParts(String firstPart, String secondPart) {
        StringBuilder stringBuilder = new StringBuilder();
        // append a string into StringBuilder
        stringBuilder.append(secondPart);
        // reverse StringBuilder
        StringBuilder reversedStringBuilder = stringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();
        if(firstPart.equals(reversedString)){
            return true;
        }
        return false;
    }
}
