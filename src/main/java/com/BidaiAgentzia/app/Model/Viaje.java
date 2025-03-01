package com.BidaiAgentzia.app.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.BidaiAgentzia.app.Model.*;
import org.hibernate.annotations.Check;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destino;

    private int duracion; // Duración en días

    @OneToOne(mappedBy = "viaje", cascade = CascadeType.ALL, orphanRemoval = true)
    private GuiaTuristico guiaTuristico;

    @OneToMany(mappedBy = "viaje", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;

    @ManyToMany
    @JoinTable(
            name = "viaje_cliente",
            joinColumns = @JoinColumn(name = "viaje_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private Set<Cliente> clientes;

    @Embedded
    private InformacionAdicional infoAdicional;

    @ElementCollection
    @CollectionTable(name = "viaje_comentarios", joinColumns = @JoinColumn(name = "viaje_id"))
    @Column(name = "comentario")
    private List<String> comentarios;

}
