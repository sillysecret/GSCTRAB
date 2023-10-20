# GSCTRAB

## Instruções para commit
Utilizar a convenção de commit-lint:
https://github.com/conventional-changelog/commitlint/tree/master/@commitlint/config-conventional#type-enum

Inclusão de nova funcionalidade:
`git commit -m "feat: adicionado feature de login"`

Correção de bug:
`git commit -m "fix: corrigido bug de login"`


## Instruções para criação de branches
Utilizar a convenção de branches:

Nova feature:
`feature/nome-da-feature`

Correção de bug:
`fix/nome-do-bug`



## Total de tarefas
### Task 1
- Criar classe usuario com tipos:
    - Funcionario
    - Administrador
- Classe funcionário deve vir com dados incluídos já
- Sistema deve ter 15 funcionarios cadastrados

### Task 2
- Criar classe departamento com tipos:
    - Financeiro
    - RH
    - Engenharia
    - Manutenção
    - Desenvolvimento
- Classe departamento deve iniciar com dados cadastrados
- Classe departamento deve ter uma lista de funcionarios

### Task 3
- Criar classe item com:
    - Descrição
    - Valor

### Task 4
- Criar classe pedido
    - Funcionario solicitante
    - Departamento solicitante
    - Data do pedido
    - Data de conclusão
    - Status (aprovado, rejeitado, pendente)
    - Lista de items a serem adquiridos
    - Valor total do pedido
    - Somente administrador pode avaliar o pedido
    - Se rejeitado, deve ser bloqueado para edição
    - Pedido só pode ser excluido pelo funcionário que o criou caso ainda esteja pendente

### Task 5
- Classe sistema (administrador)
    - Lista de pedidos
    - Listar todos pedidos entre duas datas
    - Buscar pedido por funcionario
    - Buscar pedido pela descrição do item
    - Visualizar os detalhes de um pedido para aprovar ou não
    - Relatórios contendo:
        - Numero de pedidos total, dividido entre aprovado e reprovado com percentuais
        - Numero de pedidos nos últimos 30 dias e o valor médio
        - Valor total de cada categoria nos últimos 30 dias
        - Detalhes do pedido de aquisição de maior valor ainda aberto
     
       | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/37356058?v=4" width=115><br>](https://github.com/sillysecret) |  [
| :---: | :---: | :---: |
