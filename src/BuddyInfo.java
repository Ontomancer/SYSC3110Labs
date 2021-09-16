public class BuddyInfo {
    public BuddyInfo(){
        this("-1", "-1", "-1", "-1");
    }
    public BuddyInfo(String id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    public static void main(String[] args) {
        //System.out.printf("%s", "hello, world!");
        BuddyInfo hs = new BuddyInfo("000-000-0001",
                "Homer",
                "J.",
                "Simpson");
        System.out.printf("Hello, %s.", hs.getFirstName());
        System.out.println("Git lab output.");
    }
}
