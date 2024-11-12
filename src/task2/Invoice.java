package task2;

public class Invoice {
    String model;
    String description;
    int quantity;
    double price;

    Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    double getAmount() {
        return this.quantity * this.price;
    }
 }
