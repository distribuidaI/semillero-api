package ar.edu.undav.semillero.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Juan Lagostena on 12/10/16
 * jlagostena@bitsense.com.ar
 * .
 */
@Entity
@Table(name="graduated")
public class Graduated {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Graduated() {
    }

    public Graduated(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
