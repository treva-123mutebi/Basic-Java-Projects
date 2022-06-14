package zoommeeting;

public class ZoomMeeting {
    String timeofthemeeting;
    int idofthemeeting;
    String subjectofthemeeting;
    String locationofthemeeting;
    
    public ZoomMeeting(){       
        timeofthemeeting = "09:30";
        idofthemeeting = 407;
        subjectofthemeeting = "Exams";
    }
    
    public void setTime(){
        timeofthemeeting = "09:30";
    }
    public void setID(){
        idofthemeeting = 407;       
    }
    public void setSubject(){
        subjectofthemeeting = "Exams";
    }
    public void getSubject(){
        System.out.println(subjectofthemeeting);
    }
    public void printDetails(){
        System.out.println("Zoom Meeting on " + idofthemeeting + " at " + timeofthemeeting + "; Subject: " + subjectofthemeeting + ".");
    }

    public static void main(String[] args) {
        ZoomMeeting ZM = new ZoomMeeting();
        ZM.printDetails();
    }
    
}
