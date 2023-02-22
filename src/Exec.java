public class Exec {
    public static void main(String[] args) {

        Pedido ped1 = new Pedido();

        ped1.setNomeCliente("Jackson");

        Pizza piz = new Pizza();
        Salgadinho sal = new Salgadinho();

        ped1.itensComsumido.add(piz);
        ped1.itensComsumido.add(sal);

        piz.setBorda(true);
        piz.setMolho(true);
        piz.setRecheio(false);
        piz.setQuantidade(3);
        piz.calcularPreco();

        sal.setRecheio(true);
        sal.setMassa(true);
        sal.setQuantidade(5);
        sal.calcularPreco();

        System.out.println(piz.calcularPreco());
        System.out.println(sal.calcularPreco());

        System.out.println("=========================================================== \n");
        System.out.println(ped1.fatura());
        System.out.println("===========================================================");

    }
}
