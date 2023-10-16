import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Funcionario solicitante;
    private Departamento departamento;
    private statusPedido status;
    private int diaAberto;
    private int mesAberto;
    private int anoAberto;
    private double valorPedido;
    private List<Item> itens = new ArrayList<Item>();

    public Pedido(Funcionario solicitante, Departamento departamento, int diaAberto, int mesAberto, int anoAberto) {

        this.diaAberto = diaAberto;
        this.mesAberto = mesAberto;
        this.anoAberto = anoAberto;
        this.solicitante = solicitante;
        this.status = statusPedido.Aprovado;

    }

    public boolean avaliarPedido(Administrador admin, statusPedido status) {
        if (status.equals(statusPedido.Rejeitado)) {
            // LOGICA
            return false;
        } else {
            this.status = status;
            return true;
        }
    }

    public boolean adiconaItensPedido(Item item) {
        itens.add(item);
        return true;
    }

    public boolean removeItensPedido(int idx) {
        if (idx > itens.size()) {
            // Index invalido
            return false;
        } else {

        }

        return true;
    }

    public boolean listaItens() {

    }

    // GETTERS

    public Funcionario getSolicitante() {
        return solicitante;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public statusPedido getStatus() {
        return status;
    }

    public int getDiaAberto() {
        return diaAberto;
    }

    public int getMesAberto() {
        return mesAberto;
    }

    public int getAnoAberto() {
        return anoAberto;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    enum statusPedido {
        Aprovado,
        Rejeitado,
        Pendente
    }

}
