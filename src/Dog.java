public class Dog {

    String rasa = null;
    String nume = null;


    public Dog(String rasa, String nume) {
        this.nume = nume;
        this.rasa = rasa;
    }


    public static void main(String[] args) {

        Dog numeDog  = new Dog("dalmatian", "Rex");
        Dog numeDog2 = new Dog("ciobanesc", "Boss");
        Dog numeDog3 = new Dog("alabai", "MyBoy");
        Dog numeDog4 = new Dog("alabai", "MyBoy");

    }
}
