package Espresso.Overflow.Libreria.repository;

import Espresso.Overflow.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    
    // Buscar libros por disponibilidad (para mostrar en el catálogo)
    List<Libro> findByDisponible(Boolean disponible);
}