package ar.edu.undav.semillero.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="node")
public class Node {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;

    @OneToMany(cascade = CascadeType.MERGE)
	private List<Graduated> graduateds = new ArrayList<>();

   
	   public Node() {
    }

    public Node(String name, String address,Graduated graduated) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public void addGraduated(Graduated graduated) {
        this.graduateds.add(graduated);
    }

}