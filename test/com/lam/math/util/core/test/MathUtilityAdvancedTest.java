
package com.lam.math.util.core.test;

import com.lam.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author admin
 */
@RunWith(value = Parameterized.class) 
public class MathUtilityAdvancedTest {
    
    // chuẩn bị data là mảng 2 chiều kiểu Object
    // JUnit tự loop duyệt mảng lôi tách data ra 
    // giúp ta nhồi/fill/đổ vào hàm assertEquals()
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        Object[][] b = {
            {0,1}, 
            {1,1}, 
            {2,2}, 
            {3,6}, 
            {4,24}, 
            {5,120}, 
            {6,720}
        };
        return b;
    }
    
    // map từng cột của từng dòng vào 2 biến tương ứng n và expected 
    @Parameterized.Parameter(value = 1) // map vào cột 1
    public long expected;
    
    @Parameterized.Parameter(value = 0) // map vào cột 0
    public int n;
    
    // so sánh expected và actual 
    // kĩ thuật DDT 
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
