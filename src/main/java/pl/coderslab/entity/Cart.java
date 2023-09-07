//package pl.coderslab.entity;
//
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Component
//@Getter
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class Cart {
//    private final List<CartItem> cartItems;
//    public void addToCart(CartItem cartItem) {
//        cartItems.add(cartItem);
//    }
//    public List<CartItem> getCartItems() {
//        return new ArrayList<>(cartItems);
//    }
//    public Optional<CartItem> getAndIncrementItemQuantity(Long id, Integer quantity) {
//        return cartItems.stream()
//                .filter(ci -> ci.getProduct().getId().equals(id))
//                .peek(ci -> ci.setQuantity(ci.getQuantity() + quantity))
//                .findFirst();
//    }
//    public int getTotalItemsQuantity() {
//        return cartItems.stream()
//                .mapToInt(CartItem::getQuantity)
//                .sum();
//    }
//    public BigDecimal getTotalItemsValue() {
//        double value = cartItems.stream()
//                .mapToDouble(Cart::getSameProductsValue)
//                .sum();
//
//        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP);
//    }
//    private static double getSameProductsValue(CartItem cartItem) {
//        Product product =
//        return cartItem.getQuantity() * cartItem.getProduct().getPrice();
//    }
//    public void removeFromCart(CartItem cartItem) {
//        cartItems.remove(cartItem);
//    }
//}
