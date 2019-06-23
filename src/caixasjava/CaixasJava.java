
package caixasjava;

import javax.swing.JOptionPane;


public class CaixasJava {

    
    public static void main(String[] args) {
            
        JOptionPane.showMessageDialog (null, "Olá Mundo!");
       
        int opcao = JOptionPane.showConfirmDialog (null,"Deseja Salvar?");
         
        switch (opcao) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu\"sim\"");
                break;
            
            case 1:
                JOptionPane.showMessageDialog (null, "Você escolheu\"Não\"");
                break;
                
            case 2: 
                JOptionPane.showMessageDialog (null, "Você escolheu\"Cancerlar\"");
                break;
            default:
                break;
        }
    }
    
}
