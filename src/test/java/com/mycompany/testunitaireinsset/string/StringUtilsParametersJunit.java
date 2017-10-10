/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author talend
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilsParametersJunit {
    
    
    private Object[] parametersForTestIsPalindrome() {
        return new Object[][]{
            {"sos", true},
            {"est", false},
            {"ntn", true}
        };
    }
    
    @Test
    @Parameters
    public void testIsPalindrome(String val, boolean expect) {
        
        StringUtils instance = new StringUtils();
        
        Boolean res = instance.isPalindrome(val);
                
        assertEquals(expect, res);
    }
}
