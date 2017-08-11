
package exercícios.aula01;
import javax.swing.JOptionPane;

public class ExerciciosAula01b {
    public static void main(String[] args) {
        try
        {
            float x1,y1,x2,y2;
            double valor;
            String entrada;
            entrada = JOptionPane.showInputDialog("Digite o x do ponto 1");
            x1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o y do ponto 1");
            y1 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o x do ponto 2");
            x2 = Float.parseFloat(entrada);
            entrada = JOptionPane.showInputDialog("Digite o y do ponto 2");
            y2 = Float.parseFloat(entrada);
            valor = Math.pow((x1-y1), 2) + Math.pow((x2-y2), 2);
            valor = Math.sqrt(valor);
            JOptionPane.showMessageDialog(null,"sqrt((x1-y1)^2 + (x2-y2)^2) = " + 
                    valor,
                    "A distância entre os dois pontos é",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Formato digitado incorreto","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi inserido um formato correto","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
}
