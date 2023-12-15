package freire.israel.algoritmos_aulas.exercicios.aula;

import javax.swing.*;

public class EX02REC {
    /*
        2. Faça uma rotina recursiva para calcular a somatória de todos os número de 1 a N.
        1 2 3 4 5 = 1+2+3+4+5
        caso base: soma = 1 se n = 1

        mat.
        f(x) = x+f(x-1)
        recursão:
        soma(x) = x + soma(x-1)
     */
    public static int soma(int n)
    {
       if(n == 1) //caso base
       {
           return 1;
       }
       else // caso geral
       {
           return n + soma(n-1);
       }
    }

    public static void main(String[] args) {

        //Declarar variaveis
        int n1;

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "primeiro número"));

        //saída de dados
        JOptionPane.showMessageDialog(null, soma(n1));//chamar método soma();
    }
}
