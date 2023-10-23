package org.example.Repeat.Lesson1;

import java.util.ArrayList;

public class VendingMachine<T extends Product> {
    private ArrayList<T> _products;
    private Menu _menu;
    private InputUser _input;


    public VendingMachine() {
        _products = new ArrayList<>();
        _menu = new Menu();
        _input = new InputUser();
    }

    public void add(Product product) {
        _products.add((T) product);
    }

    public void showAllProduct() {
        for (int i = 0; i < _products.size(); i++) {
            Product product =  _products.get(i);
            product.show();
        }
    }

    public void start() {
        boolean isRun = true;

        while (isRun) {
            _menu.selectUserStatus();
            String inputUser = _input.inputUserString();
            final String buyProductCommand = "1";

            switch (inputUser) {
                case buyProductCommand:
                    buyProduct();                          //купить
                    break;
                case "2":
                    drinkSelect();                        //положить
                    break;
                case "0":
                    isRun = false;
                    break;
                default:
                    _menu.showError();
            }
        }
    }

    public void buyProduct(){
        boolean isRun = true;
        showAllProduct();
        _menu.chooseFromTheList();
        int indexProduct = _input.inputUserInt();
        Product product = getProduct(_products,--indexProduct);//_products.get(--indexProduct);

        if(product instanceof BottleOfWater){

            do {
                _menu.menuAddAmount();
                int amount = _input.inputUserInt();
                if (((BottleOfWater) product).checkAmount(amount)) {
                    ((BottleOfWater) product).reduceAmount(amount);
                    isRun = false;
                } else _menu.showError();
            } while (isRun);
        }else System.out.println("Заберите горячий напиток");;
    }

    private Product createProduct(Product product) {
        _menu.addName();
        String name = _input.inputUserString();
        _menu.addPrice();
        int price = _input.inputUserInt();
        _menu.addVolume();
        double volume = _input.inputUserDouble();
        product.setName(name);
        product.setPrice(price);
        product.setVolume(volume);
        return product;
    }

    public BottleOfWater setAmountByProduct(BottleOfWater product){
            _menu.addAmount();
            int amount = _input.inputUserInt();
            product.setAmount(amount);
            return product;
    }

    public void drinkSelect() {
        _menu.createDrinkType();
        Product product;
        int userSelection = _input.inputUserInt();

        switch (userSelection) {
            case 1:
                product = new BottleOfWater();
                product = createProduct(product);
                setAmountByProduct((BottleOfWater) product);
                _products.add((T) product);
                break;
            case 2:
                product = new HotDrink();
                product = createProduct(product);
                _products.add((T) product);
                break;
            default:
                _menu.showError();
        }
    }

    public  <U> U getProduct(ArrayList<U> u, int index){
        return u.get(index);
    }
}

