
public class Main {

    public static void main(String[] args) {

        // Objetos das peças
        PecaCroche bolsa = new PecaCroche(
                "Bolsa", 150.00, "Fio de Malha",
                "Bege", "Médio", 8.0
        );

        PecaCroche casaco = new PecaCroche(
                "Casaco de Inverno", 220.00,
                "Lã", "Azul", "Grande", 12.0
        );

        // Objetos dos materiais
        Material fio = new Material(
              "Fio de Malha", 35.00, 2, "Rolos"
        );

        Material agulha = new Material(
                "Agulha de Crochê", 15.00, 3, "Unidades"
        );

        Material linha = new Material(
               "Linha de Algodão", 12.00
        );
         Material barbante = new Material(
                "Barbante", 28.00, 5, "Rolos"
        );

        // Exibindo a bolsa
        bolsa.exibirInformacoes();

        double custo = bolsa.calcularCusto(
                fio.getPreco(), 10.00, 30.00
        );

        System.out.println("Custo da bolsa: R$ " + custo);

        double lucro = bolsa.calcularLucro(custo);

        System.out.println("Lucro da bolsa: R$ " + lucro);

        double margem = bolsa.calcularMargemLucro(lucro);

        System.out.println("Margem de lucro: " + margem + "%");

        System.out.println("----------------");

        // Exibindo o casaco
        casaco.exibirInformacoes();

        System.out.println("----------------");

        // Exibindo o fio
        fio.exibirInformacoes();

        System.out.println("----------------");


        // Exibindo a agulha
        agulha.exibirInformacoes();

        System.out.println("----------------");

        // Exibindo a linha
        linha.exibirInformacoes();

        System.out.println("----------------");

        // Exibindo o barbante
        barbante.exibirInformacoes();

    }
}



