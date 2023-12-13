package com.example.Shop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
    private String name;
    private Integer price;
    private Integer count;
    public Shop() {
    	super();
    }
    public Shop(Long id, String name, Integer price, Integer count){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;

    }
    public Long getId() {
    	return id;
    }
    public void setId(Long Id) {
    	this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String toString(){
        return "ProId: "+this.id+" ProName:"+ this.name + "  Price:" + this.price+"  count: "+this.count;
    }

}
