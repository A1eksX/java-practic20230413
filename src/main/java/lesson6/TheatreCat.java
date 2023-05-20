package lesson6;

public class TheatreCat extends Cat{  //extends Cat - означает, что этот класс наследует класс Cat
    int groupID;
    String ability;

    public TheatreCat(int age, String name, String breed, boolean isMale, int groupID, String ability) {
        super(age, name, breed, isMale);
        this.groupID = groupID;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ability;
    }
}
