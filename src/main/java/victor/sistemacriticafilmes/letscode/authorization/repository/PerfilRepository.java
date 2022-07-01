package victor.sistemacriticafilmes.letscode.authorization.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import victor.sistemacriticafilmes.letscode.authorization.entity.Perfil;

@Repository
public interface PerfilRepository extends CrudRepository<Perfil, Long> {

}
