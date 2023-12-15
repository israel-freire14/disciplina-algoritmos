package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER03 {

    /*
        3) Em matemática, uma série é uma sequencia de números que possui uma lei de formação.
        Faça um algoritmo para calcular a soma da série abaixo, onde N é fornecido pelo usuário: 1/2 + 1/4 + 1/6 + ... 1/2N
     */

    public static void main(String[] args) {

        // Declarar variáveis
        int n;
        double soma = 0;

        // Obter o valor de N do usuário usando JOptionPane
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:")) ;

        // Calcular a soma da série
        for (int i = 1; i <= n; i++) {
            soma = soma + 1.0 / (2 * i);
        }

        // Mostrar dados para o usuário: soma
        JOptionPane.showMessageDialog(null, "A soma da série para N = " + n + " é: " + soma);
    }
}
