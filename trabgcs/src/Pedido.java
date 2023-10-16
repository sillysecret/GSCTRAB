import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Funcionario solicitante;
    private Departamento departamento;
    private statusPedido status;
    private int diaAberto;
    private int mesAberto;
    private int anoAberto;
    private int diaConclusao;
    private int mesConclusao;
    private int anoConclusao;
    private LocalDate data;

    private double valorPedido;
    private List<Item> itens = new ArrayList<Item>();

    public Pedido(Funcionario solicitante, Departamento departamento, int diaAberto, int mesAberto, int anoAberto) {

        this.diaAberto = diaAberto;
        this.mesAberto = mesAberto;
        this.anoAberto = anoAberto;
        this.solicitante = solicitante;
        this.status = statusPedido.Pendente;
        this.data = LocalDate.of(anoAberto, mesAberto, diaAberto);
        // ANO / MES / DIA
        // YYYY/MM/DD

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

    public boolean adicionaItensPedido(Item item) {
        // adiciona item!
        itens.add(item);
        return true;
    }

    public boolean removeItensPedido(int idx) {
        if (idx > itens.size()) {
            // Index invalido!
            return false;
        } else {
            // reove item!
            itens.remove(idx);
            return true;
        }
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

    public List<Item> getItens() {
        return itens;
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

    public int getDiaConclusao() {
        return diaConclusao;
    }

    public int getMesConclusao() {
        return mesConclusao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public LocalDate getData() {
        return data;
    }

    // SETTERS

    public void setDiaAberto(int diaAberto) {
        this.diaAberto = diaAberto;
    }

    public void setMesAberto(int mesAberto) {
        this.mesAberto = mesAberto;
    }

    public void setAnoAberto(int anoAberto) {
        this.anoAberto = anoAberto;
    }

    public void setDiaConclusao(int diaConclusao) {
        this.diaConclusao = diaConclusao;
    }

    public void setMesConclusao(int mesConclusao) {
        this.mesConclusao = mesConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    // ENUM
    enum statusPedido {
        Aprovado,
        Rejeitado,
        Pendente
    }

    // ToString
    @Override
    public String toString() {
        return "Pedido [solicitante=" + solicitante + ", departamento=" + departamento + ", status=" + status
                + ", diaAberto=" + diaAberto + ", mesAberto=" + mesAberto + ", anoAberto=" + anoAberto
                + ", diaConclusao=" + diaConclusao + ", mesConclusao=" + mesConclusao + ", anoConclusao=" + anoConclusao
                + ", valorPedido=" + valorPedido + ", itens=" + itens + "]";

    }
}
