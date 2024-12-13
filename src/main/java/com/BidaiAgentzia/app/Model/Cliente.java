package com.BidaiAgentzia.app.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nombre;

    private String email;

    @ManyToMany(mappedBy = "clientes")
    private Set<Viaje> viajes;

}
