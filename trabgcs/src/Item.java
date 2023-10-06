public class Item {
    private String Descricao;
    private Double Valor;

    public Item CriarNovoItem(String descricao, Double valor) {
       this.Descricao = descricao;
       this.Valor = valor;
       return this;
    }
    
}
