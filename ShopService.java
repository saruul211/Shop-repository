package com.example.Shop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
@Service
public class ShopService {
    private ShopRepository shopRepository;
    @Autowired
    public ShopService(ShopRepository shopRepository){
        super();
        this.shopRepository = shopRepository;
    }
    public Collection<Shop> getShops(){
        return this.shopRepository.findAll();
    }
    public void addShop(Shop s){
        this.shopRepository.save(s);
    }
    public void deleteShop(Long id){
        this.shopRepository.deleteById(id);
    }
    public Shop getShop(Long id) {
        Shop shop = this.shopRepository.getById(id);
        return shop;
    }
    public void updateShop(Shop updateShop) {
        this.shopRepository.save(updateShop);
    }

    public void viewShop(Shop updateShop) {
        this.shopRepository.save(updateShop);
    }
  
    public void calculateSum(Shop totalSum) {
        this.shopRepository.save(totalSum);
    }
}