public class Reservation {
    String name;
    int days;
    Date startDate;
    int personID;
    public Reservation(String name, int days, Date startDate, int personID){
        this.name=name;
        this.days=days;
        this.startDate=startDate;
        this.personID=personID;
    }

    void setDate(int month, int day, int year){
        Date date=new Date(month, day, year);
        startDate=date;
    }
    void setName(String name){
        this.name=name;
    }
    void setDate(int days, Date startDate){
        this.days=days;
        this.startDate=startDate;
    }

    void setID(int personID){
        this.personID=personID;
    }

    public String getName() {
        return name;
    }
    public int getDays() {
        return days;
    }
    public int getPersonID() {
        return personID;
    }
    public Date getStartDate() {
        return startDate;
    }

    void getInfo(){
        System.out.println(getPersonID());
        System.out.println(getName());
        System.out.println(getStartDate());
        System.out.println(getDays());
    }
}