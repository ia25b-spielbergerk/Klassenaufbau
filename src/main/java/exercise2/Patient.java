package exercise2;

public class Patient {

    private String name;
    private int hight;
    private int age;
    private String gender;
    private String address;
    private String email;

    public Patient(String name, int hight, int age, String gender, String address, String email) {
        this.name = name;
        this.hight = hight;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return  name + " " + hight + " " + age + " " + gender + " " + address + " " + email;
    }

}
