package portafolio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portafolio.demo.models.TextosModel;

@Repository
public interface ITextosRepository extends JpaRepository<TextosModel, Long> {
    

}
