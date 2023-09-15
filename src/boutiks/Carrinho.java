package boutiks;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Float> produtos = new ArrayList<>();
    
    public void adicionarProduto(float preco) {
        produtos.add(preco);
    }
    
    public String mostrarProdutos() {
        String lista = null;
        for (int i = 0; i < produtos.size(); i++) {
            lista += "\n" + (i + 1) + "R$" + produtos.get(i);
        }
        
        return lista;
    }
    
    public float calcularTotal() {
        float total = 0;
        for(float valor : produtos) total += valor;
        
        return total;
    }
    
    public void removerItem(int id) {
        produtos.remove(id);
    }
}
