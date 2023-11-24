import java.util.ArrayList;
public class PhoneNumber {
    private String name;
    private ArrayList<String> phone;
    public PhoneNumber(String name,String phone){
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }
}
