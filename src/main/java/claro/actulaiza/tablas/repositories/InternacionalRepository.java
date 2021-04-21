package claro.actulaiza.tablas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import claro.actulaiza.tablas.entities.Internacional;

@Repository
public interface InternacionalRepository extends JpaRepository<Internacional, String>{

}
