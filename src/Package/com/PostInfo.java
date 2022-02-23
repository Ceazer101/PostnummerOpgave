package Package.com;

public class PostInfo {

    private int zipCode;
    private String City;

    public PostInfo(int zipCode, String city) {
        this.zipCode = zipCode;
        City = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return "PostInfo: " +
                "zipCode=" + zipCode +
                ", City='" + City + '\'';
    }
}
