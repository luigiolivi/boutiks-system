package boutiks;

import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        char opcao;
                
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escolha uma opção: \n[1] Adicionar item ao carrinho \n[2] ");
        
        switch(opcao) {
            
        }
        
        
        
        Carrinho carrinho = new Carrinho();
        
        char continuar = 's';

        
        do {
            System.out.println("\nDigite o valor do produto para adicionar ao carrinho: ");
            carrinho.adicionarProduto(sc.nextFloat());
            
            System.out.println("Deseja adicionar mais um produto ao carrinho? (S/N)");
            continuar = sc.next().charAt(0);
        } while(continuar == 'S' || continuar == 's');
        
        System.out.println("Total do carrinho: R$" + carrinho.calcularTotal());
    } 
}
