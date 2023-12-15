package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER07 {

    /*
        7)Na escola Meu Jardim o aluno recebe quatro notas por disciplina.
        Faça um algoritmo para entrar com quatro notas, o nome do aluno, calcular a média e dizer se o aluno foi aprovado ou reprovado.
        Considere aprovação para valor de média igual ou superior a seis.
     */

    public static void main(String[] args) {

        //declarar variáveis
        String nomeAluno;
        double nota1, nota2, nota3, nota4, media;

        //entrada de dados
        nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

        //calcular a média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //mostra dados para o usuário: aprovado ou reprovado
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, nomeAluno + " foi aprovado com média " + media);
        } else {
            JOptionPane.showMessageDialog(null, nomeAluno + " foi reprovado com média " + media);
        }
    }
}
