package com.damittech.javabasic.algorithm;

import javax.sound.midi.Soundbank;

/**
 * @author DAMITH SAMARAKOON on 5/28/2020
 */
public class ReverseInteger {
    public void reverse(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                //return 0;
            }

        }
        System.out.println("Reversed Integer Value : "+ reversed);
    }
}
