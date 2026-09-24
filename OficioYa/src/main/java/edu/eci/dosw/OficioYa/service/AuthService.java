package edu.eci.dosw.OficioYa.service;

import edu.eci.dosw.OficioYa.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthService.class);

    private final WorkerService workerService;

    public AuthService(WorkerService workerService) {
        this.workerService = workerService;
    }

    public Optional<User> authenticate(String email, String password) {
        log.debug("Intentando autenticar usuario con correo: {}", email);

        Optional<User> result = workerService.findAll().stream()
                .filter(u -> u.getEmail() != null && u.getEmail().equals(email))
                .filter(u -> u.getPassword() != null && u.getPassword().equals(password))
                .findFirst();

        if (result.isPresent()) {
            log.info("Autenticación exitosa para correo: {}", email);
        } else {
            log.warn("Autenticación fallida para correo: {}", email);
        }
        return result;
    }
}