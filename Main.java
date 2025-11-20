import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        final String FILE = "C:\\Users\\pedro\\Desktop\\AbrigoAnimal\\ListaAnimais";

        Scanner input = new Scanner(System.in);

        System.out.println("|ABRIGO DE ANIMAIS|");

        System.out.println("Espécie do animal");
        String especie = input.nextLine();

        System.out.println("Nome do animal");
        String nome = input.nextLine();

        System.out.println("Gênero do animal");
        String genero = input.nextLine();

        System.out.println("Raça do animal");
        String raca = input.nextLine();

        System.out.println("Idade do animal");
        int idade = input.nextInt();

        System.out.println("Peso do animal (kg)");
        double peso = input.nextDouble();

        input.nextLine();

        System.out.println("Estado de saúde do animal");
        String saude = input.nextLine();

        boolean podeAdotar;
        if (saude.equalsIgnoreCase("saudavel")){
            podeAdotar = true;
        }else{
            podeAdotar = false;
        }

        Animal a0 = AnimalFactory.CriarAnimal(especie, nome, genero, raca, idade, peso);//Instânciação do animal
        a0.setSaude(saude);
        a0.setAdocao(podeAdotar);

        if (a0 != null){
            System.out.println(a0.especie + " " + a0.nome + " " + a0.idade + " " + a0.peso+"kg"+" "+a0.getSaude());
        }else{
            System.out.println("Não foi possivel implementar este animal");
        }

        Subject avisador = new Subject();

        PessoaObserver obs0 = new PessoaObserver("Alexandre");
        avisador.AdicionarObserver(obs0);

        if (a0.getAdocao()){
            avisador.NotificarObserver(a0.nome);
        }







    }

}
