package by.it.han.jd02_01;

public interface ShoppingCardAction {
    void takeCart(); //взял корзину

    int putToCart(Good good, int num); //положил товар в корзину(возвращает число товаров)
}
