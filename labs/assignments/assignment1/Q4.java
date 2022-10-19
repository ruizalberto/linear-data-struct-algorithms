public class Q4 {
    class Invoice {
        String number;
        String description;
        int quantity;
        double price;

        public Invoice(){
            this.number = "";
            this.description = "";
            this.quantity = 0;
            this.price = 0;
        }

        public String getDescription() {
            return description;
        }

        public String getNumber() {
            return number;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getInvoiceAmount() {
            if (getQuantity()<0){ setQuantity(0); }
            if (getPrice()<0){ setPrice(0.0); }
            double amount = getPrice()*getQuantity();
            return amount;
        }
    }

    public static void main(String[] args) {
        Q4 q = new Q4();
        Q4.Invoice invoiceTest = q.new Invoice();

        invoiceTest.setDescription("This is a descrip.");
        invoiceTest.setPrice(5.2);
        invoiceTest.setQuantity(10);
        System.out.println(invoiceTest.getInvoiceAmount());

        invoiceTest.setQuantity(-5);
        System.out.println(invoiceTest.getInvoiceAmount());

        invoiceTest.setQuantity(10);
        invoiceTest.setPrice(-2.3);
        System.out.println(invoiceTest.getInvoiceAmount());
    }
}
