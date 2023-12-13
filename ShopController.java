package com.example.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Collection;

@Controller
public class ShopController {
    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        super();
        this.shopService = shopService;
    }

    @GetMapping("/")
    public String home(Model m) {
        Collection<Shop> shops = this.shopService.getShops();
        m.addAttribute("shops", shops);
        return "home";
    }

    @GetMapping("/add-form")
    public String addForm() {
        return "add_form";
    }

    @PostMapping("/add-form")
    public String addShop(@ModelAttribute Shop s) {
        this.shopService.addShop(s);
        return "redirect:/";
    }

    @GetMapping("/about-me")
    public String about_me() {
        return "about";
    }

    @GetMapping("/shops")
    public String getShops() {
        this.shopService.getShops();
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteShop(@PathVariable Long id) {
        this.shopService.deleteShop(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editShop(@PathVariable Long id, Model model) {
        Shop editShop = this.shopService.getShop(id);
        model.addAttribute("shop", editShop);
        return "edit";
    }
    @PostMapping("/edit")
    public String updateShop(@ModelAttribute("shop") Shop shop) {
    	System.out.println(shop);
        this.shopService.updateShop(shop);
        return "redirect:/";
   }


    @GetMapping("/view/{id}")
    public String viewShop(@PathVariable Long id,Model model) {
        Shop viewShop = this.shopService.getShop(id);
        model.addAttribute("shop", viewShop);
        return "view";
}
    @PostMapping("/view")
    public String viewShop(@ModelAttribute("shop") Shop shop) {
        System.out.println(shop);
        this.shopService.viewShop(shop);
        return "redirect:/";
    }
   
    @PostMapping("/sum")
    public String calculateSum(Model model) {
        Collection<Shop> shops = this.shopService.getShops();
        double totalSum = shops.stream().mapToDouble(shop -> shop.getPrice() * shop.getCount()).sum();
        model.addAttribute("totalSum", totalSum);
        model.addAttribute("shops", shops);
        return "redirect:/";
    }
}


