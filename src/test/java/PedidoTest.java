
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void armazenaEstados() {
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void retornaStatusInicial() {
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        pedido.restauraStatus(0);
        assertEquals(PedidoStatusEfetuado.getInstance(), pedido.getStatus());
    }

    @Test
    void retornaStatusAnterior() {
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatusEmitirNota.getInstance());
        pedido.setStatus(PedidoStatusTransportadora.getInstance());
        pedido.setStatus(PedidoStatusEmitirNota.getInstance());
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        pedido.restauraStatus(2);
        assertEquals(PedidoStatusEmitirNota.getInstance(), pedido.getStatus());
    }

    @Test
    void retornaExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraStatus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}