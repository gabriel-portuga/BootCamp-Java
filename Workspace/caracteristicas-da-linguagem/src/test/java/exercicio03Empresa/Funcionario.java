package exercicio03Empresa;

public class Funcionario{
    private String nome;
    private String sobreNome;
    private double salario;
    private double taxaImposto;

    public Funcionario(String nome, String sobreNome, double salario){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }
    public double getTaxaImposto() {
        return taxaImposto;
    }
    public void setTaxaImposto(double taxaImposto){
        this.taxaImposto = taxaImposto;
    }
    public double calcularImposto(){
        return this.salario * taxaImposto;
    }
}
