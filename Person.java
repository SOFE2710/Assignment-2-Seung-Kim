public class Person {
   private String   name;
   
   
   public Person(String initialName)
   {
      this.name=initialName;
   }
   
   public Person()
   {
     this.name="";
   }
   
   public void setName( String fullName) {
      this.name=fullName;
    }

   public String getName() {
      return name;
   }
 
   public String toString() {
   return null;

   }
}
