package com.saurabhshcs.playwithstrings.simple;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ReverseStringTest
{

    @InjectMocks
    private ReverseString reverseString = new ReverseString();

    @Test
    public void shouldReverseTextWhenInputAnyText(){
        String inputText = "Galaxy";

        String result = reverseString.reverse(inputText);

        assertTrue(Boolean.TRUE, result);

    }

}
