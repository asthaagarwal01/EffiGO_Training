package javapractice.java.constructor;

public class Constructor {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    // Default Constructor
    public Constructor() {
        this.name = "";
        this.age = 0;
        this.birthDate = "";
        this.phoneNumber = "";
    }

    // parameterized constructor
    public Constructor(String name, String phone, String date, int age) {
        this.name = "";
        this.age = 0;
        this.birthDate = "";
        this.phoneNumber = "";
    }

    // copy constructor
    public Constructor(Constructor source) {
        name = source.name;
        age = source.age;
        birthDate = source.birthDate;
        phoneNumber = source.phoneNumber;
    }

    public static void main(String[] args) {
        Constructor Con1 = new Constructor("Alice", "123-456-7890", "1990-01-01", 33);
        Constructor Con2 = new Constructor("Bob", "234-567-8901", "1992-02-02", 31);
        Constructor Con3 = new Constructor("Charlie", "345-678-9012", "1994-03-03", 29);
        Constructor Con4 = new Constructor("David", "456-789-0123", "1996-04-04", 27);
        Constructor copyConstructor1 = new Constructor(Con1);
        Constructor copyConstructor2 = new Constructor(Con3);

    }
}
