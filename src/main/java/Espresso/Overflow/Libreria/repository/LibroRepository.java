package Espresso.Overflow.Libreria.repository;

import Espresso.Overflow.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    
    // Buscar libros por disponibilidad (para mostrar en el catálogo)
    List<Libro> findByDisponible(Boolean disponible);
}