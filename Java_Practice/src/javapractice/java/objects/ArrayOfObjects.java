package javapractice.java.objects;

public class ArrayOfObjects {
    private String name;
    private String format;
    private double rating;

    // Default constructor
    public ArrayOfObjects() {
        this.name = "";
        this.format = "";
        this.rating = 0.0;
    }

    // parameterized constructor
    public ArrayOfObjects(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // Copy Constructor
    public ArrayOfObjects(ArrayOfObjects source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

    // main function
    public static void main(String[] args) {
        ArrayOfObjects[] objects = new ArrayOfObjects[] {
                new ArrayOfObjects("The Shawshank Redemption", "BlueRay", 9.2),
                new ArrayOfObjects("The Godfather", "BlueRay", 9.1),
                new ArrayOfObjects("The Godfather: Part II", "DVD", 9.0),
                new ArrayOfObjects("The Dark Knight", "BlueRay", 9.0),
                new ArrayOfObjects("Schindler's List", "DVD", 8.9),
                new ArrayOfObjects("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new ArrayOfObjects("Pulp Fiction", "DVD", 8.8),
                new ArrayOfObjects("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };
        for (int i = 0; i < objects.length; i++)
            System.out.println(objects[i]);
    }
}
