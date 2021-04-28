package spring.boot.demo.quotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuotesClient {

    private Logger logger = LoggerFactory.getLogger(getClass());

    // public static final String endpointURL = "https://quoters.apps.pcfone.io/api/random";
    public static final String endpointURL = "http://localhost:28080/random";

    @Autowired
    RestTemplate restTemplate;

    public Quote random() {
        logger.trace("getting random quote");
        return restTemplate.getForObject(endpointURL, Quote.class);
    }

}
