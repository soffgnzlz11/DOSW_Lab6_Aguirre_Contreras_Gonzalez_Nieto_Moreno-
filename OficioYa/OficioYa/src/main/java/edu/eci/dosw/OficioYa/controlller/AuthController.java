package edu.eci.dosw.OficioYa.controlller;

import edu.eci.dosw.OficioYa.dto.LoginRequest;
import edu.eci.dosw.OficioYa.model.User;
import edu.eci.dosw.OficioYa.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest request) {
        return authService.authenticate(request.getEmail(), request.getPassword())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
}