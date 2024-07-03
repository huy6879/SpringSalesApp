/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mua88.hibernatedemov1;

import com.mua88.pojo.Product;
import com.mua88.repository.ProductRepository;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author MSI VN
 */
public class HibernateDemoV1 {

    public static void main(String[] args) {
        Map<String,String> params = new HashMap<>();
        params.put("cateId", "2");
        
        ProductRepository pre = new ProductRepository();
        pre.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n", p.getId(), p.getName(), p.getPrice()));
        
    }
}