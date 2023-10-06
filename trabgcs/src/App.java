public class App {
    public static void main(String[] args) throws Exception {
        // Cria departamento financeiro com dez pessoas
        Departamento financeiro = new Departamento().InicializarDepartamentoComDezFuncionarios(Departamento.TipoDepartamento.Financeiro);

        // Cria um item
        Item item = new Item().CriarNovoItem("Item 1", 10.0);
    }
}
