
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /*
        Quest�o 2 - Criar um algoritmo que informe a quantidade total de calorias
        de uma refei��o a partir do usu�rio que dever� informar o prato, a sobremesa
        e a bebida (veja a tabela a seguir). 
        
        Enumere cada op��o de prato, sobremesa e bebida.

        Prato: 1 - vegetariano, 2 ? Peixe, 3 ? Frango, 4 ? Carne;

        Sobremesa: 1 ? Abacaxi, 2 ? Sorvete diet, 3 ? Mouse diet, 4 ? Mouse chocolate;

        Bebida: 1 ? Ch�, 2 - Suco de laranja, 3 ? Suco de mel�o, 4 ? Refrigerante diet. 
        
        Resolu��o: 
        
        1 - Criar uma interface para a tabela
        2 - Armazenar o valor das calorias para cada produto
        
        */
        
        int prato = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero referente ao prato:"
                + "\n1 - Vejetariano"
                + "\n2 - Peixe"
                + "\n3 - Frango"
                + "\n4 - Carne"));
        
        int sobremesa = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero referente a sobremesa:"
                + "\n1 - Abacaxi"
                + "\n2 - Sorvete diet"
                + "\n3 - Mouse diet"
                + "\n4 - Mouse de Chocolate"));
        
        int bebida = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero referente ao prato:"
                + "\n1 - Ch�"
                + "\n2 - Suco de laranja"
                + "\n3 - Suco de mel�o"
                + "\n4 - Refrigerante diet"));
        
        // Variaveis para guardar as calorias
            int caloriaPrato = 0;
            int caloriaSobremesa = 0;
            int caloriaBebida = 0;
        
        //Calorias dos pratos
        switch(prato){
            case 1:
                caloriaPrato = 180;
                break;
            case 2:
                caloriaPrato = 230;
                break;
            case 3:
                caloriaPrato = 250;
                break;
            case 4:
                caloriaPrato = 350;
                break;
            default:
                System.out.println("O n�mero digitado n�o est� em nosso cat�logo.");
        }
        
        //Calorias das sobremesas
        switch(sobremesa){
            case 1:
                caloriaSobremesa = 75;
                break;
            case 2:
                caloriaSobremesa = 110;
                break;
            case 3:
                caloriaSobremesa = 170;
                break;
            case 4:
                caloriaSobremesa = 200;
                break;
            default:
                System.out.println("O n�mero digitado n�o est� em nosso cat�logo.");
        }
        
        //Calorias das bebidas
        switch(bebida){
            case 1:
                caloriaBebida = 20;
                break;
            case 2:
                caloriaBebida = 70;
                break;
            case 3:
                caloriaBebida = 100;
                break;
            case 4:
                caloriaBebida = 65;
                break;
            default:
                System.out.println("O n�mero digitado n�o est� em nosso cat�logo.");
        }
        
        int somacaloria = caloriaPrato + caloriaSobremesa + caloriaBebida;
        
        //Mostrando os resultados
        JOptionPane.showMessageDialog(null, "Total de calorias: " +somacaloria);
        
  
    }
        
}
