package edu.eci.dosw.OficioYa.service;

import edu.eci.dosw.OficioYa.model.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {
    
    private final WorkerService workerService;

    public AuthService(WorkerService workerService) {
        this.workerService = workerService;
    }

    public Optional<User> authenticate(String email, String password) {
        return workerService.findAll().stream()
                .filter(u -> u.getEmail() != null && u.getEmail().equals(email))
                .filter(u -> u.getPassword() != null && u.getPassword().equals(password))
                .findFirst();
    }
}