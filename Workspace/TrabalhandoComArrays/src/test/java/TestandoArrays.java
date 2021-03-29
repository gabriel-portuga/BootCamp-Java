public class TestandoArrays {
    public static void main(String[] args){
        //Conceitos e declarações de arrays
        int[] meuArray = new int[7];
        int[] meuArray2 = {12, 32, 54, 6, 8, 89, 64};

        System.out.println(meuArray);
        // Retorna:[I@2d363fb3 (valor alocado na memória)
        System.out.println(meuArray2);
        // Retorna: [I@7d6f77cc (valor alocado na memória)

        //Alterando o valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2);
        // Retorna: [I@7d6f77cc (valor alocado  na memória)

        //Comprimento do array
        System.out.println(meuArray.length);
        // Retorna: 7


        // Para imprimir o conteúdo do Array devemos indicar o índice
        System.out.println(meuArray[1]);
        // Retorna: 0 (todos são zero pois só foi declarado o tamanho)
        System.out.println(meuArray2[3]);
        // Retorna: 6

        //Alterando o valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2[2]);
        // Retorna: 10
    }
}