
import com.mycompany.praticalevaaperfeicao.Estoque;
import com.mycompany.praticalevaaperfeicao.Produto;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class EstoqueTest {
    ArrayList<Produto> estoque = new ArrayList<>();
    
    Estoque estoquef = new Estoque();
    
    @Test
    public void testeProdutoMaisEstocadoComEstoqueVazio(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {
            estoquef.produtoMaisEstocado(estoque); 
        });
        assertEquals("Estoque vazio", exception.getMessage());
    }    
    
    @BeforeEach
    public void testeAdicionarNovoProduto(){
        estoquef.adicionarProduto(estoque, "ak-47", 100);
        assertEquals("ak-47 100",estoque.get(0).getNome() +" "+ estoque.get(0).getQuantidade());
    }
    
    @Test
    public void testeRemoverMaisQueODisponivel(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoquef.removerProduto(estoque, "ak-47", 101);
        });
        assertEquals("Produto 'ak-47' tem menos de 101",exception.getMessage());
    }
    
    @Test
    public void testeConsultarProdutoInesistente(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {
            estoquef.consultarQuantidade(estoque, "produto fantasma");
        });
        assertEquals("Produto 'produto fantasma' nao existe", exception.getMessage());
    }
    
    

}
