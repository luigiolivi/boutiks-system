package boutiks;

import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        
        char opcao = 'i';
        
        do {
            System.out.println("\nEscolha uma opção: \n[0] Sair \n[1] Adicionar item ao carrinho \n[2] Mostrar itens do carrinho \n[3] Remover item do carrinho");
        
            Scanner sc = new Scanner (System.in);
            opcao = sc.next().charAt(0);
        
            switch(opcao) {
                case '0' : {
                    System.out.println("Programa finalizado!");
                    break;
                }
                    
                case '1' : {
                    char continuar = 's';
        
                    do {
                        System.out.println("\nDigite o valor do produto para adicionar ao carrinho: ");
                        carrinho.adicionarProduto(sc.nextFloat());
            
                        System.out.println("Deseja adicionar mais um produto ao carrinho? (S/N)");
                        continuar = sc.next().charAt(0);
                    } while(continuar == 'S' || continuar == 's');
                    
                    break;
                }
                
                case '2' : {
                    System.out.println(carrinho.mostrarProdutos());
                    System.out.println("\nTotal: R$" + carrinho.calcularTotal());
                }
                
                case '3' : {
                    System.out.println(carrinho.mostrarProdutos());
                    System.out.println("\nDigite o número do item para removê-lo: ");
                }
                
                case '4' : {
                    
                }
            }
        
            
        

        
                        
        } while(opcao != '0');
    } 
}
