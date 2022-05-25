package JavaCollection12;

// Tạo lớp lớp Student thực thi giao diện Comparable

public class Studentcomp implements Comparable <Studentcomp> {

    private String name;
    private Integer age;
    private String address;

    public Studentcomp(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Studentcomp" +
                "name='" + name + '\'';
    }

    @Override
    public int compareTo(Studentcomp studentcomp) {
        return this.getName().compareTo(studentcomp.getName());
    }
}