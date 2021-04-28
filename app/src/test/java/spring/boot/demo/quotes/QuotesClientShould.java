/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package spring.boot.demo.quotes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuotesClientShould {

    @Autowired
    QuotesClient quotesClient;
    
    @Test void getRandomQuote() {
        final Quote random = quotesClient.random();
        assertNotNull(random);
        System.out.println("QuotesClientShould.getRandomQuote()" + random.getType());
    }
}