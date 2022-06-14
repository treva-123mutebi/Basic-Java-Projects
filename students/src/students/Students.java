package students;

public class Students {

    public static void main(String[] args) {
        Students s1 = new Students("David","302 Washington street");
        s1.displayDetails();
        Students s2 = new Students(103,46);
        s2.displayDetails();
        Students s3 = new Students(104,"Roger",50);
        s3.displayDetails();
    }
    int rollNo;
    String name;
    String address;
    float marks;
    
    public Students(){
        rollNo=0;
        name="";
        address="";
        marks=0;
    }
    public Students(int RollNo,String Name){
        rollNo=RollNo;
        name=Name;
    }
    public Students(int RollNo,float Score){
        rollNo=RollNo;
        marks=Score;
    }
    public Students(String Name,String Address){
        name=Name;
        address=Address;
    }
    public Students(int RollNo,String Name,float Score){
        rollNo=RollNo;
        name=Name;
        marks=Score;
    }
    public void displayDetails(){
        System.out.println("RollNo: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Marks: "+marks);
    }
}
