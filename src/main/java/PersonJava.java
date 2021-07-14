import java.util.Objects;


public class PersonJava {
    private String name;
    private int age = 0;

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonJava personJava = (PersonJava) o;

        if (!Objects.equals(name, personJava.name)) return false;
        return age != 0 ? age == personJava.age : personJava.age == 0;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "PersonJava(" +
            "name=" + name +
            ", age=" + age +
            ')';
    }
}
