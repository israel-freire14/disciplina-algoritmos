package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER05 {

    /*5) Faça um algoritmo para ler um número e imprimir o número elevado á quinta potência.*/
    public static void main(String[] args) {
        //declarar variáveis
        double numero, resultado;

        // Obter o número do usuário usando JOptionPane
        numero =Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        // Calcular o número elevado à quinta potência
        resultado = Math.pow(numero, 5);

        //Mostrar dados para o usuário: potenciação
        JOptionPane.showMessageDialog(null, "O número elevado à quinta potência é: " + resultado);
    }
}
