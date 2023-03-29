import java.util.ArrayList;
public class Vet {
    private String name;
    private ArrayList<Animal> clients;

public Vet(String name){
    this.name = name;
    clients = new ArrayList<>();

}

public void addClient(Animal animal){
    boolean unique = true;
    for (Animal animals: clients){
        if(animals == animal){
            unique = false;
        }
    }
    if(unique){
        clients.add(animal);    System.out.println("Welcome to " + name + " 's office " + animal.getName());

    }else{
        System.out.println(animal.getName() + " Is already a client of " + name );
    }
}



}
