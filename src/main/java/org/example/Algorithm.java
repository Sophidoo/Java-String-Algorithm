package org.example;

public class Algorithm {
//    Algorithm to display the winner or draw between consonant and vowels
    public String consonantvsvowel(String word){

        int vowelCount = 0;
        int consonantCount = 0;

        String str = word.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowelCount++;
            else
                consonantCount++;
        }

        if(consonantCount > vowelCount) return "Consonant wins";
        if(vowelCount > consonantCount) return "Vowel wins";

        return "draw";
    }

}
