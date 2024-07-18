package br.unoeste.fipp.socialcare.DataBase.repositories;


import br.unoeste.fipp.socialcare.DataBase.entities.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface atendenteRepository extends JpaRepository<Atendente, Long> {

    /*
    boolean existsByCpf(String Cpf);
    FisicalPerson findByCpf(String Cpf);
    void deleteByCpf(String cpf);*/

}
