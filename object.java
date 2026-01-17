class Student {
    String Name;
    int  roll;
   
}



public class object {
    public static void main(String[] args) {
        Student s1 = new Student();
          s1.Name = "Sai";
          s1.roll = 19;
        Student s2 = new Student();
          s2.Name = "ishan";
          s2.roll = 10; 
         Student s3 = new Student();
          s3.Name = "Aditya";
          s3.roll = 13;
        
        Student students[] = new Student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;
        for(Student n : students){
           System.out.println(n.Name+":"+n.roll);
        }
            
        
    }
}
