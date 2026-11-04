public class PecaCroche {

    //Atributos

    private String nome;
    private double precoVenda;
    private String material;
    private String cor;
    private String tamanho;
    protected double tempoProducao;

    //Construtor

    public PecaCroche(String nome, double precoVenda, String material, String cor, String tamanho, double tempoProducao) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.tempoProducao = tempoProducao;
    }



        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getTempoProducao() {
        return tempoProducao;
    }

    public void setTempoProducao(double tempoProducao) {
        this.tempoProducao = tempoProducao;
    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + precoVenda);
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tempo: " + tempoProducao + " horas");

    }
        public double calcularCusto(
        double custoFio,
        double custoAdicional,
        double maoDeObra) {

            double custoTotal = custoFio
                    + custoAdicional
                    + maoDeObra;

            return custoTotal;
        }
        public double calcularLucro(double custoTotal) {
        return precoVenda - custoTotal;
    }


        public double calcularMargemLucro(double lucro) {
        return (lucro / precoVenda) * 100;  // fórmula margem de lucro em porcentagem
    }

    }












