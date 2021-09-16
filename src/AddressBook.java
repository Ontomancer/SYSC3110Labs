import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }
    public static void main(String[] args) {
        //System.out.printf("%s", "hello, world!");
        BuddyInfo hs = new BuddyInfo("000-000-0001",
                "Homer",
                "J.",
                "Simpson");
        AddressBook ab = new AddressBook();
        ab.addBuddy(hs);
        ab.removeBuddy(hs);
        System.out.println("Git lab output.");
    }
}
