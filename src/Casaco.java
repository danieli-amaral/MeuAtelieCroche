public class Casaco extends ProdutoCroche {
    private String tamanho;
    private String modeloManga;

    public Casaco(String nome, double preco, String material,
                  String tamanho, String modeloManga) {
        super(nome, preco, material);
        this.tamanho = tamanho;
        this.modeloManga = modeloManga;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Modelo da manga: " + modeloManga);
    }
}