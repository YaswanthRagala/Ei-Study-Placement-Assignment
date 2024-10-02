import java.util.Scanner;

public class VirtualClassroomManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManager manager = ClassroomManager.getInstance();
        boolean running = true;

        System.out.println("Welcome to the Virtual Classroom Manager.");
        System.out.println("Type 'help' for a list of commands.");

        while (running) {
            System.out.print("\n> ");
            String input = scanner.nextLine().trim();
            String[] commandParts = input.split(" ");

            if (commandParts.length == 0) {
                System.out.println("Invalid command. Type 'help' for a list of commands.");
                continue;
            }

            String command = commandParts[0].toLowerCase();

            switch (command) {
                case "add_classroom":
                    if (commandParts.length == 2) {
                        manager.addClassroom(commandParts[1]);
                    } else {
                        System.out.println("Usage: add_classroom <classroom_name>");
                    }
                    break;

                case "add_student":
                    if (commandParts.length == 3) {
                        String studentId = commandParts[1];
                        String className = commandParts[2];
                        Classroom classroom = manager.getClassroomByName(className);
                        if (classroom != null) {
                            classroom.addStudent(new Student(studentId));
                        } else {
                            System.out.println("Classroom " + className + " not found.");
                        }
                    } else {
                        System.out.println("Usage: add_student <student_id> <classroom_name>");
                    }
                    break;

                case "schedule_assignment":
                    if (commandParts.length == 3) {
                        String className = commandParts[1];
                        String assignmentName = commandParts[2];
                        Classroom classroom = manager.getClassroomByName(className);
                        if (classroom != null) {
                            classroom.scheduleAssignment(new Assignment(assignmentName));
                        } else {
                            System.out.println("Classroom " + className + " not found.");
                        }
                    } else {
                        System.out.println("Usage: schedule_assignment <classroom_name> <assignment_name>");
                    }
                    break;

                case "submit_assignment":
                    if (commandParts.length == 4) {
                        String studentId = commandParts[1];
                        String className = commandParts[2];
                        String assignmentName = commandParts[3];
                        Classroom classroom = manager.getClassroomByName(className);
                        if (classroom != null) {
                            classroom.submitAssignment(studentId, assignmentName);
                        } else {
                            System.out.println("Classroom " + className + " not found.");
                        }
                    } else {
                        System.out.println("Usage: submit_assignment <student_id> <classroom_name> <assignment_name>");
                    }
                    break;

                case "list_classrooms":
                    manager.listClassrooms();
                    break;

                case "list_students":
                    if (commandParts.length == 2) {
                        String className = commandParts[1];
                        Classroom classroom = manager.getClassroomByName(className);
                        if (classroom != null) {
                            classroom.listStudents();
                        } else {
                            System.out.println("Classroom " + className + " not found.");
                        }
                    } else {
                        System.out.println("Usage: list_students <classroom_name>");
                    }
                    break;

                case "list_assignments":
                    if (commandParts.length == 2) {
                        String className = commandParts[1];
                        Classroom classroom = manager.getClassroomByName(className);
                        if (classroom != null) {
                            classroom.listAssignments();
                        } else {
                            System.out.println("Classroom " + className + " not found.");
                        }
                    } else {
                        System.out.println("Usage: list_assignments <classroom_name>");
                    }
                    break;

                case "remove_classroom":
                    if (commandParts.length == 2) {
                        manager.removeClassroom(commandParts[1]);
                    } else {
                        System.out.println("Usage: remove_classroom <classroom_name>");
                    }
                    break;

                case "exit":
                    running = false;
                    System.out.println("Exiting the Virtual Classroom Manager. Goodbye!");
                    break;

                case "help":
                    System.out.println("Available commands:");
                    System.out.println(" - add_classroom <classroom_name>");
                    System.out.println(" - add_student <student_id> <classroom_name>");
                    System.out.println(" - schedule_assignment <classroom_name> <assignment_name>");
                    System.out.println(" - submit_assignment <student_id> <classroom_name> <assignment_name>");
                    System.out.println(" - list_classrooms");
                    System.out.println(" - list_students <classroom_name>");
                    System.out.println(" - list_assignments <classroom_name>");
                    System.out.println(" - remove_classroom <classroom_name>");
                    System.out.println(" - exit");
                    break;

                default:
                    System.out.println("Unknown command. Type 'help' for a list of commands.");
            }
        }

        scanner.close();
    }
}
