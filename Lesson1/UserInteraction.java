//package org.example.Repeat.Lesson1;
//
//public class UserInteraction {
//    static private Menu _menu;
//    static private VendingMachine _vendingMachine;
//
//    public UserInteraction() {
//        _menu = new Menu();
//        _vendingMachine = new VendingMachine();
//    }
//
//    public static void addProduct(Product product){
//        _vendingMachine.add(product);
//    }
//
//    public static void start() {
//        boolean isRun = true;
//
//        while (isRun) {
//            _menu.selectUserStatus();
//            String inputUser = _menu.inputUserString();
//            switch (inputUser) {
//                case "1":
//                    buyDrink();//купить
//                    break;
//                case "2":
//                    addDrink();                        //положить
//                    break;
//                case "0":
//                    isRun = false;
//                    break;
//                default:
//                    _menu.showError();
//            }
//        }
//    }
//
//    static private void buyDrink() {
//        _menu.menuSelectDrink();
//        String inputUser = _menu.inputUserString();
//        _vendingMachine.showAllProduct();
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
//
//    static private void buyProduct() {
//        boolean isRun = true;
//        _menu.chooseFromTheList();
//        int indexProduct = _menu.inputUserInt();
//        Product product = _vendingMachine.getProductByIndex(indexProduct);
//
//        do {
//            _menu.menuAddAmount();
//            int amount = _menu.inputUserInt();
//            if (product.checkAmount(amount)) {
//                product.reduceAmount(amount);
//                isRun = false;
//            } else _menu.showError();
//        }while (isRun);
//    }
//
//    static private void addDrink() {
//        _menu.menuAddName();
//        String name = _menu.inputUserString();
//        _menu.menuAddPrice();
//        int price = _menu.inputUserInt();
//        _menu.menuAddVolume();
//        double volume = _menu.inputUserDouble();
//        Product product = new BottleOfWater(name, price, volume);
//        _vendingMachine.add(product);
//    }
//}
///**
// * 1 кто входит
// * 1.1 выбор напитков
// * 1.2 завести новый напиток
// * 1.1.1
// */