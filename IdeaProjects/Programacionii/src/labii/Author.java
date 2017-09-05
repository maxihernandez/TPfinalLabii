package labii;

public class Author {

    private String name;
    private String email;
    private char gender = 'm';

    @Override
    public String toString(){
        return "Author : "+this.name+"Email :"+this.email+"Gender : "+this.gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}
