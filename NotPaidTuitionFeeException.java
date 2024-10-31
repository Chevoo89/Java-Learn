package de.bht.pr2.lab01;

public class NotPaidTuitionFeeException extends Exception{
    public NotPaidTuitionFeeException(int paidFee){
        super("Insufficient tuition fee paid. Missing: " + (Student.TUITION_FEE - paidFee));
    }
}
