import java.util.ArrayList;
import java.util.List;

/**
 * QueueOfCustomers class manages a queue of Customer objects.
 * It provides methods to add, remove, and retrieve customers from the queue.
 */
public class QueueOfCustomers {
    private List<Customer> customers; 

    /**
     * Constructor to initialize the QueueOfCustomers.
     * It creates a new ArrayList to store customers.
     */
    public QueueOfCustomers() {
        this.customers = new ArrayList<>();
    }

    /**
     * Adds a customer to the end of the queue.
     *
     * @param customer the Customer object to be added to the queue
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Removes and returns the customer at the front of the queue.
     *
     * @return the Customer object at the front of the queue, or null if the queue is empty
     */
    public Customer removeCustomer() {
        if (!customers.isEmpty()) {
            return customers.remove(0); 
        }
        return null; 
    }

    /**
     * Retrieves the next customer in the queue without removing them.
     *
     * @return the Customer object at the front of the queue, or null if the queue is empty
     */
    public Customer getNextCustomer() {
        if (!customers.isEmpty()) {
            return customers.get(0); 
        }
        return null; 
    }

    /**
     * Gets the current size of the queue.
     *
     * @return the number of customers currently in the queue
     */
    public int getCurrentQueueSize() {
        return customers.size(); 
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return customers.isEmpty(); 
    }

    /**
     * Retrieves a copy of the current customer queue.
     *
     * @return a List containing all customers in the queue
     */
    public List<Customer> getCustomerQueue() {
        return new ArrayList<>(customers); 
    }
}