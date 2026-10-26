package Espresso.Overflow.Libreria.repository;

import Espresso.Overflow.Libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LibroRepository extends JpaRepository <Libro, Long> {
}
