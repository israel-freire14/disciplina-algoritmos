//criar algortimo para multiplicar dois núemeros inteiros usando recursividade
package freire.israel.algoritmos_aulas.exercicios.aula;

import javax.swing.*;

public class recursividade {

    public static int multR(int m, int n)
    {
        if(n > 0)
        {
            return m + multR(m,n-1);
        }
        else
        {
         return 0;
        }
    }
    public static void main(String[] args) {

        //Declarar variaveis
        int n1, n2;

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "segundo número"));

        //saída de dados
        JOptionPane.showMessageDialog(null, multR(n1, n2));//chamar método multR


    }
}
