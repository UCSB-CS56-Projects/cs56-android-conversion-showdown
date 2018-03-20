package edu.ucsb.cs56.projects.android.conversion_showdown.test;

import org.junit.Test;

import edu.ucsb.cs56.projects.android.conversion_showdown.IntOverFlow;
import edu.ucsb.cs56.projects.android.conversion_showdown.MyUtils;
import edu.ucsb.cs56.projects.android.conversion_showdown.SanityCheckException;

import static org.junit.Assert.*;

/**
 * Created by UMARU on 7/12/2016. Modified by Claudia Zeng and Kerry Mo on 02/25/2018.
 * This class contains test cases that use the sanity check function for each sample string in a specific base,
 * and check if the sanity check function returns the expected boolean value. Run the test simply by
 * right clicking the test in Project display and select “Run ‘QuizTest’”, then just wait for the test result.

 */

public class QuizTest {
    @Test
    public void sanity_check_hex_1() {
        String hex_s = "NEWFNHEOL23KWM1DJO";
        try {
            boolean res = MyUtils.sanity_check(hex_s, 16);
            boolean ans = false;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_hex_2() {
        try {
            String hex_s = "12ABCDE";
            boolean res = MyUtils.sanity_check(hex_s, 16);
            boolean ans = true;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_bin_1() {
        try {
            String bin_s = "1231231aAASAD";
            boolean res = MyUtils.sanity_check(bin_s, 2);
            boolean ans = false;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_bin_2() {
        try {
            String bin_s = "100101101110";
            boolean res = MyUtils.sanity_check(bin_s, 2);
            boolean ans = true;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_dec_1() {
        try {
            String dec_s = "1abcg546";
            boolean res = MyUtils.sanity_check(dec_s,10);
            boolean ans = false;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_dec_2() {
        try {
            String dec_s = "1234";
            boolean res = MyUtils.sanity_check(dec_s,10);
            boolean ans = true;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_oct_1() {
        try {
            String oct_s = "16ah";
            boolean res = MyUtils.sanity_check(oct_s,8);
            boolean ans = false;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_oct_2() {
        try {
            String oct_s = "140";
            boolean res = MyUtils.sanity_check(oct_s,8);
            boolean ans = true;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    // Add More Tests, KM/CZ 3/12/2018
    @Test
    public void sanity_check_hex_3() {
        try {
            String hex_s = "fe5be";
            boolean res = MyUtils.sanity_check(hex_s, 16);
            boolean ans = true;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_hex_4() {
        try {
            String hex_s = "-12FE";
            boolean res = MyUtils.sanity_check(hex_s, 16);
            boolean ans = false;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_bin_3() {
        try {
            String bin_s = "-1001";
            boolean res = MyUtils.sanity_check(bin_s, 2);
            boolean ans = false;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_bin_4() {
        try {
            String bin_s = "111111100101";
            boolean res = MyUtils.sanity_check(bin_s, 2);
            boolean ans = true;
            assertEquals(ans, res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_dec_3() {
        try {
            String dec_s = "fkjk3b4";
            boolean res = MyUtils.sanity_check(dec_s,10);
            boolean ans = false;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_dec_4() {
        try {
            String dec_s = "-16454";
            boolean res = MyUtils.sanity_check(dec_s,10);
            boolean ans = true;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_oct_3() {
        try {
            String oct_s = "-16";
            boolean res = MyUtils.sanity_check(oct_s,8);
            boolean ans = false;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }

    @Test
    public void sanity_check_oct_4() {
        try {
            String oct_s = "740";
            boolean res = MyUtils.sanity_check(oct_s,8);
            boolean ans = true;
            assertEquals(ans,res);
        } catch (IntOverFlow e) {
            assert false;
        } catch (SanityCheckException e){
            assert false;
        }
    }
}
