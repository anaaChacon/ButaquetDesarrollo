package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
	
	public static ArrayList<Integer> numSala(){
		//Instance of class SessionFactory
		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		
		//Hacer una consulta
		Iterator<?> iter = session.createQuery("select p.salas from Proyeccion p, Peliculas pe where p.peliculas = pe.idPelicula and pe.nombrePelicula = 'Frozen' GROUP BY p.salas").iterate();
		
		ArrayList<Integer>listaSalas = new ArrayList<>();
		
		while(iter.hasNext()){
			
			listaSalas.add(Integer.parseInt((String) iter.next()));
		}
		
		
		
		//Realize to transaction
		session.getTransaction().commit();
		//Close the sesion
		session.close();
				
		return listaSalas;
	}
}
