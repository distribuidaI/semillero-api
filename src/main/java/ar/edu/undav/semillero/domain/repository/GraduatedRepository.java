package ar.edu.undav.semillero.domain.repository;

import ar.edu.undav.semillero.domain.entity.Graduated;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Juan Lagostena on 12/10/16
 * jlagostena@bitsense.com.ar
 * .
 */
public interface GraduatedRepository extends JpaRepository<Graduated, Long> {

    Collection<Graduated> findByName(String name);

}

