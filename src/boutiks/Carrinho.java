package boutiks;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Float> produtos = new ArrayList<>();
    
    public void adicionarProduto(float preco) {
        produtos.add(preco);
    }
    
    public void motrarProdutos() {
        for (float valor : produtos) {
            
        }
    }
    
    public float calcularTotal() {
        float total = 0;
        for(float valor : produtos) total += valor;
        
        return total;
    }
    
    public void aplicarDesconto(float porcentagem) {
        
    }
}
