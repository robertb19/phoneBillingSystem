package telephonebilling.billing;

import telephonebilling.callinfo.Call;
import telephonebilling.callinfo.CallFormat;

public class PhoneBill {

    private String phoneBill;
    private Call call;

    public PhoneBill(){
    }

    public PhoneBill(Call call){
       this.call = call;
       this.phoneBill = createPhoneBill();
    }

    public String getPhoneBill() {
        return phoneBill;
    }

    public Call getCall() {
        return call;
    }

    private String createPhoneBill(){
        CallFormat callTime = new CallFormat(call.getTime());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(callTime.getCallFormat() + "," + call.getPhoneNumber());
        return stringBuilder.toString();
    }
}
