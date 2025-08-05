    public static void main(String[] args) {
        String studentid = "20242283837";
        String firstbaname = "Ron";
        String lastname = "Deloso";
        String course = "BSIT";
        String section = "2-1";
        int midterm = 89;
        int finalexam = 87;
        int ProjectS = 90;
        int Attendance = 90;

        int Total = midterm + finalexam + ProjectS + Attendance;
        int AveScore = Total/4;

        System.out.println("Student Name: " + firstbaname +lastname);
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + firstbaname +lastname);
        System.out.println("Course and section: " + course + section);
        System.out.println(AveScore);
        if (AveScore >= 75) {
            System.out.println("PASSED!!!!");
        }
        else{
            System.out.println("FAILED");
        }

    }
}
