public class Prato {

    private Integer quantidade;
    private Double valorPagar;
    private Pizza pizza;
    private Lanche lanche;
    private Salgadinho salgadinho;


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    public Double getValorPagar() {
        return valorPagar;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Salgadinho getSalgadinho() {
        return salgadinho;
    }

    public void setSalgadinho(Salgadinho salgadinho) {
        this.salgadinho = salgadinho;
    }
    public Double setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
        return valorPagar;
    }

//    public String itensImprimido(){
//        if (getPizza().);
//
//
//        return null;
//    }
}
