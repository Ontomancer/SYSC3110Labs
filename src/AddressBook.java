import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;
    public AddressBook(){
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.add(buddy);
        }
    }
    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }
    public static void main(String[] args) {
        //System.out.printf("%s", "hello, world!");
        BuddyInfo hs = new BuddyInfo("Homer Simpson", "742 Evergreen Terrace", "+15558675309");
        AddressBook ab = new AddressBook();
        ab.addBuddy(hs);
        System.out.println(ab.removeBuddy(0).getName());
        // New Change for lab 3.
    }
}
