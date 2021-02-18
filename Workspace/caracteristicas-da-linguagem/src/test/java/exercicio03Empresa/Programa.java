package exercicio03Empresa;

public class Programa {
    public static void main(String[] args){
        Funcionario supervisor = new Supervisor("Gabriel", "Silva", 2540.00);
        Funcionario atendente = new Atendente("Claudia", "Marapodi", 3200.10);
        Funcionario gerente = new Gerente("Iracenam", "Jesus", 5200.00);

        supervisor.setTaxaImposto(0.05);
        atendente.setTaxaImposto(0.01);
        gerente.setTaxaImposto(0.1);


        System.out.println(("Gerente: " + gerente.calcularImposto()));
        System.out.println("Supervisor: " + supervisor.calcularImposto());
        System.out.println("Atendente: " + atendente.calcularImposto());
    }
}
