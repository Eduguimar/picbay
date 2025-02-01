package dev.edu.picbay.dominio.repositorios;

import dev.edu.picbay.dominio.entidades.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
