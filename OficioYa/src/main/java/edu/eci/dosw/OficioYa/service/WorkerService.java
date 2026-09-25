package edu.eci.dosw.OficioYa.service;

import edu.eci.dosw.OficioYa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class WorkerService {

    private static final Logger log = LoggerFactory.getLogger(WorkerService.class);

    private final List<User> workers = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public WorkerService() {
        User demo = new User();
        demo.setId((int) idGenerator.getAndIncrement());
        demo.setName("Trabajador Demo");
        demo.setEmail("demo@ejemplo.com");
        demo.setPassword("1234");
        demo.setPhone("3000000000");
        demo.setStatus("ACTIVO");
        workers.add(demo);
        log.info("WorkerService inicializado con trabajador demo id: {}", demo.getId());
    }

    public List<User> findAll() {
        log.debug("Consultando todos los trabajadores. Total actual: {}", workers.size());
        return new ArrayList<>(workers);
    }

    public Optional<User> findById(Integer id) {
        log.debug("Buscando trabajador con id: {}", id);
        Optional<User> result = workers.stream()
                .filter(w -> w.getId().equals(id))
                .findFirst();

        if (result.isPresent()) {
            log.info("Trabajador encontrado con id: {}", id);
        } else {
            log.warn("No se encontró trabajador con id: {}", id);
        }
        return result;
    }

    public User create(User user) {
        user.setId((int) idGenerator.getAndIncrement());
        user.setStatus("ACTIVO");
        workers.add(user);
        log.info("Trabajador creado con id: {} y correo: {}", user.getId(), user.getEmail());
        return user;
    }

    public Optional<User> update(Integer id, User updatedUser) {
        log.debug("Intentando actualizar trabajador con id: {}", id);

        Optional<User> currentOpt = workers.stream()
                .filter(w -> w.getId().equals(id))
                .findFirst();

        if (currentOpt.isEmpty()) {
            log.warn("No se pudo actualizar: trabajador con id {} no existe", id);
            return Optional.empty();
        }

        User current = currentOpt.get();
        if ("INACTIVO".equals(current.getStatus())) {
            log.warn("No se pudo actualizar: trabajador con id {} está INACTIVO", id);
            return Optional.empty();
        }

        updatedUser.setId(id);
        updatedUser.setStatus(current.getStatus());
        workers.set(workers.indexOf(current), updatedUser);
        log.info("Trabajador actualizado con id: {}", id);
        return Optional.of(updatedUser);
    }

    public Optional<User> inactivate(Integer id) {
        log.debug("Intentando inactivar trabajador con id: {}", id);
        for (User worker : workers) {
            if (worker.getId().equals(id)) {
                worker.setStatus("INACTIVO");
                log.info("Trabajador inactivado con id: {}", id);
                return Optional.of(worker);
            }
        }
        log.warn("No se pudo inactivar: trabajador con id {} no existe", id);
        return Optional.empty();
    }
}