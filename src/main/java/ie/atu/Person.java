package ie.atu;

public class Person
{
    private String name;
    private String address;
    private String teleNumber;

    public Person ()
    {
        this.address = "";
        this.name = "";
        this.teleNumber = "";
    }

    public Person(String name, String address, String teleNumber)
    {
        this.address = "address";
        this.name = "name";
        this.teleNumber = "telenumber";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }
}
