package com.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "viruses")
public class Virus {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="virustype")
    @OneToMany(mappedBy = "virus", cascade = CascadeType.ALL)
    private Set<Person> persons;

    @Column(name = "virus_name")
    private int virus_name;

    @Column(name = "probability_transmission")
    private String probability_transmission;

    @Column(name = "average_duration")
    private String average_duration;

    @Column(name = "mortality")
    private String mortality;

    @Column(name = "probability_re_infection")
    private String probability_re_infection;

    //… getters and setters

//    public Set<virus_type> getVirusTypes() {
//        return virusTypes;
//    }
//
//    public void setVirusTypes(Set<virus_type> virusTypes) {
//        this.virusTypes = virusTypes;
//    }
}
