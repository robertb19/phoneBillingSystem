package telephonebilling;

import telephonebilling.billing.Invoice;
import telephonebilling.billing.PhoneBill;
import telephonebilling.callinfo.Call;
import telephonebilling.callinfo.Time;

public class Main {

    public static void main(String[] args){

        Time callTime = new Time(0,4,21);
        Call call1 = new Call(callTime, "808-304-504");

        Time callTime2 = new Time(0,6,2);
        Call call2 = new Call(callTime2, "705-301-503");

        Time callTime3 = new Time(0,6,2);
        Call call3 = new Call(callTime3, "605-404-505");

        Time callTime4 = new Time(0,6,2);
        Call call4 = new Call(callTime4, "605-404-505");

        PhoneBill phoneBill = new PhoneBill(call1);
        PhoneBill phoneBill2 = new PhoneBill(call2);
        PhoneBill phoneBill3 = new PhoneBill(call3);
        PhoneBill phoneBill4 = new PhoneBill(call4);

        Invoice invoice = new Invoice();

        invoice.addBilling(phoneBill);
        invoice.addBilling(phoneBill2);
        invoice.addBilling(phoneBill3);
        invoice.addBilling(phoneBill4);

        System.out.println(invoice.getBillingList().toString());

        invoice.setPriceSum();

        System.out.println(invoice.getPriceSum());

        for(PhoneBill pB : invoice.getBillingList()){
            System.out.println(pB.getPhoneBill());
        }



    }


}
