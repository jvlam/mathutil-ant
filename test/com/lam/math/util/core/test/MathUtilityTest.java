package com.lam.math.util.core.test;

import com.lam.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    
    // ILLEGAL ARGUMENT EXCEPTION /
    // để đo lường, lắng nghe xem có NGOẠI LỆ ĐƯỢC NÉM RA HAY KHÔNG 
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-1);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        // Test case #1: Tình huống xài hàm số 1
        //               Test getF() with n = 0;
        // Expected value: 1
        // Vietsub: kiểm thử xem hàm getF() với 1 tức là tính 1! coi có trả về 1 không . 
        int n = 0;                      // tính 0!
        long expectedValue = 1;         // kỳ vọng trả về 1
        long actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        // Test case #2: test getF() with n = 1
        // Expected value: 1
        // Vietsub: kiểm tra tình huống xài hàm tính 1! coi có trả về 1 hay không?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        // Test case #3: test getF() with n = 2
        // Expected value: 2
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        n = 2;
        expectedValue = 2;
        actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        // Test case #4: test getF() with n = 3
        // Expected value: 6
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        n = 3;
        expectedValue = 6;
        actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        // Test case #5: test getF() with n = 6
        // Expected value: 120
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        n = 5;
        expectedValue = 120;
        actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
    }

}
