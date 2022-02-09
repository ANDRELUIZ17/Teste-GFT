public interface ContaCorrente1 {
    double rendimento();

    default double getSaldo() {
        return 0;
    }
}
