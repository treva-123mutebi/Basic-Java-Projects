package arrays;

public class Arrays {

    public static void main(String[] args) {
        Arrays a = new Arrays();
        
        a.storeMarks();
        a.displayMarks();
    }
    int marks[];
    
    public void storeMarks(){
        marks=new int[4];
        System.out.println("Storing Marks. Please Wait............");
        marks[0]=67;
        marks[1]=50;
        marks[2]=45;
        marks[3]=75;
    }
    public void displayMarks(){
        System.out.println("Marks are: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
}
