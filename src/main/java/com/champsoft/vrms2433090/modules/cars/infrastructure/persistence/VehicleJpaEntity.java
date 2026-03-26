package com.champsoft.vrms2433090.modules.cars.infrastructure.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleJpaEntity {
    @Id
    public String id;
    @Column(nullable = false, unique = true)
    public String vin;
    @Embedded
    public VehicleSpecsEmbeddable specs;
    @Column(nullable = false)
    public String status;
}
