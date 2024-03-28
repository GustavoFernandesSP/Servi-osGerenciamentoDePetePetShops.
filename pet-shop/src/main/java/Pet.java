public class Pet {

    // Atributos
    private String nome;

    private Double totalGasto;

    private Integer idasPetShop;


    // Construtores
    public Pet(String nome) {
        this.nome = nome;
        this.totalGasto = 0.0;
        this.idasPetShop = 0;
    }


    // métodos
    public void tomarBanho(Double valorgasto){
        this.totalGasto += valorgasto;
        this.idasPetShop++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(Double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public Integer getIdasPetShop() {
        return idasPetShop;
    }

    public void setIdasPetShop(Integer idasPetShop) {
        this.idasPetShop = idasPetShop;
    }
}
