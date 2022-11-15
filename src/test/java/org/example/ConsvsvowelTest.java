package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConsvsvowelTest {
    @Test
    void consonantshouldwin(){
        var word = new Algorithm();
        assertEquals("Consonant wins", word.consonantvsvowel("Mitchelle"));
    }

    @Test
    void vowelshouldwin(){
        var word = new Algorithm();
        assertEquals("Vowel wins", word.consonantvsvowel("Ade"));
    }

    @Test
    void consonantandvowelhasadraw(){
        var word = new Algorithm();
        assertEquals("draw", word.consonantvsvowel("sophia"));
    }
}