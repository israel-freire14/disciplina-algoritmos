package freire.israel.algoritmos_aulas.exercicios.aula;
import javax.swing.JOptionPane;

        /*
            4. Criar um algoritmo que retorna a soma dos n primeiros
            inteiros ímpares usando recursão.
            soma(n) = 1 se n = 1
           
         */
public class EX03REC {
    public static int somaImpares(int n){

        //caso base
        if(n == 1)
        {
            return 1;
        }
        //caso geral
        else if(n > 1)
        {
            return (2 * n - 1) + somaImpares(n - 1);
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Entrada Inválida");
        }

        return n;
    }

    public static void main(String[] args) {

        //Declarar variáveis
        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor"));

        // Saída de dados
        JOptionPane.showMessageDialog(null,somaImpares(n1));



    }

}
