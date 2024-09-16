package CustomerEntity;

public class Customer {

    private Integer id;
    private final String customer_name;
    private final String email;
    private final String shipping_address;

    public Customer(String customer_name, String email, String shipping_address) {
        this.customer_name = customer_name;
        this.email = email;
        this.shipping_address = shipping_address;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", customer_name=" + customer_name + ", email=" + email + ", shipping_address=" + shipping_address + '}';
    }

    
}
