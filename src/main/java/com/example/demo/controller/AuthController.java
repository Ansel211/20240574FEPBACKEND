package com.example.demo.controller;

import com.example.demo.JwtUtil;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credenciales) {
        String ruc = credenciales.get("ruc");
        String usuario = credenciales.get("usuario");
        String password = credenciales.get("password");

        // Búsqueda real en la base de datos de Neon
        Optional<Usuario> userOpt = usuarioRepository.findByRucAndUsuarioAndPassword(ruc, usuario, password);

        if (userOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("mensaje", "RUC, usuario o contraseña incorrectos."));
        }

        Usuario user = userOpt.get();
        String token = jwtUtil.generateToken(user);

        Map<String, Object> response = new HashMap<>();
        response.put("token", token);

        Map<String, String> userData = new HashMap<>();
        userData.put("ruc", user.getRuc());
        userData.put("usuario", user.getUsuario());
        userData.put("razonSocial", user.getRazonSocial());

        response.put("usuario", userData);

        return ResponseEntity.ok(response);
    }
}