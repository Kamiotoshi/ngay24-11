import java.util.ArrayList;
import java.util.Collections;
public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList;
    public PhoneBook() {
        this.phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        PhoneNumber existingContact = searchPhone(name);

        if (existingContact == null) {
            // Nếu tên người dùng chưa có sẵn trong PhoneList
            PhoneNumber newContact = new PhoneNumber(name, phone);
            newContact.getPhone().add(phone);
            phoneList.add(newContact);
        } else {
            // Nếu tên người dùng đã có sẵn trong PhoneList
            if (!existingContact.getPhone().contains(phone)) {
                // Kiểm tra xem số điện thoại đã có khác với số đã có không
                existingContact.getPhone().add(phone);
            }
        }
    }

    @Override
    public void removePhone(String name) {
        phoneList.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        PhoneNumber existingContact = searchPhone(name);

        if (existingContact != null) {
            if (existingContact.getPhone().contains(oldPhone)) {
                existingContact.getPhone().remove(oldPhone);
                existingContact.getPhone().add(newPhone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber contact : phoneList) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, (contact1, contact2) -> contact1.getName().compareToIgnoreCase(contact2.getName()));
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

}
