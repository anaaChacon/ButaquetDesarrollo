package controlador;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import models.Peliculas;
import models.Proyeccion;
import models.Salas;
import models.SessionFactoryUtil;

public class SecondActivity {
	
	public static String nombreCine(int userId){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select c.nombre from Cines c, Empleados e WHERE e.cines = c.idCine and e.accesoUsuario = '"+userId+"'").iterate();
		
		String nombreCine;
		
		nombreCine=(String) iter.next();
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
		
		return nombreCine;
		
	}

	public static ArrayList<String> nombrePelicula(){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("from Peliculas").iterate();
		
		ArrayList<String>listaPeliculas = new ArrayList<>();
		
		while(iter.hasNext()){
			Peliculas pelicula = (Peliculas) iter.next();
			listaPeliculas.add(pelicula.getNombrePelicula());
		}
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
		
		return listaPeliculas;
		
	}
	
	public static ArrayList<String> numSala(String pelicula, String fecha, String hora){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select p.salas from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula"
				+ " and pe.nombrePelicula = '"+pelicula+"'"
						+ " and p.fecha = '"+fecha+"'"
								+ " and p.hora = '"+hora+"' GROUP BY p.salas").iterate();
		
		ArrayList<String>listaSalas = new ArrayList<>();
		
		while(iter.hasNext()){
			Salas sala = (Salas) iter.next();	
			listaSalas.add("Sala " + sala.getIdSala());
		}
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();		
		return listaSalas;
	}
	
	//Create method for date system date
	public static String dateToMySQLDate(Date fecha){
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(fecha);
	}
	
	public static ArrayList<String> fecha(String pelicula){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		//Iterator<?> iter2 = session.createQuery("select p.hora, p.fecha from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = '"+pelicula+"' GROUP BY p.hora").iterate();
		Iterator<?> iter = session.createQuery("select p.fecha from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = '"+pelicula+"' GROUP BY p.hora").iterate();
		Iterator<?> iter2 = session.createQuery("select p.hora from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = '"+pelicula+"' GROUP BY p.hora").iterate();
		
		ArrayList<String>listaFecha = new ArrayList<>();
		while(iter.hasNext()){
			listaFecha.add(String.valueOf(iter.next()));
		}
		
		ArrayList<String>listaHora= new ArrayList<>();
		//Proyeccion p= new Proyeccion();
		while(iter2.hasNext()){

			//Proyeccion proyec = (Proyeccion) iter2.next();
			
			listaHora.add(String.valueOf(iter2.next()));
			//Creamos un objeto de tipo Proyeccion
			/*Proyeccion p = (Proyeccion)iter.next();
			p.getFecha();
			p.getHora();
			
			
			//creamos un objeto de tipo calendar
			
			Calendar date1 = Calendar.getInstance();
			Date fecha = new Date();
			
			//A ese objeto le instanciamos la fecha de alquiler que introduce el usuario
			date1.setTime(fecha);
			
			//Después le sumamos los dias de alquiler, es decir el tiempo que tiene para devolverlo
			//date1.add(Calendar.DAY_OF_YEAR, + diasFinAlquiler);	
						
			SimpleDateFormat dateformatter = new SimpleDateFormat("E dd/MM/yyyy ");
			
			//Aquí mostraremos la fecha en la que tiene que devolverla		
			listaSalas.add(String.valueOf(dateformatter.format(date1.getTime())));*/
			
			
		}
		ArrayList<String>listaSalas = new ArrayList<>();
		
		for(int i = 0; i < listaFecha.size(); i++){
			
				listaSalas.add(listaFecha.get(i) +"   "+ listaHora.get(i));
			
		}
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
		
		return listaSalas;
		
	}
}
