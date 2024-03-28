public class petShop {
    //Atributos
    private String nome;

    private Double faturamentoTotal;


    // Construtor
    public petShop(String nome, Double faturamentoTotal) {
        this.nome = nome;
        this.faturamentoTotal = faturamentoTotal;
    }

    public petShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }


    // Métodos
    public void darBanho(Pet animal){
        darBanho(animal, 0.0);
    };

    public void darBanho(Pet animal, Double desconto){      // sobrecarga
        Double valorBanho = 90.0 - desconto;
        faturamentoTotal += valorBanho;
        animal.tomarBanho(valorBanho);
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }
}
