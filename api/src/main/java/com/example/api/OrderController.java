package com.example.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<?> getOrder(@RequestParam(required = false) String id) {
        // Validación de entrada: el parámetro debe ser numérico
        if (id == null || !id.matches("\\d+")) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\": \"El parámetro 'id' debe ser numérico\"}");
        }

        // Respuesta válida
        return ResponseEntity.ok("{\"orderId\": " + id + ", \"status\": \"ok\"}");
    }
}