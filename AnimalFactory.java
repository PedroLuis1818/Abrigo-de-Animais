class AnimalFactory {

    public static Animal CriarAnimal(String tipoEspecie, String nome, String genero, String raca, double idade, double peso){
        if (tipoEspecie.equalsIgnoreCase("cachorro")){
            return new Cachorro(nome, genero, raca, idade, peso);
        }
        else if (tipoEspecie.equalsIgnoreCase("gato")){
            return new Gato(nome, genero, raca, idade, peso);
        }
        else if (tipoEspecie.equalsIgnoreCase("ave")){
            return new Ave(nome, genero, raca, idade, peso);
        }
        else {
            return null;
        }
    }
}
