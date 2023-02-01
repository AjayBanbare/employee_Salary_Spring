package com.registration.registration.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="registrations")


public class employees {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="Da")
    private long da;
    @Column(name="Hra")
    private Long hra;
    @Column(name="Pa")
    private long pa;
    @Column(name="Tax")
    private long tax;
    @Column(name="Total")
    private long total;

}
