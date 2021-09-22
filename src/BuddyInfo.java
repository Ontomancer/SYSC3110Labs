public class BuddyInfo {
    public BuddyInfo(){
        this("-1", "-1", "-1");
    }
    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private String name;
    private String address;
    private String phone;
}
