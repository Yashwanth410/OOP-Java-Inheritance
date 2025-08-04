class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {
    String studentID = "S101";

    void showID() {
        System.out.println("Student ID: " + studentID);
    }
}

class GraduateStudent extends Student {
    void submitThesis() {
        System.out.println("Thesis submitted by graduate student.");
    }
}

public class AcademicSystem {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.displayInfo(); 
        gs.showID();        
        gs.submitThesis();
    }
}

