package ProductEntity;
import java.time.LocalDate;



public class Order {
    private Integer id;
    private final Integer customer_id;
    private final LocalDate order_date;
    private final Double total_amount;

    public Order(Integer customer_id, LocalDate order_date, Double total_amount) {
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.total_amount = total_amount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    @Override
    public String toString() {
        return "OrderClass{" + "id=" + id + ", customer_id=" + customer_id + ", order_date=" + order_date + ", total_amount=" + total_amount + '}';
    }
}

