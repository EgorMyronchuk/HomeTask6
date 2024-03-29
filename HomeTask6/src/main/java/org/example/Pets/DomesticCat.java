package HomeTask6.src.main.java.org.example.Pets;

public class DomesticCat extends Pet implements Fouling {
    private final Species species = Species.DomesticCat;
    public DomesticCat( String nickname) {
        super(nickname);
    }

    public DomesticCat( String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void foul() {

    }

    @Override
    public void respond() {

    }
}
