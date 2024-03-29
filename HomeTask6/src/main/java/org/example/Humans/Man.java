package HomeTask6.src.main.java.org.example.Humans;

public class Man extends Human{


    @Override
    public void greetPet() {
        System.out.printf("О привіт друже , як в тебе справи  %s \n", getFamily().getPet().getNickname());
    }
    public void repairCar (){
        System.out.println("Мені потрібно полагодити автомобіль");
    }
}
