package com.company;

import java.util.HashMap;
import java.util.Map;

import static com.company.ProductType.DIGITAL;
import static com.company.ProductType.PHYSICAL;

public class Catalogue {
    private static final Map<String,Product> productMap = new HashMap<>();
    public final static int SHIPPING_RATE = 5;

    static {
        productMap.put("Brush & paste", new Product("Brush & paste",1000, PHYSICAL, 400));
        productMap.put("Lux",new Product("Lux",100, DIGITAL, -1));
    }

    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
