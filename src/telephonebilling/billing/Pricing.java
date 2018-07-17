package telephonebilling.billing;

public class Pricing {

    protected static double overFiveMinutePricing(PhoneBill phoneBill){
        return ((phoneBill.getCall().getTime().getHours()*60)+(phoneBill.getCall().getTime().getMinutes())) * 150;
    }

    protected static double standardPricing(PhoneBill phoneBill){
        return ((phoneBill.getCall().getTime().getMinutes()*60) + (phoneBill.getCall().getTime().getSeconds())) * 3;
    }

    protected static double pricePhoneBill(Invoice invoice){
        String mostOccurringPhoneNumber = Invoice.mostCalledPhoneNumber(invoice);
        double totalPrice = 0;
        for(PhoneBill phoneBill : invoice.getBillingList()) {
                if (phoneBill.getCall().getPhoneNumber().equals(mostOccurringPhoneNumber)) {
                    totalPrice += 0;
                }
                else if (phoneBill.getCall().getTime().getMinutes() > 5 || phoneBill.getCall().getTime().getHours() > 0) {
                    totalPrice += overFiveMinutePricing(phoneBill);
                } else {
                    totalPrice += standardPricing(phoneBill);
                }
        }
        return totalPrice;
    }
}
