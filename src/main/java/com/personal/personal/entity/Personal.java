package com.personal.personal.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="personal")
@Data
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name="fecha_nacimiento")
    private LocalDate fechaNacimiento;
    @Column(name="horas_lab")
    private Double horasLab;
    private String cargo;
    @Column(name="lugar_trabajo")
    private String lugarTrabajo;

}
