package model_G_C;

public class Data_Contact {
    private final String fName;
    private final String address;
    private final String adress2;

    public Data_Contact(String fName, String address, String adress2) {
        this.fName = fName;
        this.address = address;
        this.adress2 = adress2;
    }

    public String getfName() {
        return fName;
    }

    public String getAddress() {
        return address;
    }

    public String getAdress2() {
        return adress2;
    }
}
