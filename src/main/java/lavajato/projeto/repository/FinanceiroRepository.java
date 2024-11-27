package lavajato.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lavajato.projeto.entity.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {

}
