package ctrlf;

import org.fiep.senai.ctrlf.model.Login;
import org.fiep.senai.ctrlf.model.Usuario;
import org.fiep.senai.ctrlf.service.LoginService;
import org.fiep.senai.ctrlf.service.UsuarioService;

public class UsuarioLoginTest {

	public static void main(String[] args) {
		Login login = new Login();
		login.setUser("rudhi_5");
		login.setPassword("123");
		
		/*
		 * Usuario usuario = new Usuario(); usuario.setNomeCompleto("Rudimar Schmitz");
		 * usuario.setApelido("Rudhi");
		 */
		
		Usuario usuario = new UsuarioService().getById(2);
		
		//new UsuarioDao().save(usuario);
		
		//usuario.setLogin(login);
		login.setUsuario(usuario);
		
		if (!new LoginService().userExists(login.getUser())) {
			new LoginService().save(login);
			System.out.println("Login salvo.");
		} else {
			System.out.println("User já existe na tabela login.");
		}
		
		
		/*
		 * for (Usuario u : new UsuarioDao().getAll()) {
		 * System.out.println(u.getNomeCompleto()); }
		 */
	}
}
