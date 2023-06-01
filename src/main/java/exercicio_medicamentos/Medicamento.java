package exercicio_medicamentos;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor

public class Medicamento {
	
	private String nome;
	private Administracao adm;
	List <String> contraindicacoes = new ArrayList<String>();
	List <String> indicacoes = new ArrayList<String>();
	

}
