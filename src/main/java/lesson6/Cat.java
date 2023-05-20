package lesson6;

import java.util.Objects;

public class Cat {
    int age;
    String name;
    String breed;
    boolean isMale;

    public Cat(int age, String name, String breed, boolean isMale) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.isMale = isMale;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ").append(age);
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, breed, isMale);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Cat)) {    //Если obj не создан от класса Cat - false.
            return false;   //Оператор instanceof нужен, чтобы проверить, был ли объект, на который ссылается переменная X, создан на основе какого-либо класса Y.
        }

        Cat temp = (Cat) obj;   //this - говорит о том, что используем переменную (this.age, this.isMale...) из основного класса (в нашем случае класс Cat) и сравниваем с переменной (age, isMale...) какого-либо объекта (obj)
        return temp.age == this.age && temp.isMale == this.isMale && temp.breed.equals(this.breed) && temp.name.equals(this.name); //почему где-то ==, а где-то equals()???
    }
}
