package Espresso.Overflow.Libreria.repository;
import Espresso.Overflow.Libreria.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PrestamoRepository extends JpaRepository <Prestamo, Long> {
}
