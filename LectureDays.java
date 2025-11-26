class LectureDays{
    public static void main(String[] args)
    {
        String[] lecturers = new String[] {"Benson Kituku", "Juliet Moso", "Kagiri", "Naivasha", "Amenya"}; //this line creates a new string of arrays with lecturer names

        //read only the lec names for the cs department
        System.out.println("\nYour Lecturers this semester are..\n");
        for(String lec : lecturers){
            System.out.println(lec);
        }
        System.out.println("Lecture days with appropriate lecturers:\n");

        int i;
        for(i=0; i<lecturers.length; i++){
            int m=i+1;
            System.out.println("Lecture day: " + m + ". " + "Lecturer Name: "+ lecturers[i]);
        }
    }
}
