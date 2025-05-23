package campeonatosfifa.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;


public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {

    @Query("SELECT c FROM Campeonato c WHERE s.nombre LIKE '%' || ?1|| '%'")
    public List<Campeonato> buscar(String nombre);
    
} 