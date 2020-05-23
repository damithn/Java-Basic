package com.damittech.javabasic;

/**
 * @author DAMITH SAMARAKOON on 5/23/2020
 */
public class ReverseString {
    public String reverseString(String inputString) {
        if (inputString == null)
            return null;
        StringBuilder outputString = new StringBuilder();

        int length = inputString.length();

        for (int i = length - 1; i >= 0; i--) {
            outputString.append(inputString.charAt(i));
        }
        return outputString.toString();
    }
}
