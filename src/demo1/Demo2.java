/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Demo2 {

    public static void main(String[] args) {
        int a, b, result1, result2;
        a = 10;
        b = 32;
        result1 = a + b;
        result2 = a - b;
        if (result1 > 20) {
            System.out.println(result1);
        } else {
            System.out.println("Result <= 20");
        }
    }
}
