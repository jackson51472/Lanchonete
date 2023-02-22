public class Salgadinho extends Prato{

    private Boolean recheio;
    private Boolean massa;

    public Boolean getRecheio() {
        return recheio;
    }

    public void setRecheio(Boolean recheio) {
        this.recheio = recheio;
    }

    public Boolean getMassa() {
        return massa;
    }

    public void setMassa(Boolean massa) {
        this.massa = massa;
    }
    public Double calcularPreco(){
        Double valorPedido = 0.;

        if (getMassa() != null){
            valorPedido += 2;
        }
        if (getRecheio() != null){
            valorPedido += 3;
        }
        valorPedido *= getQuantidade();
        return setValorPagar(valorPedido);
    }
}
