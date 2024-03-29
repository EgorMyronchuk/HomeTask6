package HomeTask6.src.main.java.org.example.Pets;

public class Dog extends Pet implements Fouling {
    private final Species species = Species.Dog;
    public Dog( String nickname) {
        super(  nickname);
    }
    public Dog( String nickname, int age, int trickLevel, String[] habits) {
        super( nickname , age , trickLevel , habits);
    }
    @Override
    public void respond() {

    }
    @Override
    public void foul (){
        System.out.println("Потрібно добре замести сліди розірваного взуття");
    }
}
