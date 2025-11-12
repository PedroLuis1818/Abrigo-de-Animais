public class Cachorro extends AbstractAnimal {

    public Cachorro(){//Construtor Vazio
    }

    public Cachorro(String nome, String genero, String raca, double idade, double peso){//Construtor All Arg
        this.especie = "Cachorro";
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

}

