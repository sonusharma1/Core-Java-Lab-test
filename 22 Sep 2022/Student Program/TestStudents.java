
//creating class for assign memory to College class 
public class TestStudents {
    
    // main method
    public static void main(String[] args) {
        
        //create array of College object
        College[] student = new College[10];

        //storing student details in College object's array
        student[0] = new College(1, "Sonu", 98.5);
        student[1] = new College(2, "Ravi", 75.5);
        student[2] = new College(3, "Sharma", 80.5);
        student[3] = new College(4, "Palis", 90.5);
        student[4] = new College(5, "Rahulya", 85.5);
        student[5] = new College(6, "Pradum", 70.5);
        student[6] = new College(7, "Pandey", 65.5);
        student[7] = new College(8, "Pathak", 92.5);
        student[8] = new College(9, "Shukla", 65.5);
        student[9] = new College(10, "yadav", 55.5);        

        //displaying all student details
        System.out.println("\n----------------\nAll Student Details\n--------------\n");
        for (int i = 0; i < student.length; i++) {
            student[i].display();
        }
        
        //display students whose marks grater than 90%
        System.out.println("\n\n-------------------------\nStudents who gets more than 90%\n-------------------------\n");
        for (int i = 0; i < student.length; i++) {
            if (student[i].getMarks() > 90) {
                student[i].display();
            }
        }
        System.out.println();
    }
}
