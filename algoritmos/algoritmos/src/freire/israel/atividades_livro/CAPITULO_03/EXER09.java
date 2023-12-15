package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER09 {

        /*
        9)Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendovendida respectivamente por 10, 12 e 15 reais.
         Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.
        */
    public static void main(String[] args) {

        //declarar variáveis
        int qtdPequenas, qtdMedias, qtdGrandes;
        double valorArrecadado;

        //entrada de dados
        qtdPequenas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas P"));
        qtdMedias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas M:"));
        qtdGrandes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas G:"));

        //calcular valor arrecadado
        valorArrecadado = qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, "O valor arrecadado é R$" + valorArrecadado);

    }
}
