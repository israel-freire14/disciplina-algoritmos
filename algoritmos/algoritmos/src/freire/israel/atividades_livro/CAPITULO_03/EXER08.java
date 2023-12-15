package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER08 {

    /*
        8)Faça um algoritmo para ler três notas de um aluno em uma disciplina e
        impriir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3)
     */
    public static void main(String[] args) {

        //declarar variáveis
        double nota1, nota2, nota3, media;

        //entrada de dados
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        //calcular a média ponderada
        media = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);
    }
}
