package baitap15;

public class invoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double uintprice;
    public invoiceItem(String id,String desc,int qty,double unitprice){
    }
    public String getId() {
        return id;
    }

    public invoiceItem(String Desc) {
        this.desc = desc;
    }

    public invoiceItem(int Qty) {
        this.qty = qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUintprice() {
        return uintprice;
    }

    public void setUintprice(double uintprice) {
        this.uintprice = uintprice;
    }
    public double getTotal(){
        return uintprice*qty;
    }

    @Override
    public String toString() {
        return "invoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", uintprice=" + uintprice +
                '}';
    }
}
