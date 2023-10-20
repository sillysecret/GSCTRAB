public class Departamento {
    private TipoDepartamento Tipo;
    private Funcionario[] Funcionarios;
    public Departamento InicializarDepartamentoComDezFuncionarios(TipoDepartamento tipo) {
        
        Funcionarios = new Funcionario[10];
        for (int i = 0; i < 10; i++) {
            Funcionarios[i] = new Funcionario();
        }

        this.Tipo = Tipo;
        this.Funcionarios = Funcionarios;

        return this;
    }

    enum TipoDepartamento {
        Financeiro,
        RH,
        Engenharia,
        Manutenção,
        Desenvolvimento
    }
}

