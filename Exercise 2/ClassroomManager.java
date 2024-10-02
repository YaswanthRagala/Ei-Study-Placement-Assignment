import java.util.*;

public class ClassroomManager {
    private static ClassroomManager instance;
    private List<Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new ArrayList<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String name) {
        if (getClassroomByName(name) != null) {
            System.out.println("Classroom " + name + " already exists.");
            return;
        }
        classrooms.add(new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Available Classrooms:");
            for (Classroom classroom : classrooms) {
                System.out.println(" - " + classroom.getName());
            }
        }
    }

    public Classroom getClassroomByName(String name) {
        for (Classroom classroom : classrooms) {
            if (classroom.getName().equalsIgnoreCase(name)) {
                return classroom;
            }
        }
        return null;
    }

    public void removeClassroom(String name) {
        Classroom classroom = getClassroomByName(name);
        if (classroom != null) {
            classrooms.remove(classroom);
            System.out.println("Classroom " + name + " has been removed.");
        } else {
            System.out.println("Classroom " + name + " not found.");
        }
    }
}
