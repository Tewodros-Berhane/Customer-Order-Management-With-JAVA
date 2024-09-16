package CustomerEntity;

import Dbconnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerEntity {

    public boolean createCustomer(Customer customer) {

        try {
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();

            //Creating PreparedStatemnt Object
            PreparedStatement preparedStatement
                    = connection.prepareStatement("INSERT INTO customers(CUSTOMER_NAME,EMAIL,SHIPPING_ADDRES) VALUES(?,?,?)");
            preparedStatement.setString(1, customer.getCustomer_name());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getShipping_address());
            preparedStatement.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerEntity.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
        public boolean deleteCustomer(int customerId) {

            try {
                ConnectionClass con = new ConnectionClass();
                Connection connection = con.createConnection();

                // Creating PreparedStatement Object
                PreparedStatement preparedStatement
                        = connection.prepareStatement("DELETE FROM customers WHERE CUSTOMER_ID = ?");
                preparedStatement.setInt(1, customerId);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            } catch (SQLException ex) {
                Logger.getLogger(CustomerEntity.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        public boolean updatecustomer(Customer customer, Integer customerId) {
        try {
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            //Creating PreparedStatement Object
            PreparedStatement preparedStatement
                    = connection
                            .prepareStatement(
                                    "update customers set customer_name =?, "
                                    + "email =?,"
                                    + "shipping_addres =? where customer_id =?");

            //Setting values for each parameter
            preparedStatement.setString(1, customer.getCustomer_name());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getShipping_address());
            preparedStatement.setInt(4, customerId);
            //Executing Query
            preparedStatement.executeUpdate();
            System.out.println("Data inserted Successfully");
            return true;

        } catch (SQLException e) {

            System.out.println("Error while connecting to the database");
            return false;

        }
    }
        
        public ResultSet getAllCustomers() {

        try {
            String select = "SELECT *FROM customers";
            ConnectionClass con = new ConnectionClass();
            Connection connection = con.createConnection();
            PreparedStatement preparedStatement
                    = connection.prepareStatement(select);
            ResultSet rs = preparedStatement.executeQuery();

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerEntity.class.getName())
                    .log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}


