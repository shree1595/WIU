
public class MainTest {

	public static void main(String[] args) {
		
	      Person pObj = new Person("Rayan","Miller");
          Student sObj = new Student("Jacob","Smith",1,"Grad");
          Teacher tObj = new Teacher("Daniel","Martin","English", "Full-time Teacher");
          System.out.println("Person :");
          pObj.Display();
          System.out.println("");
          System.out.println("Student :");
          sObj.Display();
          System.out.println("");
          System.out.println("Teacher :");
          tObj.Display();
	}

}
