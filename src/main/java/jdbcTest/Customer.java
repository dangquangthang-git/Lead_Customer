package jdbcTest;

public class Customer {
    private long userId;
    private String customerId;

    public Customer(long userId, String customerId) {
        this.userId = userId;
        this.customerId = customerId;
    }

    public long getUserId() {
        return userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId=" + userId +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
