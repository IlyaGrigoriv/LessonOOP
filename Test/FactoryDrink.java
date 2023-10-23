package org.example.Repeat.Test;

public class FactoryDrink {
    public Product getProduct(Status status){
        Product product  = null;

        switch (status) {
            case горячий:

                product = new Hot();

                break;
            case холодный:
                product = new Ice();
                break;
            default:

        }
        return product;
    }
}
