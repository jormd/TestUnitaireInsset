/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class StringUtilsTest {
    
    StringUtils instance;
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.instance = new StringUtils();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        String valide = "aee";
        
        assertTrue(this.instance.isChaineValide(valide));
        
    }
    
        @Test
    public void testIsChaineValide2Lettre() {
        String valide = "ae";
        
        assertTrue(this.instance.isChaineValide(valide));
        
    }
    
        @Test(expected = IllegalArgumentException.class)
    public void testIsChaineInValide() {
        String invalide = "e";
        
        assertTrue(this.instance.isChaineValide(invalide));
        
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        String inverse = "bonjour";
        
        assertEquals("ruojnob", this.instance.inverse(inverse));
    }
    
    @Test
    public void testInverseUneLettre() {
        String inverse = "b";
        
        assertEquals("b", this.instance.inverse(inverse));
    }
    
    @Test
    public void testInverseAucuneLettre() {
        String inverse = "";
        
        assertEquals("", this.instance.inverse(inverse));
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        String palindrome ="sos";
                
        assertTrue(this.instance.isPalindrome(palindrome));
    }
    
    @Test
    public void testIsNotPalindrome() {
        String palindrome ="est";
                
        assertFalse(this.instance.isPalindrome(palindrome));
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        String occurence = "sos";
        
        Map<String, Integer> result = new HashMap<>();
        result.put("s", 2);
        result.put("o", 1);

        
        Map<String, Integer> res = this.instance.compterOccurences(occurence);
       
        
        assertEquals(result, res);

    }
    
     @Test
    public void testCompterOccurences2() {
        String occurence = "azerty";
        
        Map<String, Integer> res = this.instance.compterOccurences(occurence);
       
        assertEquals(6, res.size());
    }
    
}
