
public class ProdutoCroche {

    protected String nome;
    protected double preco;
    protected String material;

    public ProdutoCroche(String nome, double preco, String material) {
        this.nome = nome;
        this.preco = preco;
        this.material = material;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Material: " + material);
    }
}

