public class Caixa {

    double saldo;
    Funcionario responsavel;
    Comprador comprador;
    Pao pao;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public double venda (Pao pao, double quantidade, Comprador comprador){
        this.pao = pao;
        this.comprador = comprador;


        double valorTotal = quantidade* pao.getValor();
        System.out.println(valorTotal);



        if(valorTotal > this.comprador.getSaldo()){
            System.out.println("Desculpe, mas você não tem dinheiro suficiente Nanau");
        }
        else {
            comprador.setSaldo(comprador.getSaldo()-valorTotal);
            System.out.println("O valor da compra é R$" + valorTotal);
            System.out.println("Obrigado pela compra Nanau, vc tem: R$" + this.comprador.getSaldo());
        }
        // subtrair o valor do pão (quantidade*valor) do saldo do cliente
        return quantidade;
    }
}