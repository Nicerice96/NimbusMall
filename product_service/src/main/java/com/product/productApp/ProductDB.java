package com.product.productApp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class ProductDB{

    Connection conn = null;

    public ProductDB(){

        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/MyApp","postgres","1128819345");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

    public void save (Product product){

        String query = "insert into product (productTitle, productType, productPrice) values (?, ?, ?)";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, product.getProductTitle());
            st.setString(2, product.getProductType().name());
            st.setInt(3, product.getProductPrice());
            st.execute();
        }catch(Exception e){
            System.out.println(e);
        }

    }


    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String query = "select productTitle, productType, productPrice from product";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductTitle(rs.getString(1));
                p.setProductType(Product.ProductType.valueOf(rs.getString(2).toUpperCase()));
                p.setProductPrice(rs.getInt(3));
                products.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }

    
}