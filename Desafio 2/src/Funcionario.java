public class Funcionario {
    String nome;
    String matricula;
    double salario;
    int dataAdmissao;
    String CPF;

    public Funcionario(String nome, String matricula, double salario, int dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario() {

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(int dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }
    public void calculaGanhoAnual(double aumento) {
        this.salario += aumento;
    }
    public double calcularImposto() {
        return this.salario * 0.11;
    }
    public void calcularImposto(double aumento)  {
        this.salario += aumento;
    }
    public double calcularGanhoLiquidoMensal() {
        return this.salario - (this.salario * 0.11);
    }
    public double calcularGanhoLiquidoAnual() {
        return this.salario - (this.salario * 0.11) * 12;
    }


}
