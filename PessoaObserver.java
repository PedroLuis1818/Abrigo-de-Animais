public class PessoaObserver implements Observer{

    public String nome;

    public PessoaObserver(){}

    public PessoaObserver(String nome){
        this.nome = nome;
    }

    @Override
    public void Atualizar(String nomeAnimal){
        System.out.println(nome + ":" + nomeAnimal + " está disponível para adoção!");
    }
}
