public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;

    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return this.amount - (this.amount*customer.getDiscount()/100);
    }
    public String toString() {
      //  return "Invoice[id="+id+", customer="+getCustomerName()+"("+getCustomerDiscount()+"%"+")"+","+"amount="+amount+"]";
        return String.format("Invoice[id=%d, customer=%s(%d%%), amount=%.2f]",
                id, getCustomerName(), getCustomerDiscount(), amount);
    }

}
