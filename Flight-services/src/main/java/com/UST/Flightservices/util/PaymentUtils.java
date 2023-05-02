package com.UST.Flightservices.util;

import com.UST.Flightservices.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private  static Map<String,Double> paymentmap=new HashMap<>();
    static {
        paymentmap.put("acc1",20000.0);
        paymentmap.put("acc2",15000.0);
        paymentmap.put("acc3",25000.0);
        paymentmap.put("acc4",4000.0);
        paymentmap.put("acc5",456000.0);
        paymentmap.put("acc6",2000.0);
        paymentmap.put("acc7",36000.0);
    }
    public static boolean validateCreditLimit(String accountNo, double paidamount)throws InsufficientAmountException {
        if(paidamount>paymentmap.get(accountNo)){
            throw new InsufficientAmountException("insuffcientamount.......");
        }else {
            return true;
        }
    }
}
