package HomeTask6.src.main.java.org.example.Pets;

public class RoboCat extends Pet{
    private Species species = Species.RoboCat;
    public RoboCat( String nickname) {
        super( nickname);
    }

    public RoboCat( String nickname, int age, int trickLevel, String[] habits) {
        super( nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

    }
}
