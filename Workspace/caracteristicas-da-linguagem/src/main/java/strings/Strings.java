package strings;

public class Strings {
    public static void main(String[] args){

        var nome = "Gabriel";
        var sobreNome = "Silva";
        final var nomeCompleto = nome + " " + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliiente: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);
        System.out.println("Sobre o nome completo do cliente:");
        System.out.println("Char na posição(5): " + nomeCompleto.charAt(5));
        System.out.println("Quantidade de letras: " + nomeCompleto.length());
        System.out.println("Sem Trim [" + nomeCompleto + "]");
        System.out.println("Com Trim [" + nomeCompleto + "]");
        System.out.println("Lower: " + nomeCompleto.toLowerCase());
        System.out.println("Upper: " + nomeCompleto.toUpperCase());
        System.out.println("Contém M? " + nomeCompleto.toUpperCase().contains("M"));
        System.out.println("Contém S? " + nomeCompleto.toUpperCase().contains("S"));
        System.out.println("Replace: " + nomeCompleto.replace( "a", "@"));
        System.out.println("Equals? " + nomeCompleto.equals("GabrielSilva"));
        System.out.println("EqualsIgnoreCase? " + nomeCompleto.equalsIgnoreCase("Gabriel silva"));
        System.out.println("Substring(1,6)" + nomeCompleto.substring(1, 6));
        // Usando .format
        System.out.printf("O cliente %s possui sobre nome %s%n", nome, sobreNome);
        // Exercícios
        System.out.println("\nA B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("12344 asda qw".replaceAll("[0-9]","#"));

    }
}
