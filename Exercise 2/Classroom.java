import java.util.*;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student " + student.getId() + " is already enrolled in " + name);
            return;
        }
        students.add(student);
        System.out.println("Student " + student.getId() + " has been enrolled in " + name);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + name);
        } else {
            System.out.println("Enrolled Students in " + name + ":");
            for (Student student : students) {
                System.out.println(" - " + student.getId());
            }
        }
    }

    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Assignment '" + assignment.getName() + "' for " + name + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String assignmentName) {
        Assignment assignment = findAssignmentByName(assignmentName);
        if (assignment != null) {
            assignment.submit(studentId);
        } else {
            System.out.println("Assignment " + assignmentName + " not found in " + name);
        }
    }

    public void listAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments scheduled for " + name);
        } else {
            System.out.println("Scheduled Assignments for " + name + ":");
            for (Assignment assignment : assignments) {
                System.out.println(" - " + assignment.getName());
            }
        }
    }

    private Assignment findAssignmentByName(String assignmentName) {
        for (Assignment assignment : assignments) {
            if (assignment.getName().equalsIgnoreCase(assignmentName)) {
                return assignment;
            }
        }
        return null;
    }
}
