
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
        Quest�o 3 - Uma pesquisa sobre algumas caracter�sticas f�sicas da popula��o
        de uma determinada regi�o coletou os seguintes dados, referentes a cada habitante:

        a) sexo (m e f);

        b) cor dos olhos (a (azuis), v (verdes), c (castanhos), p (pretos));

        c) cor dos cabelos (l (loiros), c (castanhos), p (pretos), r (ruivos));

        d) idade em anos.

        e) valor do sal�rio.

        Para o cadastro, todos os campos deve ser validados, ou seja, para sexo,
        ser�o aceitos somente as op��es ?m? e ?f?; para cor de olhos, apenas as op��es
        ?a?, ?v?, ?c? e ?p?; para cor dos cabelos, apenas as op��es ?l?, ?c?, ?p? e ?r?;
        para idade, apenas valores entre 10 e 100 anos, inclusive estes e para o sal�rio,
        n�o aceitar valores negativos.

        Para indicar fim dos habitantes pesquisados, o usu�rio fornecer� um habitante
        fict�cio com idade igual a ?1.

        Ao final, o algoritmo deve determinar a porcentagem de indiv�duos do sexo feminino,
        com idade entre 18 e 35 anos e que tenham olhos castanhos e cabelos castanhos 
        */
        
//------------------------------------------------------------------------------------------------------------------        
        
        Scanner sc = new Scanner(System.in);

        String sexo ;
        String corOlho ;
        String corCabelo;
        int idade;
        float salario;

        float totalPessoas = 0, mulheresCondicao = 0;

        while (true){
            sexo = "";
            corOlho = "";
            corCabelo = "";
            idade = -2;
            salario = -1;
            
            System.out.println("Cadastro nova Pessoa: \n");
            
            do {
                System.out.println("Digite seu Sexo: \nM para Masculino\nF para Feminino\n");
                sexo = sc.next();
            }while (!Objects.equals(sexo, "f") && !Objects.equals(sexo, "m"));
                

            do{
                System.out.println("Digite a cor dos seus olhos: \na (azuis)\n v (verdes)\n c (castanhos)\n p (pretos)");
                corOlho = sc.next();
            }while (!Objects.equals(corOlho, "a") && !Objects.equals(corOlho, "v")
                && !Objects.equals(corOlho, "c") && !Objects.equals(corOlho, "p"));
            

            do {
                System.out.println("Digite a cor dos seu cabelo:\nl (loiros)\nc (castanhos)\np (pretos)\n r(ruivos))");
                corCabelo = sc.next();
            } while (!Objects.equals(corCabelo, "l") && !Objects.equals(corCabelo, "c")
            && !Objects.equals(corCabelo, "r") && !Objects.equals(corCabelo, "p"));
                

            System.out.println("Digite sua idade (Digite -1 para o programa finalizar): ");
            while (idade < 10 || idade >100){
                idade = sc.nextInt();
                if (idade == -1){
                    break;
                }
            }

            if (idade == -1){
                break;
            }

            System.out.println("Digite seu sal�rio: ");
            while (salario < 0){
                salario = sc.nextFloat();
            }


            if (Objects.equals(sexo, "f") && (idade >= 18) && (idade <= 35) &&
                    (Objects.equals(corCabelo, "c")) && (Objects.equals(corOlho, "c"))){
                mulheresCondicao++;
            }
            totalPessoas++;

            System.out.println("\n");
        }

        System.out.println("A porcentagem de mulheres com tais caracter�sticas �: " +
                ((mulheresCondicao/totalPessoas)*100) + "%");
        
    }
    
}
