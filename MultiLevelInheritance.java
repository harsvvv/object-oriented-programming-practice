class LibraryMember {
    int memberId;
    String name;

    LibraryMember() {
        // Default constructor
    }

    LibraryMember(int id, String name) {
        this.memberId = id;
        this.name = name;
    }

    void getMemberInfo() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
    }

    void borrowBook() {
        System.out.println(name + " is borrowing a book.");
    }

    void returnBook() {
        System.out.println(name + " is returning a book.");
    }
}

class Employee extends LibraryMember {
    int employeeId;
    String department;

    Employee(int memberId, String name, int employeeId, String department) {
        super(memberId, name);
        this.employeeId = employeeId;
        this.department = department;
    }

    void getEmployeeInfo() {
        getMemberInfo(); // Calls LibraryMember's method
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    void manageBooks() {
        System.out.println("Books are being managed by department " + department);
    }
}

class Librarian extends Employee {
    int librarianId;
    String shift;

    Librarian(int memberId, String name, int employeeId, String department, int librarianId, String shift) {
        super(memberId, name, employeeId, department);
        this.librarianId = librarianId;
        this.shift = shift;
    }

    void getLibrarianInfo() {
        getEmployeeInfo(); // Calls Employee's method
        System.out.println("Librarian ID: " + librarianId);
        System.out.println("Shift: " + shift);
    }

    void issueBook() {
        System.out.println("Book is being issued.");
    }
}

class Student2 extends LibraryMember {
    int studentId;
    char grade;

    Student2(int memberId, String name, int studentId, char grade) {
        super(memberId, name);
        this.studentId = studentId;
        this.grade = grade;
    }

    void getStudentInfo() {
        getMemberInfo(); // Calls LibraryMember's method
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }

    void requestBook() {
        System.out.println("Book is being requested.");
    }
}

class Researcher extends Student2 {
    String researchArea;

    Researcher(int memberId, String name, int studentId, char grade, String researchArea) {
        super(memberId, name, studentId, grade);
        this.researchArea = researchArea;
    }

    void getResearchInfo() {
        getStudentInfo(); // Calls Student2's method
        System.out.println("Research Area: " + researchArea);
    }

    void accessSpecialCollections() {
        System.out.println("Special collections are accessible.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Create instances and demonstrate functionality

        Librarian librarian = new Librarian(1, "Alice", 101, "Cataloging", 1001, "Morning");
        Researcher researcher = new Researcher(2, "Bob", 202, 'A', "Artificial Intelligence");

        System.out.println("Librarian Information:");
        librarian.getLibrarianInfo();
        librarian.issueBook();
        librarian.borrowBook();

        System.out.println("\nResearcher Information:");
        researcher.getResearchInfo();
        researcher.accessSpecialCollections();
        researcher.requestBook();
    }
}
