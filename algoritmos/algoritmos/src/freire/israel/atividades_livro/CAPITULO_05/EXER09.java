package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER09 {

    /*
        9) Faça um algoritmo para calcular a soma da série a seguir (o usuário deve informar a quantidade de termos da série):
        1/11+1 + 2/22+1 + 3/33+1 + ...
    */

    public static void main(String[] args) {
        // Declarar variáveis
        int n;
        double soma = 0;

        //Eentrada de dadas
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série:"));

        //Calcular soma da série
        for (int i = 1; i <= n; i++) {
            // Calcular o termo da série
            double termo = (i * i) / (i + 1);

            // Adicionar o termo à soma
            soma += termo;
        }
        // Mostrar dados para o usuŕio: soma
        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}
