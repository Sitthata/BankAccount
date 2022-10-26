public class Person {
    private long idCard;
    private String firstName;
    private String lastName;

    public Person(long idCard, String firstName, String lastName) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getIdCard() {
        return idCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("idCard=").append(idCard);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
