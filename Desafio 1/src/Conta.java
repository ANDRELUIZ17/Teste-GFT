public abstract class Conta {
    private int numero;
    private String Titular;
    private double saldo;

    public abstract Double rendimento ();

    public Integer getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", Titular=" + Titular + ", saldo=" + saldo + '}';
    }

    public abstract double rendimento(double valor);

}
