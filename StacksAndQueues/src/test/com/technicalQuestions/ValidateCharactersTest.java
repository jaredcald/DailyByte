package com.technicalQuestions;

/*
"(){}[]", return true
"(({[]}))", return true
"{(})", return false
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateCharactersTest {
    public ValidateCharacters validateCharacters = new ValidateCharacters();

    @Test
    public void ValidateCharactersTest1() {
        String s = "(){}[]";
        boolean result = validateCharacters.validate(s);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest2() {
        String s = "(({[]}))";
        boolean result = validateCharacters.validate(s);

        assertTrue(result);
    }

    @Test
    public void ValidateCharactersTest3() {
        String s = "{(})";
        boolean result = validateCharacters.validate(s);

        assertFalse(result);
    }

}
