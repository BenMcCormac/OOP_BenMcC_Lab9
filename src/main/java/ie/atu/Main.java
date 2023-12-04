package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Ben", "Headford", "085181455");
        System.out.println(myPerson.toString());

        Customer myCust = new Customer("Ben", "Headford", "085181455", "#54319874", true);
        System.out.println(myCust.toString());
    }
}