import java.util.Scanner;

public class FiscalizacaoChocolate{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        double teor, preco, pureza;
        String choc;
        int acucar;
        
        System.out.println("Qual o teor do cacau em porcentagem?");
        teor = sc.nextInt();

        if(teor <25){
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate");
        }else if(teor >= 25.00 && teor > 35.00){
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        }else if(teor >= 35.00){
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }

        System.out.println("O chocolate é ao leite ou amargo?");
        choc = sc.next();

        if(choc.equalsIgnoreCase("ao leite")){
          System.out.println("qual a quantidade de acúçar");
          acucar = sc.nextInt();

          if(acucar > 15){
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
          }else{
            System.out.println("Classificação: Chocolate balanceado");
          }
        }else{
            System.out.println("Classificação: Chocolate balanceado");
        }

        System.out.println("Qual o preço do ovo de páscoa?");
        preco = sc.nextDouble();
        
        System.out.println("qual a nota de pureza?");
        pureza = sc.nextDouble();

        if(preco > 100 || pureza < 5){
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        }else{
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }

        sc.close();
        

    }


}