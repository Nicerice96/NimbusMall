package main.java.com.product.product_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDB{

    Connection conn = null;

    public ProductDB(){

        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/MyApp","postgres","7GUBFKBu!!");
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
            st.setString(2, product.getProductType());
            st.setInt(3, product.getProductPrice());
            st.execute();
        }catch(Exception e){
            System.out.println(e);
        }

    }


    public List<Product> getAll(){
        
        String query = "select productTitle, productType, productPrice from product";
        try{
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProductTitle(rs.getString(1));
                p.setProductType(rs.getProductType(2));
                p.setProductPrice(rs.getInt(3));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}