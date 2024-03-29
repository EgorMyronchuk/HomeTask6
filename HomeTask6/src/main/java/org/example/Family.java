package HomeTask6.src.main.java.org.example;

import HomeTask6.src.main.java.org.example.Humans.Human;
import HomeTask6.src.main.java.org.example.Pets.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
        children = new Human[0];
    }

    public Family(Human mother, Human father, Pet pet, Human[] children) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
        this.pet = pet;
        pet.setFamily(this);
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void addChild(Human child) {
        Human[] updatedChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            updatedChildren[i] = children[i];
        }
        updatedChildren[children.length] = child;
        child.setFamily(this);
        children = updatedChildren;
        // не зовсім розумію як чистіше і правильніше це реалізувати
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] updatedChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                updatedChildren[j++] = children[i];
            }
        }
        children[index] = null;
        children = updatedChildren;
        return true;
        // такаж проблема
    }
    public boolean deleteChild(Human human){
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(human)) {

                children[i] = null;
                return true;
            }
        }
        return false;
        // я розумію що в мене залишаються дірки в масиві
        // і я не можу використати колекції Hash.. але як правильно їх залатати не знаю
    }


    public int countFamily() {
        if (pet != null){
            return 3 + children.length;
        }
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nmother=" + mother +
                ",\nfather=" + father +
                ",\nchildren=" + Arrays.toString(children) +
                ",\npet=" + pet +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println(this);
    }

}