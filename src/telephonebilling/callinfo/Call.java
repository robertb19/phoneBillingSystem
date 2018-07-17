package telephonebilling.callinfo;

public class Call {

    private Time time;
    private String phoneNumber;

    public Call(Time time, String phoneNumber){
        this.time = time;
        this.phoneNumber = phoneNumber;
    }

    public Time getTime() {
        return time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
