public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta() {
            @Override
            public Double rendimento() {
                return null;
            }

            @Override
            public double rendimento(double valor) {
                return 0;
            }
        };
        contaCorrente.setNumero();
        contaCorrente.setTitular("André Luiz");
        contaCorrente.setSaldo(1000.0);

        System.out.println("Conta Corrente: BingBank");
        System.out.println("Nome: " + contaCorrente.getTitular());
        System.out.println("Número: " + contaCorrente.getNumero());
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        System.out.println("---------------------------------");
        System.out.println("Rendimento: " + contaCorrente.rendimento());
        System.out.println("---------------------------------");

        Conta contaPoupanca = new Conta() {
            @Override
            public Double rendimento() {
                return 500.0;
            }

            @Override
            public double rendimento(double valor) {
                return 1000.0;
            }
        };
        contaPoupanca.setNumero();
        contaPoupanca.setTitular(" Luiz André");
        contaPoupanca.setSaldo(5000.0);

        System.out.println("Conta Poupança: MegaBank");
        System.out.println("Nome: " + contaPoupanca.getTitular());
        System.out.println("Número: " + contaPoupanca.getNumero());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        System.out.println("Rendimento: " + contaPoupanca.rendimento());


    }
}
