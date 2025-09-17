package com.example.api;

import com.example.api.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    // Endpoint para generar un token de prueba
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String token = JwtUtil.generateToken(username);
        return Map.of("token", token);
    }
}