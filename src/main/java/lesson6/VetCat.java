package lesson6;

public class VetCat extends Cat {   //extends Cat -  означает, что этот класс наследует класс Cat
    String medicalHistory;
    boolean isSterilized;


    public VetCat(int age, String name, String breed, boolean isMale, String medicalHistory, boolean isSterilized) {
        super(age, name, breed, isMale);
        this.medicalHistory = medicalHistory;
        this.isSterilized = isSterilized;
    }

    @Override
    public String toString() {
        return super.toString() + " " + medicalHistory;
    }
}
