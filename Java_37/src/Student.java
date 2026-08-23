public class Student {
   private long idStudent;
   private String studentName;
   private DateOfBirth dateOfBirth;
   private double avgScore;
   private StudentClass studentClass;

   //Constructor
    public Student(long idStudent, String studentName, DateOfBirth dateOfBirth, double avgScore, StudentClass studentClass) {
        if (idStudent > 0){
            this.idStudent = idStudent;
        }else {
            this.idStudent = 1;
        }

        if(studentName.trim().length() > 0 ){
            this.studentName = studentName;
        }else  {
            this.studentName = "Chua nhap vao ten sinh vien";
        }

        if (avgScore >= 0){
            this.avgScore = avgScore;
        }else  {
            this.avgScore = 0;
        }
        this.dateOfBirth = dateOfBirth;
        this.studentClass = studentClass;
    }

    //Get,Set
    public long getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(long idStudent) {
        if (idStudent > 0){
            this.idStudent = idStudent;
        }else {
            this.idStudent = 1;
        }
    }

    public String getStudentName() {
        return this.studentName;
    }
    public void setStudentName(String studentName) {
        if(studentName.trim().length() > 0 ){
            this.studentName = studentName;
        }else  {
            this.studentName = "Chua nhap vao ten sinh vien";
        }
    }

    public DateOfBirth getDateOfBirth() {
        return this.dateOfBirth;
    }
    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAvgScore() {
        return avgScore;
    }
    public void setAvgScore(double avgScore) {
        if (avgScore >= 0){
            this.avgScore = avgScore;
        }else  {
            this.avgScore = 0;
        }
    }

    public StudentClass getStudentClass() {
        return this.studentClass;
    }
    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    //Yeu cau 1: In ten khoa cua sinh vien
    public void printFacultyName(){
        System.out.println("Ten khoa cua sinh vien " + this.studentName + " la: " + this.studentClass.getFacultyName());
    }

    //Yeu cau 2: Kiem tra sinh vien co dau hay khong? (DK: Diem trung binh >= 5.0)
    public boolean checkPass(){
        return this.avgScore >= 5.0;
    }

    //Yeu cau 3: Kiem tra trung ngay sinh cua cac sinh vien
    public boolean checkDuplicateDateOfBirth(Student student){
        return  this.dateOfBirth.equals(student.dateOfBirth);
    }

    //Yeu cau 3: Kiem tra trung ngay sinh cua cac sinh vien
//    @Override
//    public boolean equals(Object obj){
//        //So sanh dia chi tro toi
//        if (obj == this){
//            return true;
//        }
//        //So sanh null hoac khac kieu lop
//        if (obj == null || obj.getClass() != this.getClass()){
//            return false;
//        }
//
//        //So sanh thuoc tinh can
//        Student other = (Student) obj;
//        if (this.dateOfBirth.getDay() != other.dateOfBirth.getDay()){
//            return false;
//        }
//
//        if (this.dateOfBirth.getMonth() != other.dateOfBirth.getMonth()){
//            return false;
//        }
//        if (this.dateOfBirth.getYear() != other.dateOfBirth.getYear()){
//            return false;
//        }
//
//        return true;
//    }


}
