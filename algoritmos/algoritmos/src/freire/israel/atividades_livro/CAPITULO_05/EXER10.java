package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER10 {

     /*
        10) Escreva um algoritmo que ê 5 valores para uma variável A,
        e informa quantos destes valores são negativos, escrevendo está informação.
    */

    public static void main(String[] args) {
        // Declararar variáveis
        int valor, qtdNegativos = 0;

        for (int i = 0; i < 5; i++) {
            // Obter valor do usuário usando JOptionPane
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":"));

            // Verificar se o valor é negativo
            if (valor < 0) {
                qtdNegativos++;
            }
        }

        // Exibir a quantidade de valores negativos usando JOptionPane
        JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + qtdNegativos);
    }
}


