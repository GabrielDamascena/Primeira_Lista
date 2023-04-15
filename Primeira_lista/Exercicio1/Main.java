
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       /*
        Questão-1. Uma revendedora de carros usados paga a seus funcionários vendedores
        um salário fixo por mês, mais uma comissão também fixa para cada carro
        vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um
        algoritmo que leia o número de carros por ele vendidos, o valor total de
        suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
        Calcule e escreva o salário final do vendedor.
        
        Resolução: 
        
        1 - Número de carros vendidos
        2 - Valor total de vendas em R$
        3 - Salário fixo
        4 - Valor recebido por carro vendido (5%)
        5 - Salário final do vendedor
       */
       
       
       // Número de carros vendidos
       int carroVendido = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros foram vendidos?"));
       
       // Valor total de vendas em R$
       double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Total de vendas em R$(reais):"));
       
       // Salário fixo
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));
       
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
                                    + "\nSalário fixo: " +salario
                                    + "\nPorcentagem das vendas: " +comissaoVariavel
                                    + "\nSalário Final: " +salarioFinal);
    }
    
}
