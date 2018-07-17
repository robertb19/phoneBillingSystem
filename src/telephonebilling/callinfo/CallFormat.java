package telephonebilling.callinfo;

public class CallFormat {

    private String callFormat;

    public CallFormat(Time time){
        this.callFormat = createCalltimeFromTime(time);
    }

    private String createCalltimeFromTime(Time time){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        return stringBuilder.toString();
    }

    public String getCallFormat(){
        return callFormat;
    }
}
