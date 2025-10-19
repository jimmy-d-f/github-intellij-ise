enum workdays{
    MONDAY("9AM-5PM"),
    TUESDAY("9AM-5PM"),
    WEDNESDAY("9AM-5PM"),
    THURSDAY("9AM-3PM"),
    FRIDAY("9AM-1PM"){
        public String getworkLocation(){
            return "Home";
        }
    };

    String workHours;

    workdays(String workHours){
    this.workHours = workHours;
    }

    public String getworkHours(){
        return workHours;
    }

    public String getworkLocation(){
        return "Office";
    }
}

public class enumComplex {
    public static void main(String[] args) {
        System.out.println(workdays.MONDAY.getworkHours() + ", " + workdays.MONDAY.getworkLocation());
        System.out.println(workdays.FRIDAY.getworkHours()  + ", " + workdays.FRIDAY.getworkLocation());
    }
}
