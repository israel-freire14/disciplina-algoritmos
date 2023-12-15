package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER01 {

    /*
        1) O gichê de pédagio de uma rodovia possui um equipamento que registra diariamente a quantidade de carros qua ali passaram.
        Faça um algoritmo para ler cada registro do mês de setembro e informar qual o maior volume de carros que passaram e em qual dia ele ocorreu
     */

    public static void main(String[] args) {
        //declarar variáveis e vetores
        int maiorVolume, diaDoMaiorVolume, qtdDeCarros;
        int[] registros = new int[30];

        //entrada de dados
        for(int i = 0; i < registros.length; i++) {
            qtdDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
            registros[i] = qtdDeCarros;
        }
        // Calcula o maior volume de carros
        maiorVolume = 0;
        diaDoMaiorVolume = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
                diaDoMaiorVolume = i + 1;
            }
        }
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia " + diaDoMaiorVolume);
    }
}
