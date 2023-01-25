package fnif;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 引数あり
 * 戻り値なし
 */
public class ConsumerExample {
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", your phone number is : " + customer.customerPhoneNumber);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Maria", "999-9999-9999");

        /**
         * 普通に書いた場合
         */
        greetCustomer(customer);

        /**
         * 引数が1つの場合
         */
        Consumer<Customer> greetCustomerConsumer = (c) -> {
            System.out.println("Hello " + c.customerName + ", your phone number is : " + c.customerPhoneNumber);
        };

        greetCustomerConsumer.accept(customer);

        /**
         * 引数が2つの場合
         */
        BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (c, showPhoneNumber) -> {
            if (showPhoneNumber) {
                System.out.println("Hello " + c.customerName + ", your phone number is : " + c.customerPhoneNumber);
            } else {
                System.out.println("Hello " + c.customerName + ", your phone number is : ***********");
            }
        };

        greetCustomerConsumerV2.accept(customer, false);
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
