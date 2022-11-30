package com.saurabhshcs.playwithstrings.simple;

public class ReverseString
{
    public String reverse(String text)
    {
        String reverseText = "";
        char ch;

        System.out.println("Original word: "+ text);

        for (int i = 0; i < text.length(); i++)
        {
            ch = text.charAt(i); //extracts each character
            reverseText = ch + reverseText; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + reverseText);
        return reverseText;
    }
}
