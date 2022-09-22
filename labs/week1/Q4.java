public class Q4 {
    public class Invoice {
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
            double amount = 0.0;
            
            return amount;
        }
    }
}
