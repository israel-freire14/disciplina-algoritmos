package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER02 {

    /*2) Faça um algoritmo para exibir os números 1, 4, 9, 16, 25, 36, ... , 10000.*/

    public static void main(String[] args) {

        // Declarar variáveis
        int limite, quadrado;

        // Entrada de dados
        limite = 100;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i * i <= limite; i++) {
            quadrado = i * i;
            resultado.append(quadrado);

            // Adicionar uma vírgula e um espaço se não for o último número
            if (i * i < limite) {
                resultado.append(", ");
            }
        }

        // Mostrar dados para o usuário.
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
