package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            System.out.print("I am Tom. I know " + leader.getName() + " become Leader of " + getDisplayName() + ".\n");
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        members.add(member);
        System.out.print("I am Tom. I know " + member.getName() + " has joined " + getDisplayName() + ".\n");
    }
}
