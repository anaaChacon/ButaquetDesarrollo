package controlador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import models.Proyeccion;
import models.Salas;
import models.SessionFactoryUtil;

public class SecondActivity {

	public static ArrayList<String> nombrePelicula(){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select nombrePelicula from Peliculas").iterate();
		
		ArrayList<String>listaPeliculas = new ArrayList<>();
		
		while(iter.hasNext()){
			
			listaPeliculas.add(String.valueOf(iter.next()));
		}
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
		
		return listaPeliculas;
		
	}
	
	public static ArrayList<String> numSala(String pelicula){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select p.salas from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = '"+pelicula+"' GROUP BY p.salas").iterate();
		
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
	/*public static String dateToMySQLDate(Date fecha){
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(fecha);
	}
	
	public static ArrayList<String> fecha(){
		
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select p.hora, p.fecha from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = 'Frozen' GROUP BY p.hora").iterate();
		
		ArrayList<String>listaSalas = new ArrayList<>();
		
		while(iter.hasNext()){
			
			//creamos un objeto de tipo calendar
			
			Calendar date1 = Calendar.getInstance();
			Date fecha = new Date();
			
			//A ese objeto le instanciamos la fecha de alquiler que introduce el usuario
			date1.setTime(fecha);
			
			//Después le sumamos los dias de alquiler, es decir el tiempo que tiene para devolverlo
			//date1.add(Calendar.DAY_OF_YEAR, + diasFinAlquiler);	
						
			SimpleDateFormat dateformatter = new SimpleDateFormat("E dd/MM/yyyy ");
			
			//Aquí mostraremos la fecha en la que tiene que devolverla		
			listaSalas.add(String.valueOf(dateformatter.format(date1.getTime())));
			
		}
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
		
		return listaSalas;
		
	}*/
}
