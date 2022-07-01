package victor.sistemacriticafilmes.letscode.authorization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Table(name = "tb_perfil")
@Data
public class Perfil{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    
    private String nomePerfil;
    
    private String descricao;
    
}

