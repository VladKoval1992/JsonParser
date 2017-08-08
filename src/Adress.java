public class Adress {
    private String country;
    private String city;
    private String street;

    @Override
    public String toString() {
        return  street + ", " + city + ", " + country + ".";
    }
}