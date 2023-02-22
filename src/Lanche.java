public class Lanche extends Prato{

    private Boolean pao;
    private Boolean recheio;
    private Boolean molho;

    public Boolean getPao() {
        return pao;
    }

    public void setPao(Boolean pao) {
        this.pao = pao;
    }

    public Boolean getRecheio() {
        return recheio;
    }

    public void setRecheio(Boolean recheio) {
        this.recheio = recheio;
    }

    public Boolean getMolho() {
        return molho;
    }

    public void setMolho(Boolean molho) {
        this.molho = molho;
    }

    public Double calcularPreco() {
        Double valorPedido = 0.;

        if (getPao() == true) {
            valorPedido += 20.;
        }
        if (getRecheio() == true) {
            valorPedido += 30;
        }
        if (getMolho() == true) {
            valorPedido += 15;
        }
        valorPedido *= getQuantidade();
        return setValorPagar(valorPedido);
    }
}
