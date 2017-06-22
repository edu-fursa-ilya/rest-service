package app.entity;


public class Person {

    private String name;
    private String surname;
    private int age;
    private int salary;
    private String profession;

    public Person(String name, String surname, int age, int salary, String profession) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                '}';
    }
}
