/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lam.mathutil.main;

import com.lam.mathutil.core.MathUtility;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    // kiểm thử xem hàm getF() có chửi hay không nếu đưa n cà chớn
    public static void testFactorialGivenWrongArgumentThrowsException() {
        
        // Test case #6: test getF() with n = -1;
        // Expected value: quăng lỗi
        
        System.out.println("Test -1: expected: An Illegal Argument Exeption ");
//        MathUtility.getFactorial(-1);
    }
    
    // kiểm thử xem hàm getF() có được viết đúng như thiết kế hay không ??
    // thiết kế: đưa n tử tế từ 0...20 -> tính đc n! đúng như kì vọng 
    //           đưa n cà chớn, < 0 hoặc > 20, chửi
    // ta phải giả lập các cách xài hàm của user/ của ai đó khác
    // cách xài nghĩa là đưa giá trị    
    
    // Mỗi cách xài hàm gọi là 1 test case
    // Quy tắc đặt tên hàm dành cho kiểm thử code
    // 
    public static void testFactorialGivenRightArgumentReturnsWell() {
        
        
        // Test case #1: Tình huống xài hàm số 1
        //               Test getF() with n = 0;
        // Expected value: 1
        // Vietsub: kiểm thử xem hàm getF() với 1 tức là tính 1! coi có trả về 1 không . 
        
        int n = 0;                      // tính 0!
        long expectedValue = 1;         // kỳ vọng trả về 1
        long actualValue = MathUtility.getFactorial(n);
        // so sánh 
        System.out.println("Test" + n + "!: expected: " + expectedValue + " | actual: "  + actualValue);
        
        
        // Test case #2: test getF() with n = 1
        // Expected value: 1
        // Vietsub: kiểm tra tình huống xài hàm tính 1! coi có trả về 1 hay không?
        n = 1;
        expectedValue = 1;
        System.out.println("Test" + n + "!: expected: " + expectedValue + " | actual: "  + actualValue);

        // Test case #3: test getF() with n = 2
        // Expected value: 2
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        System.out.println("Test2!: expected: 2"+" | actual: "+ MathUtility.getFactorial(2));
        
        // Test case #4: test getF() with n = 3
        // Expected value: 6
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        System.out.println("Test3!: expected: 6"+" | actual: "+ MathUtility.getFactorial(3));
        
        // Test case #5: test getF() with n = 6
        // Expected value: 120
        // Vietsub: kiểm tra tình huống xài hàm tính 2! coi có trả về 2 hay không?
        System.out.println("Test5!: expected: 120"+" | actual: "+ MathUtility.getFactorial(5));

    }
    
}
