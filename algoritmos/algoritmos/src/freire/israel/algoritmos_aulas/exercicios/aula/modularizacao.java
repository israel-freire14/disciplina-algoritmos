//criar algoritmo que mostre de dois valores inteiros
package freire.israel.algoritmos_aulas.exercicios.aula;
import javax.swing.JOptionPane;

public class modularizacao {


    //assinatura do método
    public static int soma(int n1, int n2) {
        int somavalores = 0;
        somavalores = n1 + n2;

        return somavalores;
    }

    public static void main(String[] args) {

        //Declarar variaveis
        int n1, n2;

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "segundo número"));



        //saída de dados
        JOptionPane.showMessageDialog(null, soma(n1, n2));//chamar método soma

    }
}