package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER04 {

       /*
        4)Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida   ela  possui.Considere sempre anos completos, e que um ano possui 365 dias.
          Ex: uma pessoa com 19 anos possui 6935 dias de vida
       */
    public static void main(String[] args) {

        //declarar variáveis
        String nome;
        int idade, diasDeVida;

        //entrada de dados
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        //calcular dias de vida
        diasDeVida = idade * 365;

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, nome + " possui " + diasDeVida + " dias de vida.");

    }
}
