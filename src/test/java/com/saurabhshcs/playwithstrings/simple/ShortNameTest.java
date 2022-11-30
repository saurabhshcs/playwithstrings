package com.saurabhshcs.playwithstrings.simple;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShortNameTest
{

    @InjectMocks
    private ShortName shortName = new ShortName();

    @Test
    public void shouldReturnShortNameWhenBigFullName()
    {
        final String fullName = "Vangipurappu Venkata Sai Laxman";

        final String result = shortName.makeit(fullName);

        assertTrue(Boolean.TRUE, result);


    }
}
