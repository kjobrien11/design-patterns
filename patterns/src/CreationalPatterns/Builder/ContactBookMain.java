package CreationalPatterns.Builder;

public class ContactBookMain {
    public static void main(String[] args) {
        ContactBook c1 = new ContactBook.ContactBookBuilder("KJ", "OBrien")
                .email("kj@email.com")
                .notes("Hello World")
                .build();
        ContactBook c2 = new ContactBook.ContactBookBuilder("Tom", "Wang")
                .phoneNumber("555-555-5555")
                .build();
        ContactBook c3 = new ContactBook.ContactBookBuilder("Reed", "Books")
                .notes("likes to read")
                .email("reed@email.com")
                .phoneNumber("555-532-2099")
                .build();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
