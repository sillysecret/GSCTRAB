import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.out;


public class System {

    private List<Pedido> pedidos = new ArrayList<>();

    public System(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void deletaPedido(Funcionario f, int idx) {
        if (pedidos.get(idx).getSolicitante().equals(f)
                && pedidos.get(idx).getStatus().equals(Pedido.statusPedido.Pendente)) {
            pedidos.remove(idx);
        } else {
            out.println("Index inválido ou não é o solicitante do pedido.");
        }
    }

    public void datasEntrePedidos(LocalDate dataInicial, LocalDate dataFinal) {
        List<LocalDate> datas = dataInicial.datesUntil(dataFinal).collect(Collectors.toList());
        for (int i = 0; i < datas.size(); i++) {
            for (Pedido pedido : pedidos) {
                if (pedido.getData().equals(datas.get(i))) {
                    out.println(datas.get(i));
                }
            }
        }
    }

    public void buscaPedidoDoFuncionario(Funcionario f) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getSolicitante().equals(f)) {
                out.println(pedidos.get(i));
            }
        }
    }

    public void buscaPelaDescricao() {
        // gerar getter da descricao do item para realizar este metodo
    }

    public void visualizarDetalhesPedido() {
        out.println(pedidos.toString());
    }

    public void relatorioDados() {
        int aprovados = 0;
        int rejeitados = 0;
        int pendentes = 0;
        int totalPedidos = pedidos.size();
        double media = 0.0;
        double valorTotalPendentes = 0.0;
        double valorTotalAprovados = 0.0;
        double valorTotalRejeitados = 0.0;
        String detalhesPedidoMaiorValor = "";
        double comparador = 0.0;
        

        for (Pedido pedido : pedidos) {

            if(pedido.getValorPedido() > comparador){
             comparador = pedido.getValorPedido();
             detalhesPedidoMaiorValor = pedido.toString();   
            }

            detalhesPedidoMaiorValor = pedido.toString();
            if (pedido.getStatus().equals(Pedido.statusPedido.Aprovado)) {
                aprovados++;
            } else if (pedido.getStatus().equals(Pedido.statusPedido.Rejeitado)) {
                rejeitados++;
            } else if (pedido.getStatus().equals(Pedido.statusPedido.Pendente)) {
                pendentes++;
            } else {
                continue;
            }
        }

        LocalDate hoje = LocalDate.now();
        LocalDate trintaDias = hoje.minusMonths(1);
        List<Pedido> pedidosTrintaDias = new ArrayList<>(List.copyOf(pedidosUltimosTrintaDias(trintaDias, hoje)));
        for (Pedido _pedido : pedidosTrintaDias) {
            media += _pedido.getValorPedido();
            if (_pedido.getStatus().equals(Pedido.statusPedido.Aprovado)) {
                valorTotalAprovados += _pedido.getValorPedido();
            } else if (_pedido.getStatus().equals(Pedido.statusPedido.Rejeitado)) {
                valorTotalRejeitados += _pedido.getValorPedido();
            } else if (_pedido.getStatus().equals(Pedido.statusPedido.Pendente)) {
                valorTotalPendentes += _pedido.getValorPedido();
            } else {
                continue;
            }
        }
        media = media / pedidosTrintaDias.size();


        out.println(" | num Total de Pedidos: " + totalPedidos + " | " );
    }

    private List<Pedido> pedidosUltimosTrintaDias(LocalDate trintaDiasAntes, LocalDate hoje) {
        List<Pedido> pedidosTrintaDias = new ArrayList<>();
        List<LocalDate> datas = trintaDiasAntes.datesUntil(hoje).collect(Collectors.toList());
        for (int i = 0; i < datas.size(); i++) {
            for (Pedido pedido : pedidos) {
                if (pedido.getData().equals(datas.get(i))) {
                    pedidosTrintaDias.add(pedidos.get(i));
                }
            }
        }
        return pedidosTrintaDias;
    }
}
