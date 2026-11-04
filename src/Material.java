
public class Material {

    private String nome;
    private double preco;
    private int quantidade;
    private String unidade;

    // Construtor completo
    public Material(String nome, double preco, int quantidade, String unidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    // Construtor simplificado
    public Material(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
        this.unidade = "Não informado";
    }


    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        System.out.println("Material: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Unidade: " + unidade);
    }
}
