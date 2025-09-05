# Customer Order Management System  

A Java-based application that manages orders, customers, products, and inventory for e-commerce businesses. The system connects to a MySQL database to streamline order processing, customer management, and product tracking.  

---

## Features  

- **Order Processing**: Place, view, and manage customer orders.  
- **Customer Management**: Create, update, and retrieve customer details.  
- **Product Management**: Track product inventory and details.  
- **Database Integration**: MySQL backend for persistent storage.  
- **GUI Support**: Java Swing interfaces for managing customers, products, and orders.  

---

## Technologies  

- Java (NetBeans IDE)  
- MySQL (via `mysql-connector`)  
- Ant build system (`build.xml`)  

---

## Project Structure  

```bash
├── build.xml                # Ant build configuration
├── ecommerce.sql            # Database schema (customers, products, orders)
├── manifest.mf              # Project metadata
├── mysql-connector.jar      # MySQL driver
├── src/
│   ├── CustomerEntity       # Customer model and CRUD
│   ├── ProductEntity        # Product and order models
│   ├── customerview         # Java Swing GUI forms
│   ├── Dbconnection         # Database connection logic
│   └── ecommerceordermanagementsystem # Main app logic
```

## Getting Started
Prerequisites

-**Java JDK (8 or later)

-**MySQL installed and running

-**NetBeans IDE (recommended)

Installation

Clone the repository:
```bash
git clone https://github.com/Tewodros-Berhane/Customer-Order-Management-With-JAVA.git
cd eoms
```
Import the database:
```bash
mysql -u root -p < ecommerce.sql
```
Open the project in NetBeans.
Add mysql-connector.jar to the project libraries.
Running
Build and run the project from NetBeans (or via Ant using build.xml).
