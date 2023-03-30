import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;
    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }
    public ArrayList<Performer> getPerfomer(){
        return performers;
    }

    public boolean addPerformer(Performer performer){
        boolean unique = true;
        for (Performer performers: performers){
            if(performers == performer ){
                unique = false;
                return false;
            }
        }
        if (unique){
            performers.add(performer);
            return true;
        }
        return true;
    }

    public boolean removePerformer(Performer performer){
for (int i = 0; i < performers.size(); i++){
    if ( performers.get(i) == performer){
        performers.remove(i);
        return true;
    }
}
return false;
    }

    public double averagePerformerAge(){
        double avg = 0;

        for (Performer performers: performers){
            avg += performers.getAge();

        }
        return avg / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age){
        ArrayList<Performer> older = new ArrayList<>();
        for (Performer performers: performers){
            if(performers.getAge() >= age){
                older.add(performers);
            }
        }
        return older;
    }

    public void groupRehearsal(){
        for (Performer performers: performers){
            System.out.println("REHEARSAL !" + performers.getName());
            if(performers instanceof Comedian){
                performers.rehearse(false);
            }else{
                performers.rehearse();
            }
        }
    }
    public void cabaretShow(){
        for(Performer performers: performers){
            System.out.println("Welcome to the cabaret! Next act up " + performers.getName());
            if(performers instanceof Performer || performers instanceof Comedian){
                performers.perform();
            }else{
                Dancer temp = (Dancer) performers;
                temp.pirouette(2);
            }
        }
    }

}
