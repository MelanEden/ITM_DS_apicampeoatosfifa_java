package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "campeonato")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @Column(name = "año")
    private int año;
    
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion paisOrganizador;


    public Campeonato() {
    }


    public Campeonato(int id, String nombre, int año, Seleccion paisOrganizador) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.paisOrganizador = paisOrganizador;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getAño() {
        return año;
    }


    public void setAño(int año) {
        this.año = año;
    }


    public Seleccion getPaisOrganizador() {
        return paisOrganizador;
    }


    public void setPaisOrganizador(Seleccion paisOrganizador) {
        this.paisOrganizador = paisOrganizador;
    }

    
    

}
