package ar.edu.undav.semillero.domain.repository;

import ar.edu.undav.semillero.domain.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Juan Lagostena on 12/10/16
 * jlagostena@bitsense.com.ar
 * .
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}

