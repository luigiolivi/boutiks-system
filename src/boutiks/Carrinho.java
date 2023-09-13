package boutiks;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Float> produtos = new ArrayList<>();
    
    public void adicionarProduto(float preco) {
        produtos.add(preco);
    }
    
    public float calcularTotal() {
        
    }
    
    public void aplicarDesconto(float porcentagem) {
        
    }
}
