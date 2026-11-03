public class PecaCroche {

    //Atributos

    private String nome;
    private double precoVenda;
    private String material;
    private String cor;
    private String tamanho;
    private double TempoProducao;

    //Construtor

    public PecaCroche(String nome, double precoVenda, String material, String cor, String tamanho, double tempoProducao) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        TempoProducao = tempoProducao;
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
        return TempoProducao;
    }

    public void setTempoProducao(double tempoProducao) {
        TempoProducao = tempoProducao;
    }






    }







