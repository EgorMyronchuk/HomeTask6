package HomeTask6.src.main.java.org.example.Humans;

public class Woman extends Human{
    @Override
    public void greetPet() {
        System.out.printf("Іди сюди чудо моє ,як ти  %s \n", getFamily().getPet().getNickname());
    }
    public void makeup (){
        System.out.println("Почекай мені треба зробити makeup");
    }
}
