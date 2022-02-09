public class ContaCorrente implements ContaCorrente1 {
    @Override
    public double rendimento() {
        return this.getSaldo() * 0.05;
    }

}
