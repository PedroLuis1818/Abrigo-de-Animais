public class Gato extends Animal{

    public Gato(){//Construtor Vazio
    }

    public Gato(String nome, String genero, String raca, double idade, double peso){//Construtor All Arg
        this.especie = "Gato";
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
}
