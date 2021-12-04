import java.util.Vector;

public class Student extends Person{
  private String id;
  private String name;
  private Vector courses; // contains all courses the student is registered in


	public Student(String stdName, String stdId) { 
	   this.name=stdName;
	   this.id=stdId;
	   this.courses=new Vector();
	}


  	  public String getName() {  		 
  		 	 return this.name;
  	  }

  	  public String getId() {
  		  return  this.id;
  	  }

	public void registerFor(Course course){

		if(!courses.contains(course)){
			courses.add(course);
		}

	}

	public boolean isRegisteredInCourse(Course course){

		return courses.contains(course);
	}
  	  
  	

    public String toString() {
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

		String res=this.id+" "+this.name+"\nRegistered courses: ";

		for(int i=0;i<courses.size();i++){

			Course c= (Course) courses.get(i);

			res+= c.getCode()+" "+c.getNumber()+", ";
		}

	return res;

  }
}
