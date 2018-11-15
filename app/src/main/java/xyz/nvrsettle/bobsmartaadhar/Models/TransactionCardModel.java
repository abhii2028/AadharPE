package xyz.nvrsettle.bobsmartaadhar.Models;

/**
 * Created by abhijeet on 15/3/18.
 */

public class TransactionCardModel {

    String id;
    float amountTranst;
    String byAadharNo;
    float date;
    String fromAadharNo;
    String toAadharNo;


    public TransactionCardModel() {
    }

    public TransactionCardModel(String id, float amountTranst, String byAadharNo, float date, String fromAadharNo, String toAadharNo) {
        this.id = id;
        this.amountTranst = amountTranst;
        this.byAadharNo = byAadharNo;
        this.date = date;
        this.fromAadharNo = fromAadharNo;
        this.toAadharNo = toAadharNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAmountTranst() {
        return amountTranst;
    }

    public void setAmountTranst(float amountTranst) {
        this.amountTranst = amountTranst;
    }

    public String getByAadharNo() {
        return byAadharNo;
    }

    public void setByAadharNo(String byAadharNo) {
        this.byAadharNo = byAadharNo;
    }

    public long getDate() {
        return (long) date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getFromAadharNo() {
        return fromAadharNo;
    }

    public void setFromAadharNo(String fromAadharNo) {
        this.fromAadharNo = fromAadharNo;
    }

    public String getToAadharNo() {
        return toAadharNo;
    }

    public void setToAadharNo(String toAadharNo) {
        this.toAadharNo = toAadharNo;
    }
}
