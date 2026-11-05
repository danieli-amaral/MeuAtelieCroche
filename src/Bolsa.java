public class Bolsa extends ProdutoCroche {
    private String tipoAlca;

    public Bolsa(String nome, double preco, String material, String tipoAlca) {
        super(nome, preco, material);
        this.tipoAlca = tipoAlca;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de alça: " + tipoAlca);
    }
}