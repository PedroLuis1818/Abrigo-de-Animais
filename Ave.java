public class Ave extends Animal{

    public Ave(){//Construtor Vazio
    }

    public Ave(String nome, String genero, String raca, double idade, double peso){//Construtor All Arg
        this.especie = "Ave";
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
}
