package controlador;


import models.SessionFactoryUtil;
import vista.Login;
import vista.SeleccionPrincipal;

import java.util.Iterator;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainActivity {
	
	

	public static boolean Logeo2() {
		// TODO Auto-generated method stub
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		boolean correcto = false;
		
		//Comprobar que los campos no estan vacíos
		if(Login.usuarioInt.getText().toString().isEmpty() || Login.passwordField.getPassword().toString().isEmpty()){
			JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			correcto = false;
		}else{
			
			Iterator<?> iter = session.createQuery("from Empleados where acceso_usuario = '"+Integer.parseInt(Login.usuarioInt.getText())+"' "
					+ "and acceso_contrasenya = '"+Integer.parseInt(Login.passwordField.getText().toString())+"'").iterate();


			
			if(iter.hasNext()){
				System.out.println("OK, si existe");
				
				correcto = true;
				
			}else{
				JOptionPane.showMessageDialog(null, "Los datos no son correctos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
				correcto = false;
			}
			
			//Realize to transaction
			session.getTransaction().commit();
			//Close the sesion
			session.close();
			//
//return false;

}
		return correcto;
	
	}

	

}
