package by.it.vasileuskaya.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    Customer customer;
    List<Good> goodsInCart;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.goodsInCart = new ArrayList<>();

    }

    public int addToCart(Good good) {
        goodsInCart.add(good);
        return goodsInCart.size();
    }
}
