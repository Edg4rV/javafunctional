package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal java function
        Customer Maria = new Customer("Maria","77777");
        greetCustomer(Maria);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(Maria);

        greetCustomerConsumerV2.accept(Maria,false);

    }

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + " ,thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber: "************"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " ,thanks for registering phone number " +
                    customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " ,thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;

        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
