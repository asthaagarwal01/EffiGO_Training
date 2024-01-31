// package Java_Practice.Equals;
// Default equals
public class OveriddenEquals {
    private String name;
    private int age;
    private String city;

    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if(!(obj instanceof OveriddenEquals))
        return false;

        //Typecasting the object as a OveriddenEquals object
        OveriddenEquals ob= (OveriddenEquals) obj;
        return Objects.equals(name, ob.name) && age==ob.age && city.equalsIgnoreCase(ob.city) ;
    }

    public OveriddenEquals(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        // Initialising a new object
        OveriddenEquals OveriddenEquals1 = new OveriddenEquals("Astha", 22, "Bengaluru");
        // initialising a new object but with same contents
        OveriddenEquals OveriddenEquals2 = new OveriddenEquals("Astha", 22, "Bengaluru");
        // Copying the refernce of one object to other
        OveriddenEquals OveriddenEquals3 = OveriddenEquals1;

        System.out.println(OveriddenEquals1.equals(OveriddenEquals2));
        System.out.println(OveriddenEquals2.equals(OveriddenEquals3));
        System.out.println(OveriddenEquals1.equals(OveriddenEquals3));

    }
}
