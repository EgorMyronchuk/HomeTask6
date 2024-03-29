package HomeTask6.src.main.java.org.example.Pets;

public class Fish extends Pet {
    private Species species = Species.Fish;
    public Fish( String nickname) {
        super(nickname);
    }

    public Fish( String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

    }
}
