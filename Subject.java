import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void AdicionarObserver(Observer obs){
        observers.add(obs);
    }

    public void RemoverObserver(Observer obs){
        observers.remove(obs);
    }

    public void NotificarObserver(String mensagem){

        for(int i= 0; i < observers.size(); i++){
            Observer obs = observers.get(i);
            obs.Atualizar(mensagem);

        }
    }


}
