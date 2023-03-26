package ctrlf;

import org.fiep.senai.ctrlf.dao.LoginDao;
import org.fiep.senai.ctrlf.dao.UsuarioDao;
import org.fiep.senai.ctrlf.model.Login;
import org.fiep.senai.ctrlf.model.Usuario;
import org.fiep.senai.ctrlf.service.LoginService;

public class UsuarioLoginTest {

	public static void main(String[] args) {
		Login login = new Login();
		login.setUser("rudhi_4");
		login.setPassword("123");
		
		/*
		 * Usuario usuario = new Usuario(); usuario.setNomeCompleto("Rudimar Schmitz");
		 * usuario.setApelido("Rudhi");
		 */
		
		Usuario usuario = new UsuarioDao().getById(2);
		
		//new UsuarioDao().save(usuario);
		
		//usuario.setLogin(login);
		login.setUsuario(usuario);
		
		if (!new LoginDao().userExists(login.getUser())) {
			new LoginDao().save(login);
		} else {
			System.out.println("User já existe na tabela login.");
		}
		
		
		/*
		 * for (Usuario u : new UsuarioDao().getAll()) {
		 * System.out.println(u.getNomeCompleto()); }
		 */
	}
}
