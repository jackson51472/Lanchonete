import java.util.ArrayList;

public class Pedido {

    private String nomeCliente;
    private Double taxaServico = 0.;
    public ArrayList<Prato> itensComsumido = new ArrayList<>();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Double taxaServico) {
        this.taxaServico = taxaServico;
    }


    public String fatura(){
        Double totalPagar = 0.;

        Prato p = new Prato();
        for (Prato prato : itensComsumido){
            p = prato;
            totalPagar += prato.getValorPagar() + (prato.getQuantidade() * 0.3);
            this.taxaServico += prato.getQuantidade() * 0.3;

        }
        String imprimir1= "O Cliente: " + getNomeCliente() +"\n";
        String imprimir2= "Quantidade de produto consumido:  " + p.getQuantidade() +"\n";
        String imprimir3 = "Taxa de serviço: R$" + this.taxaServico +"\n";
        String imprimir4 = "Total pagar: R$"+ totalPagar +"\n";

        return imprimir1 + imprimir2 + imprimir3 + imprimir4;
    }
}
