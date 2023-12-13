package com.example.Shop;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
//	private HashMap<String, Shop> db = new HashMap<>();
//    public ShopRepository(){
//        super();
//        Shop s1 = new Shop("Venus",2000,20);
//        Shop s2 = new Shop("Teso",2000,20);
//        this.db.put(s1.getName(),s1);
//        this.db.put(s2.getName(),s2);
//    }
//    public Collection<Shop> getAll(){
//        return db.values();
//    }
//
//    public void deleteById(String name){
//        this.db.remove(name);
//    }
//
//    public void addShop(Shop s) {
//        this.db.put(s.getName(),s);
//    }
//
//    public Shop getByID(String name) {
//        Shop s = this.db.get(name);
//        return s;
//    }
//
//    public void update(Shop updateShop) {
//        this.db.replace(updateShop.getName(),updateShop);
//    }
//
//    public void save(Shop updateShop) {
//        this.db.replace(updateShop.getName(), updateShop);
//    }

}
