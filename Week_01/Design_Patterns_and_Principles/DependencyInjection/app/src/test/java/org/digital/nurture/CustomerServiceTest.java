// src/test/java/org/digital/nurture/CustomerServiceTest.java
package org.digital.nurture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CustomerServiceTest {

    @Test
    public void testGetCustomerById() {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        Customer customer = service.getCustomerById(1);
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
    }
}
