package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER03 {

     /*
         3) Os ingressos no cinema Belas Artes custam X reais. Na terça-feira há um desconto de 50%, e em qualquer dia, menores de 14 anos também têm um desconto de 50%.
         Faça um algoritmo que, sendo lidos o dia da semana, a idade do espectador e o preço base do ingresso, imprima o valor a pagar.
         Considere que dia 1 é domingo, 2 é segunda-feira, etc. Ex: ingresso na terça-feira para um espectador de 11 anos, com preço-base de R$12,00 - o valor a pagar é de R$3,00.
      */

    public static void main(String[] args) {
        //declarar variáveis
        int diaSemana, idade;
        double precoBase, descontoDia = 0.0, descontoIdade = 0.0, precoFinal;

        //entrada de dados
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):"));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do espectador:"));
        precoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço base do ingresso:"));

        // Calcula o valor a pagar
        if(diaSemana==3) {
            descontoDia = 0.5;
        } else {
            descontoDia = 0.0;
        }

        if (idade <14) {
            descontoIdade = 0.5;
        } else {
            descontoIdade = 0.0;
        }

        //carlcular preço final
        precoFinal = precoBase * (1-descontoDia) * (1-descontoIdade);

        //mostrar dados para o usuário
        JOptionPane.showMessageDialog(null, "O valor a pagar é de R$" + precoFinal);
    }
}
