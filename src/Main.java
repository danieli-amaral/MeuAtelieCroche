
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Objetos das peças antigas
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

        // Exibindo a bolsa e calculando valores
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

        // Exibindo o casaco antigo
        casaco.exibirInformacoes();

        System.out.println("----------------");

        // Exibindo os materiais
        fio.exibirInformacoes();

        System.out.println("----------------");

        agulha.exibirInformacoes();

        System.out.println("----------------");

        linha.exibirInformacoes();

        System.out.println("----------------");

        barbante.exibirInformacoes();

        System.out.println("----------------");

        // Criando um ArrayList de produtos
        ArrayList<ProdutoCroche> produtos = new ArrayList<>();

        produtos.add(new Bolsa(
                "Bolsa de Crochê",
                180.00,
                "Fio de Malha",
                "Alça de Madeira"
        ));

        produtos.add(new Casaco(
                "Casaco de Inverno",
                250.00,
                "Lã",
                "Grande",
                "Manga Longa"
        ));

        // Adicionando o terceiro produto
        produtos.add(new Bolsa(
                "Bolsa de Festa",
                200.00,
                "Fio de Malha",
                "Alça Dourada"
        ));

        // Percorrendo o ArrayList com FOR
        System.out.println("=== MEUS PRODUTOS ===");

        for (int i = 0; i < produtos.size(); i++) {

            System.out.println("Produto " + (i + 1));

            produtos.get(i).exibirInformacoes();

            System.out.println("----------------");
        }
    }
}
