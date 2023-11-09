class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("145", "Crucial SSD p3 Nvme M.2", 5, 19.99);
        Invoice invoice2 = new Invoice("123", "Acer External Display", -2, 50.99);
        displayInvoice(invoice1);
        displayInvoice(invoice2);
    }

    private static void displayInvoice(Invoice invoice) {
        System.out.println("\nPart Number: " + invoice.getPartNumber());
        System.out.println("\nPart Description: " + invoice.getPartDescription());
        System.out.println("\nQuantity: " + invoice.getQuantity());
        System.out.println("\nPrice Per Item: $" + invoice.getPricePerItem());
        System.out.println("\nInvoice Amount: $" + invoice.getInvoiceAmount());
        System.out.println();
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
