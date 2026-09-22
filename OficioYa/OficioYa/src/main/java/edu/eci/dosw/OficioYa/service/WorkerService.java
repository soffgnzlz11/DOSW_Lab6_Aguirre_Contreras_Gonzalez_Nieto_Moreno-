package edu.eci.dosw.OficioYa.service;

import edu.eci.dosw.OficioYa.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class WorkerService {

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
    }

    public List<User> findAll() {
        return new ArrayList<>(workers);
    }

    public Optional<User> findById(Integer id) {
        return workers.stream()
                .filter(w -> w.getId().equals(id))
                .findFirst();
    }

    public User create(User user) {
        user.setId((int) idGenerator.getAndIncrement());
        user.setStatus("ACTIVO");
        workers.add(user);
        return user;
    }

    public Optional<User> update(Integer id, User updatedUser) {
        Optional<User> currentOpt = workers.stream()
            .filter(w -> w.getId().equals(id))
            .findFirst();

        if (currentOpt.isEmpty()) {
            return Optional.empty();
        }

        User current = currentOpt.get();
        if ("INACTIVO".equals(current.getStatus())) {
            return Optional.empty();
        }

        updatedUser.setId(id);
        updatedUser.setStatus(current.getStatus());
        workers.set(workers.indexOf(current), updatedUser);
        return Optional.of(updatedUser);
    }

    public Optional<User> inactivate(Integer id) {
        for (User worker : workers) {
            if (worker.getId().equals(id)) {
                worker.setStatus("INACTIVO");
                return Optional.of(worker);
            }
        }
        return Optional.empty();
    }
}