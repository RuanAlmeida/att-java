import java.util.List;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ruan", "Jessica", "Mirella", "Ruth");

        List <String> funcionariosLetraR = funcionarios.stream()
                .filter(f -> f.startsWith("R"))
                .toList();

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraR);

    List<Double> vendas = List.of(1125.0, 500.0, 800.0, 1200.0);

    List<Double> comissao = vendas.stream()
            .map(v -> v * 0.05)
            .toList();

        System.out.println(vendas);
        System.out.println(comissao);

        double totalVendas = comissao.stream()
                .reduce(0.0, Double::sum);

        System.out.println(totalVendas);
    }
}
