package escuelaing.edu.co.JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByAddress(String address);
}
