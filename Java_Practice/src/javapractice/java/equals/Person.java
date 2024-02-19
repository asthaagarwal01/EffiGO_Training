package javapractice.java.equals;

// package Java_Practice.Equals;
// Default equals
public class Person {
    private String name;
    private int age;
    private String city;

    public boolean equals(Object obj) {
        return (this == obj);
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        // Initialising a new object
        Person person1 = new Person("Astha", 22, "Bengaluru");
        // initialising a new object but with same contents
        Person person2 = new Person("Astha", 22, "Bengaluru");
        // Copying the refernce of one object to other
        Person person3 = person1;

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
        System.out.println(person1.equals(person3));

    }
}
