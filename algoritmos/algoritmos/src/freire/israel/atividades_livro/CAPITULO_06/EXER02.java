package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER02 {

    //2) Modifique o algoritmo anterior de forma que também informe o menor volume

    public static void main(String[] args) {
        //declarar variáveis e vetores
        int maiorVolume, menorVolume, diaDoMenorVolume, diaDoMaiorVolume, qtdDeCarros;
        int[] registros = new int[30];

        //entrada de dados
        for(int i = 0; i < registros.length; i++) {
            qtdDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
            registros[i] = qtdDeCarros;
        }
        // Calcula o maior volume de carros
        maiorVolume = 0;
        menorVolume = Integer.MAX_VALUE;;
        diaDoMenorVolume = 0;
        diaDoMaiorVolume = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
                diaDoMaiorVolume = i + 1;
            }
            else if (registros[i] < menorVolume) {
                menorVolume = registros[i];
                diaDoMenorVolume = i + 1;
            }
        }
        // Mostra dados parao o usuário: maior volume e menor volume1
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia "
                + diaDoMaiorVolume + "\nO menor volume de carros que passaram no mês de setembro foi de " + menorVolume + " no dia " + diaDoMenorVolume);
    }
}
