package HomeTask6.src.main.java.org.example.Pets;

import HomeTask6.src.main.java.org.example.Family;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Family family;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Objects.equals(family, pet.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel, family);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    public Pet( String nickname) {
        this.nickname = nickname;
    }

    public Pet( String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Геттеры
    public Species getSpecies() {
        return species;
    }

    public Family getFamily() {
        return family;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    // Сеттеры
    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я ї'м!");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return   species.name() + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println(this);
    }
}