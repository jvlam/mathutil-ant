/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lam.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtility {
    public static final double PI = 3.14;
    
    // hàm getFactorial() là hàm tính n!
    // quy ước: n! = 1 * 2 * 3 * ... * n
    //          0! = 1! = 1
    //          không có giai thừa của số âm!!!
    // Thiết kế của hàm tính gai thừa của chúng ta 
    // - hàm không tính giai thừa âm, nếu đưa âm giai thừa, ==> báo lỗi 
    // - hàm không tính giai thừa quá to, ko tính giai thừa 21 trở lên
    //   vì kiểu long chỉ có tối đa 18 số không, mà 21 giai thừa lớn hơn 18 số 0, tràn kiểu long, tính sai ==> báo lỗi
    // Người QC phải kiểm tra xem hàm có hành xử đúng như thiết kế hay không??? phải test, thử nghiệm các TÌNH HUỐNG XÀI HÀM các TEST CASE  
    public static long getFactorial(int n) {
        if(n < 0 || n >= 21) {
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        }
        if(n == 0 || n == 1) {
            return 1;
        } 
        long product = 1; //tích nhân dồn!!
        for (int i = 2; i <= n; i++) {
            product *=i;
        }
        return product;
    }
}
