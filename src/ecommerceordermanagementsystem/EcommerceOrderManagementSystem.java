package ecommerceordermanagementsystem;

import Dbconnection.ConnectionClass;
import java.sql.Connection;

public class EcommerceOrderManagementSystem {

    public static void main(String[] args) {
        
        ConnectionClass con = new ConnectionClass();
        Connection connection = con.createConnection();
        
        if(connection==null) {
            System.out.println("error connection");
        } else {
            System.out.println("connected successfully");
        }
    }

}
