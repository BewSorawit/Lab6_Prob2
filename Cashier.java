public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void printReceipt(InventoryCart inventoryCart) {
        System.out.println("Product = " + inventoryCart.getIndex());
        Product product[] = inventoryCart.getAllProduct();
        System.out.println("\tPumpkin Shkp (" + name + ")");

        double sum = 0;
        for (int i = 0; i < inventoryCart.getIndex(); i++) {
            if (product[i] != null) {
                if (product[i].getVolumn() != 0) {
                    System.out.println(product[i].getAmount() + "\tx\t" + product[i].getName() + "\t"
                            + product[i].getVolumn() + " CC\t" + product[i].getAmount() * product[i].getPrice());
                } else if (product[i].getWeight() != 0) {
                    System.out.println(product[i].getAmount() + "\tx\t" + product[i].getName() + "\t"
                            + product[i].getVolumn() + " Gram\t" + product[i].getAmount() * product[i].getPrice());
                }
                sum += product[i].getPrice() * product[i].getAmount();
            }
        }
        System.out.println("\t\tTotal\t" + sum + "$");

    }
}
