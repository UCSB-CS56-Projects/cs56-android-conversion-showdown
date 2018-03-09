package edu.ucsb.cs56.projects.android.conversion_showdown;

/**
 * Created by UMARU on 7/27/2016.
 */

//Deals with conversion between bases in application
public class Converter {
    Integer num = -1 ;
    boolean isValid = true;

    /**
     * S is a String representing a decimal number, and this method checks the validity of the request to change its base.
     * If the value of this number exceeds the bound of int, then a IntOverFlow exception will be thrown.
     * @param s
     * @param base
     * @throws IntOverFlow
     */
    public Converter(String s , int base) throws IntOverFlow, SanityCheckException {
        if (!MyUtils.sanity_check(s, base)) {
            isValid = false;
            return;
        }
        this.num = Integer.parseInt(s , base);
    }

    public String toHex(){
        return Integer.toHexString(this.num);
    }

    public String toOct(){
        return Integer.toOctalString(this.num);
    }

    public String toDec(){
        return Integer.toString(this.num);
    }

    public String toBin(){
        return Integer.toBinaryString(this.num);
    }

    public String toBase(int base){
        switch(base){
            case(2):
                return toBin();
            case(8):
                return toOct();
            case(10):
                return toDec();
            case(16):
                return toHex();
        }
        return null;
    }

}
