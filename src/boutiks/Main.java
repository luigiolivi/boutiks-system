package boutiks;

import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        
        char continuar = 's';
        
        Scanner sc = new Scanner (System.in);
        
        do {
            System.out.println("Digite o valor do produto para adicionar ao carrinho: ");
            carrinho.adicionarProduto(sc.nextFloat());
            
            System.out.println("Deseja adicionar mais um produto ao carrinho? (S/N)");
            continuar = sc.next().charAt(0);
        } while(continuar == 'S' || continuar == 's');
        
        System.out.println("Total do carrinho");
    } 
}
