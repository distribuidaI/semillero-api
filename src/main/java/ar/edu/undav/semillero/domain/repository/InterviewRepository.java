package ar.edu.undav.semillero.domain.repository;


import ar.edu.undav.semillero.domain.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Juan Lagostena on 12/10/16
 * jlagostena@bitsense.com.ar
 * .
 */
public interface InterviewRepository extends JpaRepository<Interview, Long> {
}

