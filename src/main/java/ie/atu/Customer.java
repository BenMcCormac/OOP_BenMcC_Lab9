package ie.atu;

public class Customer extends Person
{
    private String cusNumber;
    private boolean mailingList;

    public Customer()
    {
        this.address = "";
        this.name = "";
        this.teleNumber = "";
        this.cusNumber = "";
        this.mailingList = false;
    }

    public Customer(String name, String address, String teleNumber, String cusNumber, boolean mailingList)
    {
        this.address = address;
        this.name = name;
        this.teleNumber = teleNumber;
        this.cusNumber = cusNumber;
        this.mailingList = mailingList;
    }

    public String getCusNumber() {
        return cusNumber;
    }

    public void setCusNumber(String cusNumber) {
        this.cusNumber = cusNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", teleNumber='" + teleNumber + '\'' +
                "cusNumber='" + cusNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}