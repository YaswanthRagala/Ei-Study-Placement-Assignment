import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private String name;
    private Set<String> submissions;

    public Assignment(String name) {
        this.name = name;
        this.submissions = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void submit(String studentId) {
        if (submissions.contains(studentId)) {
            System.out.println("Student " + studentId + " has already submitted this assignment.");
        } else {
            submissions.add(studentId);
            System.out.println("Assignment '" + name + "' submitted by Student " + studentId);
        }
    }
}
