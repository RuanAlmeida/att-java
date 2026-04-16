import java.util.*;

public class Main{
    public static void main(String[] args) {
    /*
        List<String> lista01 = new ArrayList<>();

        lista01.add("Ruan");
        lista01.add("Pedro");

        System.out.println(lista01.get(1));

     */
        // hashSet o mais utilizado
        // grande diferença ---> nao permite duplicidade, nao se importa com a ordem

        Set<String> lista01 = new HashSet<>();
        lista01.add("Teste");
        lista01.add("01");
        lista01.add("0p2");
        lista01.add("03");
        lista01.add("04");
        System.out.println(lista01);


        // hashMap é bem interresante pois possui alguns metodos interresantes
        // se for a msm chave no INTEGER, ele sobrescreve o valor

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Ruan");
        clientes.put(2, "Pedro");
        clientes.put(3, "Felipe");
        clientes.put(10, "Yamal");

        System.out.println(clientes);
        System.out.println(clientes.get(2));

    }
}