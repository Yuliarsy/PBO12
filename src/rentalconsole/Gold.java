/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Yulia Rakhmah
 */
public class Gold extends Silver {
    
    int cashback;
    
    Gold() {
        rentCost = 30000;
        point = 5;
        disc = 2;
        cashback = 5000;
    }
}
