public class Pizza extends Prato {

    private Boolean molho;
    private Boolean recheio;
    private Boolean borda;


    public Boolean getMolho() {
        return molho;
    }

    public void setMolho(Boolean molho) {
        this.molho = molho;
    }

    public Boolean getRecheio() {
        return recheio;
    }

    public void setRecheio(Boolean recheio) {
        this.recheio = recheio;
    }

    public Boolean getBorda() {
        return borda;
    }

    public void setBorda(Boolean borda) {
        this.borda = borda;
    }

    public Double calcularPreco(){
        Double valorPedido = 0.;

        if (getBorda() == true){
            valorPedido += 20.;
        }
        if (getRecheio() == true){
            valorPedido += 30;
        }
        if (getMolho() == true){
            valorPedido += 15;
        }
        valorPedido *= getQuantidade();

        this.setValorPagar(valorPedido);

        return setValorPagar(valorPedido);
    }

}
