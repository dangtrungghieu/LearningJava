public class StudentClass {
    private String className;
    private String facultyName;

    //Constructor
    public StudentClass(String className, String facultyName){
        if (className.trim().length() > 0){
            this.className = className;
        }else{
            this.className = "Chua nhap vao ten lop hoc";
        }

        if (facultyName.trim().length() > 0){
            this.facultyName = facultyName;
        }else{
            this.facultyName = "Chua nhap vao ten khoa";
        }
    }

    //Get, Set
    public String getClassName() {
        return this.className;
    }
    public void setClassName(String className) {
        if (className.trim().length() > 0){
            this.className = className;
        }else{
            this.className = "Chua nhap vao ten lop hoc";
        }
    }

    public String getFacultyName() {
        return this.facultyName;
    }
    public void setFacultyName(String facultyName) {
        if (facultyName.trim().length() > 0){
            this.facultyName = facultyName;
        }else{
            this.facultyName = "Chua nhap vao ten khoa";
        }
    }
}
