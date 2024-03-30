/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentsystem;

/**
 *
 * @author Dell
 */
public class PaymentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calling the frame
        
        Members p =new Members();
        
        p.setVisible(true);
        p.updateDB();
    }
    
}
