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
        super(name, address, teleNumber);
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
                super.toString() +
                " cusNumber='" + cusNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}