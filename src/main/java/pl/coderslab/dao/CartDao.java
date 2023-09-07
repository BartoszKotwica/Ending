//package pl.coderslab.dao;
//
//import pl.coderslab.entity.Cart;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class CartDao {
//    private static final Map<String, Cart> carts = new HashMap<>();
//
//    public static Cart getCart(String userId) {
//        return carts.computeIfAbsent(userId, k -> new Cart("id"));
//    }
//
//    public static void clearCart(String userId, Cart cart) {
//        carts.remove(userId, cart);
//    }
//}
