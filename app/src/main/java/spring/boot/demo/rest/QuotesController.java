package spring.boot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.demo.quotes.Quote;
import spring.boot.demo.quotes.QuotesClient;

@RestController
class QuotesController {

  @Autowired
  QuotesClient quotesClient;

  @GetMapping("/random")
  Quote random() {
    return quotesClient.random();
  }

}