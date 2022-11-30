package com.saurabhshcs.playwithstrings.simple;

public class ShortName
{

    private static final String ACRONYM_SEPERATOR = ".";
    private static final String FULL_NAME_SPLITTER = " ";

    public String makeit(String fullName)
    {
        StringBuilder nameShortner = new StringBuilder();

        String[] names = fullName.split(FULL_NAME_SPLITTER);
        System.out.println("-------------------------------------------------------------");
        System.out.println("===========> Full name before: "+ fullName);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Names length - " + names.length);


        for (int i = 0;  i < names.length-1; i++){

            nameShortner.append(makeShortName(names[i], i));
        }

        System.out.println("===========> Full name after with loop: "+ nameShortner.append(names[names .length-1]));
        return nameShortner.append(names[names .length-1]).toString();
    }

    private String makeShortName(String fullName, Integer index){
        StringBuilder sb = new StringBuilder();
        Integer firstNameLength = fullName.length();

        return sb.append(fullName.substring(0, firstNameLength - (firstNameLength-1))).append(ACRONYM_SEPERATOR).toString();

    }
}
