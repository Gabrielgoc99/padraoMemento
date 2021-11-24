
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private PedidoStatus status;
    private List<PedidoStatus> memento = new ArrayList<PedidoStatus>();

    public PedidoStatus getStatus() {
        return this.status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
        this.memento.add(this.status);
    }

    public void restauraStatus(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.status = this.memento.get(indice);
    }

    public List<PedidoStatus> getEstados() {
        return this.memento;
    }


}