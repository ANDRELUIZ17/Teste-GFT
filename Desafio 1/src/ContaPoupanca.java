public class ContaPoupanca extends Conta {


    @Override
    public Double rendimento() {
        return this.getSaldo() * 0.07;
    }

    @Override
    public double rendimento(double valor) {
        return this.getSaldo() * 0.07;
    }
}
