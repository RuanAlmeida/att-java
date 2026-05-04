import java.util.Scanner;

public class ex012{
    public static void main(String[] args) {
        double valor, soma = 0; // erro soma == 0
        boolean executando = true; // nao tem ponto e virgula
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa iniciado");  // erro faltou aspas dupla
        while (executando){
            System.out.printf("Digite um numero entre 1 e 20: ");
            valor = entrada.nextDouble(); // deve ser nextDouble
            soma = soma + valor;
            if (soma > 100){
                executando = false;
            }

            System.out.printf("Soma final: %f\n", soma); // nao é D é F -> float
            entrada.close();
            System.out.println("Programa encerrado");
        }

    }
}