
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       /*
        Quest�o-1. Uma revendedora de carros usados paga a seus funcion�rios vendedores
        um sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro
        vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um
        algoritmo que leia o n�mero de carros por ele vendidos, o valor total de
        suas vendas, o sal�rio fixo e o valor que ele recebe por carro vendido.
        Calcule e escreva o sal�rio final do vendedor.
        
        Resolu��o: 
        
        1 - N�mero de carros vendidos
        2 - Valor total de vendas em R$
        3 - Sal�rio fixo
        4 - Valor recebido por carro vendido (5%)
        5 - Sal�rio final do vendedor
       */
       
       
       // N�mero de carros vendidos
       int carroVendido = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros foram vendidos?"));
       
       // Valor total de vendas em R$
       double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Total de vendas em R$(reais):"));
       
       // Sal�rio fixo
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio:"));
       
       // Taxa fixa dos carros vendidos
       double taxacar = Double.parseDouble( JOptionPane.showInputDialog("Digite a taxa fixa ganha por carro vendido:"));
       
       // calculo dos valores
       double comissaoFixa = carroVendido * taxacar;
       double comissaoVariavel = totalVendas * 0.05;
       double salarioFinal = salario + comissaoFixa + comissaoVariavel;
       
      
       
       
       // Conferir todos os dados
       JOptionPane.showMessageDialog(null, "Confira os dados:\n---------------------"
                                    + "\nQtd. de carros: " +carroVendido
                                    + "\nTotal de Vendas (R$):" +totalVendas
                                    + "\nSal�rio fixo: " +salario
                                    + "\nPorcentagem das vendas: " +comissaoVariavel
                                    + "\nSal�rio Final: " +salarioFinal);
    }
    
}
