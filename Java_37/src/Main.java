public class Main {
    public static void main(String[] args) {
        DateOfBirth dob1 = new DateOfBirth(8,2,2003);
        DateOfBirth dob2 = new DateOfBirth(8,2,2003);
        DateOfBirth dob3 = new DateOfBirth(10,11,2003);

        StudentClass studentClass1 = new StudentClass("D21KTPM02","CNTT");
        StudentClass studentClass2 = new StudentClass("D21HTTT01","CNS");
        StudentClass studentClass3 = new StudentClass("D21KT01","KT");

        Student student1 = new Student(1, "Nguyen Van A", dob1, 7.25, studentClass1);
        Student student2 = new Student(2, "Tran Thi B", dob2, 3.5, studentClass2);
        Student student3 = new Student(3, "Dinh Van C", dob3, 9.5, studentClass3);

        //Yeu cau 1
        student1.printFacultyName();
        student2.printFacultyName();
        student3.printFacultyName();

        //Yeu cau 2
        System.out.println(student1.checkPass());
        System.out.println(student2.checkPass());
        System.out.println(student3.checkPass());

        //Yeu cau 3
        System.out.println(student1.checkDuplicateDateOfBirth(student2));
        System.out.println(student1.checkDuplicateDateOfBirth(student3));
    }
}
