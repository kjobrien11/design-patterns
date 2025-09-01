package CreationalPatterns.Builder;

public class ContactBook {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String notes;

    private ContactBook(ContactBookBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.notes = builder.notes;

    }
    public static class ContactBookBuilder{
        String firstName;
        String lastName;
        String phoneNumber;
        String email;
        String notes;

        public ContactBookBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public ContactBookBuilder email(String email){
            this.email = email;
            return this;
        }

        public ContactBookBuilder notes(String notes){
            this.notes = notes;
            return this;
        }

        public ContactBookBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ContactBookBuilder build(){
            return this;
        }

    }

}
