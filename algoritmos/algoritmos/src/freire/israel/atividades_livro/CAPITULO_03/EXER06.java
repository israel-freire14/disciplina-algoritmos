package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER06 {

       /*
        6)O restaurante a quelo Bem-Bão cobra R$12,00 por cada quilo de refeição.
          Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
          Assuma que a balança já desconte o peso do prato.
       */
    public static void main(String[] args) {

        //declarar variáveis
        double pesoPrato, valorPagar;

        //entrada de dados
        pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato (em quilos):"));

        //calcular valor a pagar
        valorPagar = pesoPrato * 12.00;

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + valorPagar);

    }
}
