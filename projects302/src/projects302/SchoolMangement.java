package projects302;

public class SchoolMangement {

	public String name ;
	public String fatherName ;
	public int classes ;
	public  int lastPassingMarrk ;
	private int rollNo ;
	
	   /// set  method 
		public void  setName (String Sname) {
			
			this.name = Sname;
		}
		
		public void  setFatherName (String SfatherName) {
			this.fatherName = SfatherName ;
		}
		
		public void  setClasse ( int Sclasses) {
			this.classes = Sclasses;
		}
		
		public void  setLastPassingMarrk (int SlastPassingMarrk) {
			this.lastPassingMarrk = SlastPassingMarrk;
		}
		
		 void  setRollNo (int SrollNo) {
			 this.rollNo=SrollNo ;
		 }
		 
		 
		 ///// get method show 
		 
		 String getName ()  {
			 return name ;
		 }
		 
		 String getFatherName () {
			 return fatherName;
		 }
		 
		 int getClasse () {
	 
			 return classes;
			 
		}
		 
		int getLastPassingMarrk () {
			
			return lastPassingMarrk;
		}
		
		int getRollNo () {
			return rollNo ;
		}
		 
		
		 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		SchoolMangement obj = new SchoolMangement ();
		obj.setName("tom");
		obj.setFatherName ("alex");
		obj.setClasse(10);
		obj.setRollNo(46747676);
		obj.setLastPassingMarrk(655);
		
		System.out.println("students name " +obj.getName() + "father" +obj.getRollNo());
	}

}
