public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.insertPhone("John", "123-456-7890");
        phoneBook.insertPhone("Alice", "987-654-3210");
        phoneBook.insertPhone("John", "555-555-5555");

        phoneBook.sort();

        PhoneNumber johnContact = phoneBook.searchPhone("John");
        if (johnContact != null) {
            System.out.println("Name: " + johnContact.getName());
            System.out.println("Phone Numbers: " + johnContact.getPhone());
        }

        phoneBook.updatePhone("John", "123-456-7890", "111-222-3333");

        PhoneNumber updatedJohnContact = phoneBook.searchPhone("John");
        if (updatedJohnContact != null) {
            System.out.println("Name: " + updatedJohnContact.getName());
            System.out.println("Phone Numbers: " + updatedJohnContact.getPhone());
        }

        phoneBook.removePhone("Alice");

        System.out.println("PhoneBook after removing Alice:");
        for (PhoneNumber contact : phoneBook.getPhoneList()) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Numbers: " + contact.getPhone());
        }
    }
}