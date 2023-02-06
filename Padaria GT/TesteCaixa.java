public class TesteCaixa {
    public static void main(String[] args) {

        Caixa caixa1 = new Caixa();

        caixa1.setSaldo(1773);

        Comprador nanau = new Comprador(1773, "Nanau");

        Pao paoDeQueijo = new PaoDeQueijo(0.3, 150);

        Pao paoDeSal = new PaoDeSal(0.5, 1200);

        caixa1.venda(paoDeSal, 1201, nanau);
    }
}
