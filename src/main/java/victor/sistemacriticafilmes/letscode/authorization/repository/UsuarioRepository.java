package victor.sistemacriticafilmes.letscode.authorization.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import victor.sistemacriticafilmes.letscode.authorization.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	Usuario findByUsername(String username);
}
