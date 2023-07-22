package person;

import java.util.List;

public class Person {

    private String name;
    private int age;

   final Gender gender;

   List<String>hobbies;
   List<Person>friends;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public Person(String name, int age, Gender gender, List<String> hobbies, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = friends;
        population++;
    }
    private static int population=0;

    public static int getPopulation() {
        return population;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                ", friends=" + friends+
                '}';
    }
   //    public String


}
