
package questao_dois;

public class GerenteProdutos {
    public static String ingredientes(String nomeProduto) {
        // Exemplo: retorna os ingredientes de um produto
        if (nomeProduto.equals("Pizza")) {
            return "Queijo, Molho, Massa";
        }
        return null;
    }
        public static float valorCompra(String nomeProduto) {
        // Exemplo: retorna o valor de compra de um produto
        if (nomeProduto.equals("Pizza")) {
            return 100.0f;
        }
        return 0.0f;
    }
    
}
