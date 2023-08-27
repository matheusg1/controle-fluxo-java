import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {        

        var sc = new Scanner(System.in);        
        System.out.println("Digite o primeiro número");
        int numeroA = sc.nextInt();

        System.out.println("Digite o segundo número");
        int numeroB = sc.nextInt();

        try{
            contar(numeroA, numeroB);
        }
        catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void contar(int numeroA, int numeroB) throws ParametrosInvalidosException {

        if (numeroB > numeroA) {

            int diferenca = numeroB - numeroA;
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo número " + i);
            }

        } else {
            throw new ParametrosInvalidosException();
        }
    }

}
