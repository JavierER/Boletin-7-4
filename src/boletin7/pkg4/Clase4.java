
package boletin7.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Clase4 {
   static public int pedirPeso(){
   int peso;
   String res = JOptionPane.showInputDialog("Pesos :");
   peso=Integer.parseInt(res);
   return peso;
}
   static public String nome(){
       String nome=JOptionPane.showInputDialog("Nomes :");
       return nome;
   }
   static public void pedirPesoo (int peso1,int peso2,String nome1,String nome2){
           if (peso1>peso2)
           System.out.println("Maior :"+peso1+","+nome1+". Diferencia :"+ (peso1-peso2));
           else if (peso2>peso1)
           System.out.println("Maior :"+peso2+","+nome2+". Diferencia :"+ (peso2-peso1));
   }
}
