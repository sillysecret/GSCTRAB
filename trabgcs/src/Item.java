public class Item {
    private String Descricao;
    private Double Valor;

    public Item CriarNovoItem(String descricao, Double valor) {
        this.Descricao = descricao;
        this.Valor = valor;
        return this;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

}
