/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductEntity;
import ProductEntity.Order;
import CustomerEntity.CustomerEntity;
import Dbconnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L1GHT
 */
public class ProductRepository {
    
    public ResultSet getAllProducts() {

        try {
            String select = "SELECT *FROM products";
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            PreparedStatement preparedStatement
                    = connection.prepareStatement(select);
            ResultSet rs = preparedStatement.executeQuery();

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName())
                    .log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet getAllOrders() {

        try {
            String select = "SELECT *FROM orders";
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            PreparedStatement preparedStatement
                    = connection.prepareStatement(select);
            ResultSet rs = preparedStatement.executeQuery();

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName())
                    .log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet getAllOrdersDetails() {

        try {
            String select = "SELECT *FROM orders_details";
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            PreparedStatement preparedStatement
                    = connection.prepareStatement(select);
            ResultSet rs = preparedStatement.executeQuery();

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName())
                    .log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean placeOrder(Order order){
        
        try {
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();

            //Creating PreparedStatemnt Object
            PreparedStatement preparedStatement
                    = connection.prepareStatement("INSERT INTO orders (customer_id, order_date, total_amount) VALUES(?,?,?)");
            preparedStatement.setInt(1, order.getCustomer_id());
            LocalDate orderDate;
            orderDate = order.getOrder_date();
            preparedStatement.setDate(2, java.sql.Date.valueOf(orderDate));
            preparedStatement.setDouble(3, order.getTotal_amount());
            
            
            preparedStatement.executeUpdate();
            System.out.println("Data inserted succssfully");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerEntity.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int getOrderId() {
        try {
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            int orderId = 0;
            
            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT order_id FROM orders ORDER BY order_id DESC LIMIT 1;");
            
            // Execute the query and retrieve the result
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Check if the result set contains any rows
            if (resultSet.next()) {
                orderId = resultSet.getInt("order_id");
            }
            
            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
            
            return orderId;
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
            
    }
    
    
}
