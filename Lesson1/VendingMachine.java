package org.example.Repeat.Lesson1;

import java.util.ArrayList;

public  class VendingMachine {
     private ArrayList<Product> _list;
     private Menu _menu;
     private InputUser _input;


    public VendingMachine() {
        _list = new ArrayList<>();
        _menu = new Menu();
        _input = new InputUser();
    }

    public void add(Product product) {
        _list.add(product);
    }

    private boolean checksIfTheProductIsAvailable(String name) {
        boolean status = false;

        for (int i = 0; i < _list.size(); i++) {
            Product product = _list.get(i);
            String nameProduct = product.getName();

            if (nameProduct.equals(name)) {
                status = true;
            }
        }
        return status;
    }

    public  void showAllProduct() {
        for (int i = 0; i < _list.size(); i++) {
            Product product = _list.get(i);
//            System.out.print("№ " + i);
            product.show();
        }
    }

    public  void start() {
        boolean isRun = true;

        while (isRun) {
            _menu.selectUserStatus();
            String inputUser = _input.inputUserString();
            switch (inputUser) {
                case "1":
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

//     private void buyDrink() {
//        _menu.chooseFromTheList();
//        String inputUser = _input.inputUserString();
//        showAllProduct();
//
//        switch (inputUser) {
//            case "1":
//                buyProduct();
//                break;
//            case "2":
//                System.out.println("Возьмите ваш чай ");
//                break;
//            default:
//                _menu.showError();
//        }
//    }

    private void buyProduct() {
        boolean isRun = true;
        showAllProduct();
        _menu.chooseFromTheList();
        int indexProduct = _input.inputUserInt();
        Product product = _list.get(--indexProduct);

        do {
            _menu.menuAddAmount();
            int amount = _input.inputUserInt();
            if (product.checkAmount(amount)) {
                product.reduceAmount(amount);
                isRun = false;
            } else _menu.showError();
        } while (isRun);
    }

     private void addDrink(Product product) {
        _menu.addName();
        String name = _input.inputUserString();
        _menu.addPrice();
        int price = _input.inputUserInt();
        _menu.addVolume();
        double volume = _input.inputUserDouble();
        _menu.addAmount();
        int amount = _input.inputUserInt();
        product.setName(name);
        product.setPrice(price);
        product.setVolume(volume);
        product.setAmount(amount);
        _list.add(product);
    }

    public void drinkSelect(){
        _menu.createDrinkType();
        Product product;
        int userSelection = _input.inputUserInt();

        switch (userSelection){
            case 1:
                product = new BottleOfWater();
                addDrink(product);
                break;
            case 2:
                product = new HotDrink();
                addDrink(product);
                break;
            default:
                _menu.showError();
        }
    }
}

