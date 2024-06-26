package homework;

public class Service implements Persister, Reporter{

    private final User user = new User("Bob");

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }

    

}
