package fors;

public class For {
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++){
            System.out.println("I= " + i);
        }
        for (int x = 0; x <= 5; x++){
            System.out.println("X= " + x);
        }
        System.out.println("Matriz");

        for (int coluna = 0; coluna <= 5; coluna++){
            for (int linha = 0; linha <= 5; linha++){
                System.out.printf("(" + linha + ")");
            }
            System.out.println("");
        }
    }
}
