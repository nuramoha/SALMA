

public class invoiceItem {

    // fields
    private String id;
    private String desc;
    private int qty;
    private double unitprice;

    public invoiceItem(String id, String desc, int qty, double unitprice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    // setters
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitprice = unitPrice;
    }

    // get total
    public double getTotal() {
        return unitprice * qty;
    }

    // toString
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id
                + ",desc=" + desc
                + ",qty=" + qty
                + ",unitPrice=" + unitprice + "]";
    }

    // main
    public static void main(String[] args) {

        invoiceItem item = new invoiceItem(
                "A01",
                "Laptop",
                2,
                500.0
        );

        System.out.println(item);

        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDesc());
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Unit Price: " + item.getUnitprice());
        System.out.println("Total: " + item.getTotal());

        item.setQty(3);
        item.setUnitPrice(450.0);

        System.out.println("After Change:");
        System.out.println(item);
        System.out.println("Total: " + item.getTotal());
    }
}
