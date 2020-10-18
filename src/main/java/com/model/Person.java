package com.model;

import javax.persistence.*;

@Entity
@Table(name = "population")
public class Person {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "populationIdSeq", sequenceName = "clients_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "populationIdSeq")
    private Integer id;

    @Column(name = "deseases")
    private String deseases;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private Virus virusType;

    @Column(name = "infection_date")
    private String infection_date;

    @Column(name = "virus_stage")
    private String virus_stage;

    @Column(name = "life_termination_date")
    private String life_termination_date;

    //… getters and setters
}
