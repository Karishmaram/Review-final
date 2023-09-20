package com.skcet.SuperMarket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.skcet.SuperMarket.model.Market;
import com.skcet.SuperMarket.repository.MarketRepository;

import java.util.List;



@RestController
@RequestMapping("/api/mark")
@CrossOrigin // Allowing Cross-Origin Resource Sharing (CORS)
public class MarketController {
    @Autowired
    private MarketRepository marRepository;

    // Create a new book
    @PostMapping
    public ResponseEntity<Market> createMarket(@RequestBody Market market) {
        Market savedMarket = marRepository.save(market);
        return ResponseEntity.ok(savedMarket);
    }

    // Get all books
    @GetMapping
    public ResponseEntity<List<Market>> getAllMarkets() {
        List<Market> markets = marRepository.findAll();
        return ResponseEntity.ok(markets);
    }

    // Get a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Market> getMarketById(@PathVariable Long id) {
        Market market = marRepository.findById(id).orElse(null);
        if (market != null) {
            return ResponseEntity.ok(market);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Update a book by ID
    @PutMapping("/{id}")
    public ResponseEntity<Market> updateMarket(@PathVariable Long id, @RequestBody Market updatedMarket) {
        Market existingMarket = marRepository.findById(id).orElse(null);
        if (existingMarket != null) {
            existingMarket.setCustomer(updatedMarket.getCustomer());
            existingMarket.setDept(updatedMarket.getDept());
            existingMarket.setProduct(updatedMarket.getProduct());
            Market savedMarket = marRepository.save(existingMarket);
            return ResponseEntity.ok(savedMarket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        Market market = marRepository.findById(id).orElse(null);
        if (market != null) {
            marRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


