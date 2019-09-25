package practice11;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private List<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public List<Klass> getClasses() {
        return klasses;
    }

    public String introduce() {
        if (klasses == null) {
            return super.introduce() + " " + "I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " " + "I am a Teacher. I teach " + getDisplayNames() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (klasses.contains(student.getKlass())) {
            return super.introduce() + " " + "I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " " + "I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    private String getDisplayNames() {
        return "Class " + klasses.stream()
                .map(Klass::getNumber)
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    public boolean isTeaching(Student student) {
        if (klasses.contains(student.getKlass())) {
            return true;
        } else {
            return false;
        }
    }
}
