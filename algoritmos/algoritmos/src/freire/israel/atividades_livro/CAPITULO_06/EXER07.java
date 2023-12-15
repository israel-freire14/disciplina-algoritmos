package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER07 {

     /*
        7) Faça um algoritmo para ler dois preços de 15 produtos de uma cesta básica (anotados no inicio e no fim de uma semana),
        e imprimir uma listagem com o preço médio de cada produto.
     */

    public static void main(String[] args) {
        //declarar vetores
        double[] precosIniciais = new double[15];
        double[] precosFinais = new double[15];

        // Entrada de dados
        for (int i = 0; i < precosIniciais.length; i++) {
            precosIniciais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }
        for (int i = 0; i < precosFinais.length; i++) {
            precosFinais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }

        // Calcula a variação de preço de cada produto
        double[] variacoes = new double[15];
        for (int i = 0; i < variacoes.length; i++) {
            variacoes[i] = precosFinais[i] - precosIniciais[i];
        }

        // Calcula o preço médio de cada produto
        double[] precosMedios = new double[15];
        for (int i = 0; i < precosMedios.length; i++) {
            precosMedios[i] = (precosIniciais[i] + precosFinais[i]) / 2;
        }

        // Mostra dados do usuário: preço médio de cada produto.
        for (int i = 0; i < precosMedios.length; i++) {
            JOptionPane.showMessageDialog(null, "Preço médio do produto " + (i + 1) + ": " +
                    "" +
                    "" +
                    "" + String.format("%.2f", precosMedios[i]));
        }
    }
}
