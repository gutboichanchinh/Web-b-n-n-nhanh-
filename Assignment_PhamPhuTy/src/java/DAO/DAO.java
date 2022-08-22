/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DBcontext.DBcontext;
import Entity.Account;
import Entity.FoodInCart;
import Entity.Foods;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Account checkLogin(String u, String p) throws SQLException, Exception {
        String sql = "select *  from Account where [user] = ? and Pass= ? ";
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,u);
            ps.setString(2, p);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Account(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            }
            
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
    public List<Foods> getAllFood() throws SQLException, Exception {
        String sql = "select a.*,b.cname  from Foods a, Restaurant b where a.Restaurantid = b.cid ";
         List<Foods> list = new ArrayList<>();
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
           
            rs = ps.executeQuery();
            while(rs.next()){
               list.add( new Foods(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(7)));
            }
            
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return list;

    }
    
    
    public static void main(String[] args) throws Exception {
        System.out.println(new DAO().getAllFoodInCart().toString());
    }
    public boolean addToCart(String id) throws SQLException, Exception {
        String sql = "insert Cart (pId,quantity) values (?,?)";
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,Integer.parseInt(id));
            ps.setInt(2, 1);
            
            if(ps.executeUpdate()>0){
                return true;
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
     public boolean deleteFoodCart(String id) throws SQLException, Exception {
        String sql = "  delete   from Cart where pid =?";
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,Integer.parseInt(id));
          
            
            if(ps.executeUpdate()>0){
                return true;
            }
            
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
     public boolean deleteAllFoodCart(String id) throws SQLException, Exception {
        String sql = "  delete from Cart ";
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
         
          
            
            if(ps.executeUpdate()>0){
                return true;
            }
            
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
     public List<FoodInCart> getAllFoodInCart() throws SQLException, Exception {
        String sql = "select a.*,b.quantity,b.totalAmount  from Foods a, cart b where a.id = b.pid ";
         List<FoodInCart> list = new ArrayList<>();
        try{
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(sql);
           
            rs = ps.executeQuery();
            while(rs.next()){
               list.add( new FoodInCart(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8)));
            }
            
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return list;

    }
    
        
}
