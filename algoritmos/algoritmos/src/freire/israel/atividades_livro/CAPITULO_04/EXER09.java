package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER09 {

     /*
        9) Faça um algoritmo para ler a idade de uma pessoa e imprimir as menagens:
        Para maior de idade : Você é maior de idade
        para menor de idade: Você é menor de idade. Ainda faltam <x> anos para ser maior
     */
    public static void main(String[] args) {

        //declarar variáveis
        int idade;

        //entrada de dados
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        //Mostrar dados para o usuário
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            int anosRestantes = 18 - idade;//calculo de dias restantes
            JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam " + anosRestantes + " anos para ser maior.");
        }
    }
}
