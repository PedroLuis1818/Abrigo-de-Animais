public abstract class Animal {

    public String especie, nome, genero, raca;
    public double idade, peso;

    private String saude;

    public void setSaude(String saude) {
        this.saude = saude;
    }
    public String getSaude(){
        return saude;
    }

}
