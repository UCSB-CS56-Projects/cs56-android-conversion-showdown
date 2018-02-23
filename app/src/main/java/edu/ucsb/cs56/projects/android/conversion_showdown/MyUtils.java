package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Checks appropriate input
 * Created by UMARU on 7/15/2016.
 */

public class MyUtils {

    //The characters shown are basically what are allowed
    final public static ArrayList<Character> symbols = new ArrayList<>(Arrays.asList(new Character[]{
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'
        }));

    static TreeSet<Integer> baseWhiteList = new TreeSet<Integer>(){
        {
            add( 2 );
            add( 8 );
            add( 10 );
            add( 16 );
        }
    };
    public static void hideSoftKeyBoard(View view, InputMethodManager imm){
        if ( view != null ) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void startNoHistoryAcitivity(Activity acc, Intent intent){
        intent.setFlags(intent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        acc.startActivity( intent );
    }

    /**
     * Checking if a value is entered and that it is an appropriate value.
     * symbols are defined above to be the arraylist of characters that are allowed
     * lower cases and upper cases are both okay
     * @param sAnswer
     * @param radix
     * @return
     * @throws IntOverFlow
     */


    public static boolean sanity_check( String sAnswer, int radix ) throws IntOverFlow, SanityCheckException{
        if (sAnswer.length() == 0 || sAnswer.length() > 15){
            throw new IntOverFlow();
        }
        char[] answerChars = sAnswer.toCharArray();
        boolean isValid = false;
        if(answerChars[0]=='0' && answerChars.length!=1){
            throw new SanityCheckException();
        } else {
            for (char c : answerChars) {
                isValid = false;
                for (int i = 0; i < radix; ++i) {
                    Character target = symbols.get(i);
                    if ((target.equals(c)) |
                            (target.isLetter(target) && Character.toLowerCase(target) == c)) {
                        isValid = true;
                        break;
                    }
                }
                if (!isValid)
                    throw new SanityCheckException();
            }
        }
        return isValid;

    }
}
