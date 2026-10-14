package Espresso.Overflow.Libreria.repository;

import Espresso.Overflow.Libreria.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    
    // Obtener préstamos de un usuario específico
    List<Prestamo> findByUsuarioId(Long usuarioId);

    // Obtener préstamos asignados a un libro concreto
    List<Prestamo> findByLibroId(Long libroId);
}