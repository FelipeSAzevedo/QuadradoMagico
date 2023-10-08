
package quadradomagico;

import javax.swing.JOptionPane;

public class QuadradoMagico {
    
    public static void main(String[] args) {
         int numero = (int) (Math.random( ) * 150);
        
        int metade, metade2, metade3, i=0, j=0, resto, soma=0;
        String msg="";
        
        metade = numero /2;
        
        resto = numero - metade;
        metade2 = resto/2;
        metade3 = resto/2;
        
        
        if(resto % 2 == 1){
            metade2 = resto/2;
            metade3 = resto/2 + 1;
        }
                
        int cubo [][] = new int [3][3];
        
        cubo [0][0] = metade;
        cubo [1][1] = metade;
        cubo [2][2] = metade;
        
        cubo [0][2] = metade2;
        cubo [1][0] = metade2;
        cubo [2][1] = metade2;
        
        cubo [0][1] = metade3;
        cubo [1][2] = metade3;
        cubo [2][0] = metade3;
        
        //JOptionPane.showMessageDialog(null, numero);
        //JOptionPane.showMessageDialog(null, metade);
        
        soma = cubo [0][0];
        soma = soma + cubo [1][0];
        soma = soma + cubo [2][0];
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                msg = msg + String.valueOf(cubo[i][j]) + " - ";
            }
            msg=msg + "\n";
        }
        msg=msg + "\n\n" + soma;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
