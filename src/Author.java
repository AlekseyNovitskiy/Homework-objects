public class Author {

    private String firstName;
    private String secondName;

    public Author(String name) {
        String[] fullName = name.split(" ");
        if (fullName.length == 2) {
            this.firstName = fullName[0];
            this.secondName = fullName[1];
        }
    }
    public String getFirstName() {
        return (this.firstName);
    }
    public String getSecondName() {
        return (this.secondName);
    }
}
