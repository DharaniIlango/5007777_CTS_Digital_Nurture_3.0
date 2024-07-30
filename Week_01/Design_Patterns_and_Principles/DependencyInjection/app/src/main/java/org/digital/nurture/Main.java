// src/main/java/org/digital/nurture/Main.java
package org.digital.nurture;

public class Main {
    public static void main(String[] args) {
        // Create the repository and service
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        Customer customer = service.getCustomerById(1);
        System.out.println(customer);
    }
}
