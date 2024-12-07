package com.klef.jfsd.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/springmvc")
public class ClientController {

    @GetMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Welcome, " + username + "!");
        return "greet"; // Ensure "greet.jsp" exists in /WEB-INF/views/
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @PostMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @GetMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("division", num1 / num2);
        return "demo2";
    }

    @GetMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @PostMapping("/submitProduct")
    public String submitProduct(
            @RequestParam("productId") String productId,
            @RequestParam("productName") String productName,
            @RequestParam("price") double price,
            @RequestParam("description") String description,
            Model model) {
        model.addAttribute("productId", productId);
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        return "productDetails";
    }

    @GetMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiplyNumbers";
    }

    @PostMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversed1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversed2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("addition", num1 + num2);
        return "calculate";
    }
}
