package victor.sistemacriticafilmes.letscode.authorization;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import victor.sistemacriticafilmes.letscode.authorization.entity.Perfil;
import victor.sistemacriticafilmes.letscode.authorization.entity.Usuario;
import victor.sistemacriticafilmes.letscode.authorization.repository.PerfilRepository;
import victor.sistemacriticafilmes.letscode.authorization.repository.UsuarioRepository;

@SpringBootApplication
public class AuthorizationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationApplication.class, args);
	}

	
	
}
