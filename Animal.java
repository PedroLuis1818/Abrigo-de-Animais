public abstract class Animal {

    public String especie, nome, genero, raca;
    public double idade, peso;

    private boolean podeAdotar;

    public void setAdocao(Boolean adocao) {
        this.podeAdotar = adocao;
    }

    public Boolean getAdocao(){
        return podeAdotar;
    }


    private String saude;

    public void setSaude(String saude) {
        this.saude = saude;
    }

    public String getSaude(){
        return saude;
    }

}
