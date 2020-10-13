package example2;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
public InvoiceItem(String idInvoiceItem,String descInvoiceItem,int qtyInvoiceItem,double unitPriceInvoiceItem){
    id=idInvoiceItem;
    desc=descInvoiceItem;
    qty=qtyInvoiceItem;
    unitPrice=unitPriceInvoiceItem;
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
