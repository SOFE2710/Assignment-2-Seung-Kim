import java.util.HashSet;
import java.util.Vector;

public class Department {

   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   
   public Department(String name, String id) {
	      // also initialize the vectors
      this.name=name;
      this.id=id;

      courseList=new Vector<Course>();
      registerList=new Vector<Student>();
	   
   }

   public String getName() {
	   return this.name;
   }

   public String getId() {
	  return  this.id;
   }

   public void registerStudentCourseInDepartment(Student std,Course crs){

      if(!courseList.contains(crs)){
         courseList.add(crs);
      }

      if(!registerList.contains(std)){
         registerList.add(std);
      }

   }

   public Vector<Course> getCourseList() {
      return courseList;
   }

   public void offerCourse(Course course){
      this.courseList.add(course);
   }

   public void printCoursesOffered(){

      for (int i=0;i<courseList.size();i++){
         System.out.println(courseList.get(i));
      }

   }

   public  void printStudentsByName(){
      for (int i=0;i<registerList.size();i++){
         System.out.println(registerList.get(i));
      }
   }

   public boolean isStudentRegistered(Student student){
      return  registerList.contains(student);
   }

   public  Vector<Student> studentsRegisteredInCourse(int code){

      for (int i=0;i<courseList.size();i++){

         if(courseList.get(i).getNumber() == code){
            return courseList.get(i).getStudents();
         }
      }

      return  null;
   }

   public  void printStudentsRegisteredInCourse(int code){

      Vector<Student> students=studentsRegisteredInCourse(code);

      if(students != null){

         for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
         }

      }

   }

   public Course largestCourse(){

      int max=0;
      Course c=null;

      for (int i=0;i<courseList.size();i++){

         if (courseList.get(i).getStudents().size() > max){
            c=courseList.get(i);
            max=courseList.get(i).getStudents().size();
         }

      }

      return  c;

   }

   public String toString() {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students

      return  this.id+": "+courseList.size()+" courses, "+registerList.size()+" students";
   }
}
