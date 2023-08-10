public class InventoryCart {
    private int num;
    private Product product[];
    private int index = 0;

    public InventoryCart(int num) {
        this.num = num;
        this.product = new Product[num];
    }

    public void addProduct(Product product) {
        if (index == 0) {
            this.product[index++] = product;
        } else if (index < num) {
            boolean chk = true;
            for (int i = 0; i < index; i++) {
                if (this.product[i].equals(product)) {
                    chk = false;
                    this.product[i].setAmount(this.product[i].getAmount() + 1);
                    this.product[index++] = null;
                    break;
                }
            }
            if (chk) {
                this.product[index++] = product;
            }
        }

    }

    public void displayProduct() {
        for (int i = 0; i < index; i++) {
            System.out.println(product[i]);
        }
    }

    public Product getProduct(int index) {
        return this.product[index];
    }

    public Product[] getAllProduct() {
        return product;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
