package telephonebilling.billing;

import java.util.*;

public class Invoice {

    private List<PhoneBill> billingList;
    private double priceSum;

    public Invoice(){
        this.billingList = new ArrayList<>();
    }

    public double getPriceSum() {
        return priceSum;
    }

    public void setPriceSum() {
      priceSum = Pricing.pricePhoneBill(this);
    }

    public void addBilling(PhoneBill phoneBill){
        billingList.add(phoneBill);
    }

    public List<PhoneBill> getBillingList() {
        return billingList;
    }

    protected static String mostCalledPhoneNumber(Invoice invoice){

        Map<String, Integer> countMap = new HashMap<>();

        for(PhoneBill pb : invoice.getBillingList()){
            countMap.merge(pb.getCall().getPhoneNumber(), 1, Integer::sum);
        }

        int maxValue = 0;
        for(Integer i : countMap.values()){
            if(i > maxValue) maxValue = i;
        }

        StringBuilder mostOccurring = new StringBuilder();

        for(Map.Entry<String, Integer> entry : countMap.entrySet()){
            if(entry.getValue() == maxValue){
                mostOccurring.append(entry.getKey());
                break;
            }
        }

        return mostOccurring.toString();
    }
}
