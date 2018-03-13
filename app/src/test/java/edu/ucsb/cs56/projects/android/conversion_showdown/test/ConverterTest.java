package edu.ucsb.cs56.projects.android.conversion_showdown.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.ucsb.cs56.projects.android.conversion_showdown.Converter;

/**
 * Created by UMARU on 7/26/2016.
 */
public class ConverterTest {
    @Before
    public  void setUp() throws Exception{
    }

    //decimal to...
    @Test
    public void testToHex() throws Exception {
        Converter convertor = new Converter("10", 10);
        assertEquals( "a", convertor.toHex() );
    }

    @Test
    public void testToOct() throws Exception {
        Converter convertor = new Converter("10", 10);
        assertEquals( "12", convertor.toOct() );
    }

    @Test
    public void testToDec() throws Exception {
        Converter convertor = new Converter("10", 10);
        assertEquals( "10", convertor.toDec() );
    }

    @Test
    public void testToBin() throws Exception {
        Converter convertor = new Converter("10", 10);
        assertEquals( "1010", convertor.toBin() );
    }

    //binary to...
    @Test
    public void testToHex2() throws Exception {
        Converter convertor = new Converter("11010", 2);
        assertEquals( "1a", convertor.toHex());
    }
    @Test
    public void testToOct2() throws Exception {
        Converter convertor = new Converter("11010", 2);
        assertEquals( "32", convertor.toOct() );
    }

    @Test
    public void testToDec2() throws Exception {
        Converter convertor = new Converter("11010", 2);
        assertEquals( "26", convertor.toDec() );
    }

    @Test
    public void testToBin2() throws Exception {
        Converter convertor = new Converter("11010", 2);
        assertEquals( "11010", convertor.toBin() );
    }

    // Add More Tests, KM/CZ 3/12/2018
    //octal to...
    @Test
    public void testToBin8() throws Exception {
        Converter convertor = new Converter("74", 8);
        assertEquals( "111100", convertor.toBin() );
    }

    @Test
    public void testToHex8() throws Exception {
        Converter convertor = new Converter("74", 8);
        assertEquals( "3c", convertor.toHex() );
    }

    @Test
    public void testToDec8() throws Exception {
        Converter convertor = new Converter("74", 8);
        assertEquals( "60", convertor.toDec() );
    }

    @Test
    public void testToOct8() throws Exception {
        Converter convertor = new Converter("74", 8);
        assertEquals( "74", convertor.toOct() );
    }

    //hexadecimal to...
    @Test
    public void testToBin16() throws Exception {
        Converter convertor = new Converter("F12", 16);
        assertEquals( "111100010010", convertor.toBin() );
    }

    @Test
    public void testToDec16() throws Exception {
        Converter convertor = new Converter("F12", 16);
        assertEquals( "3858", convertor.toDec() );
    }

    @Test
    public void testToOct16() throws Exception {
        Converter convertor = new Converter("F12", 16);
        assertEquals( "7422", convertor.toOct() );
    }

    @Test
    public void testToHex16() throws Exception {
        Converter convertor = new Converter("F12", 16);
        assertEquals( "f12", convertor.toHex() );
    }
}