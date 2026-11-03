
public class Main {
    public static void main(String[] args) {

        PecaCroche bolsa = new PecaCroche("Bolsa",150.00,"Fio de Malha", "Bege",
                "Médio",8.0);

        System.out.println("Nome:" + bolsa.getNome());
        System.out.println("Preço:" + bolsa.getPrecoVenda());
        System.out.println("Material:" + bolsa.getMaterial() );
        System.out.println("Cor:" + bolsa.getNome());
        System.out.println("Tamanho: "+ bolsa.getTamanho());
        System.out.println("Tempo:" + bolsa.getTempoProducao());
        }
    }
