//package pl.coderslab.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import pl.coderslab.dao.ProductDao;
//import pl.coderslab.entity.Cart;
//import pl.coderslab.entity.CartItem;
//import pl.coderslab.entity.Product;
//
//import java.util.List;
//import java.util.Optional;
//
//
//@Controller
//@RequiredArgsConstructor
//public class CartController {
//
//    private final Cart cart;
//    private final ProductDao productDao;
//
//    @RequestMapping("/addtocart")
//    @ResponseBody
//    public String addToCart(@RequestParam(required = false) Long id,
//                            @RequestParam(defaultValue = "1") Integer quantity) {
//        if (id == null || id < 1 || id > 10) {
//            return "There is no available item with id " + id;
//        }
//
//        Optional<CartItem> cartItemOpt = cart.getAndIncrementItemQuantity(id, quantity);
//
//        CartItem cartItem;
//
//        if (cartItemOpt.isEmpty()) {
//            cartItem = new CartItem();
//            cart.addToCart(cartItem);
//        } else {
//            cartItem = cartItemOpt.get();
//        }
//
//        return String.format("Dodano do koszyka: %s, cena %.2f, sztuk %s",
//                cartItem.getProduct().getName(),
//                cartItem.getProduct().getPrice(),
//                quantity);
//    }
//
//    @RequestMapping("/cart")
//    public String showCart(Model model) {
//        model.addAttribute("cartItems", cart.getCartItems());
//        model.addAttribute("uniqueItemsQty", cart.getCartItems().size());
//        model.addAttribute("totalItemsQty", cart.getTotalItemsQuantity());
//        model.addAttribute("cartValue", cart.getTotalItemsValue());
//        return "cart";
//    }
//}