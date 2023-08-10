public class Product {
    protected String name;
    protected double price;
    protected int amount;
    protected int weight;
    protected int volumn;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.amount = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (amount != other.amount)
            return false;
        if (weight != other.weight)
            return false;
        if (volumn != other.volumn)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", amount=" + amount + ", weight=" + weight + ", volumn="
                + volumn + "]";
    }

}