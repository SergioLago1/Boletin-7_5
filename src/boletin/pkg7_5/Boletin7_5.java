/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_5;

/**
 *
 * @author slagogonzalez
 */
public class Boletin7_5 {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        int num1,num2,num3;
        Numeros n= new Numeros();
        num1=n.setNum1();
        num2=n.setNum2();
        num3=n.setNum3();
        n.comprobar(num1, num2, num3);
    }
   
}
