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
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String contact;

    public Company() {
    }

    public Company(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
