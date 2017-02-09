package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.SecondActivity;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;


import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SeleccionPrincipal extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox_2, comboBox, comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionPrincipal frame = new SeleccionPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SeleccionPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel datosCine = new JPanel();
		datosCine.setBackground(Color.DARK_GRAY);
		datosCine.setPreferredSize(new Dimension(1280,140));
		
		JLabel lblAragCinema = new JLabel("Arag\u00F3 Cinema");
		lblAragCinema.setForeground(Color.WHITE);
		lblAragCinema.setFont(new Font("Bebas Neue", Font.PLAIN, 63));
		
		//JLabel lblNewLabel = new JLabel();
		
		
		//URL path = getClass().getResource("ticketpeque.png");
		
		//Image img = new ImageIcon(path).getImage();
		
		//lblNewLabel.setIcon(new ImageIcon(img)); //ERA ESTO!!
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dam2\\workspace\\ButacaHibernate\\images\\ticketpeque.png"));
		
		
		JLabel lblUsuario = new JLabel("USUARIO: 589621");
		lblUsuario.setForeground(Color.LIGHT_GRAY);
		lblUsuario.setFont(new Font("Bebas Neue", Font.PLAIN, 24));
		
		JLabel lblLunes = new JLabel("LUNES 16/01/2017 15:30");
		lblLunes.setForeground(Color.LIGHT_GRAY);
		lblLunes.setFont(new Font("Bebas Neue", Font.PLAIN, 25));
		GroupLayout gl_datosCine = new GroupLayout(datosCine);
		gl_datosCine.setHorizontalGroup(
			gl_datosCine.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_datosCine.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblAragCinema)
					.addPreferredGap(ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
					.addGroup(gl_datosCine.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLunes, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario))
					.addGap(36))
		);
		gl_datosCine.setVerticalGroup(
			gl_datosCine.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_datosCine.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(21))
				.addGroup(Alignment.LEADING, gl_datosCine.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_datosCine.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_datosCine.createSequentialGroup()
							.addGap(2)
							.addComponent(lblUsuario)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblLunes, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAragCinema))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		datosCine.setLayout(gl_datosCine);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1268, GroupLayout.PREFERRED_SIZE)
						.addComponent(datosCine, GroupLayout.PREFERRED_SIZE, 1259, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(datosCine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JLabel lblSeleccionePelcula = new JLabel("SELECCIONE PEL\u00CDCULA");
		lblSeleccionePelcula.setForeground(Color.WHITE);
		lblSeleccionePelcula.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblSeleccionePelcula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccionePelcula.setBounds(0, 31, 244, 39);
		panel.add(lblSeleccionePelcula);
		
		JLabel lblSeleccioneSesin = new JLabel("SELECCIONE SESI\u00D3N\r\n");
		lblSeleccioneSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccioneSesin.setForeground(Color.WHITE);
		lblSeleccioneSesin.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblSeleccioneSesin.setBounds(0, 81, 244, 39);
		panel.add(lblSeleccioneSesin);
		
		JLabel lblSeleccioneSala = new JLabel("SELECCIONE SALA\r\n");
		lblSeleccioneSala.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccioneSala.setForeground(Color.WHITE);
		lblSeleccioneSala.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblSeleccioneSala.setBounds(0, 131, 244, 39);
		panel.add(lblSeleccioneSala);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox.setBounds(254, 31, 244, 36);
		//comboBox.add(SecondActivity.nombrePelicula());
		ArrayList<String>listado = new ArrayList<>();
		listado.addAll(SecondActivity.nombrePelicula());
		System.out.print(listado);
		
		
		for(int i = 0; i < listado.size(); i++){
			comboBox.addItem(listado.get(i));
		}
			   
		
		
		comboBox.addItemListener(this);
			   
		panel.add(comboBox);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setEnabled(false);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_1.setBounds(254, 81, 244, 36);
		panel.add(comboBox_1);
		
		 comboBox_2 = new JComboBox<String>();
		comboBox_2.setEnabled(false);
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_2.setBounds(254, 131, 244, 36);
		
		
		panel.add(comboBox_2);
		
		JLabel lblNDeButacas = new JLabel("N\u00BA de Butacas Selec.");
		lblNDeButacas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeButacas.setForeground(Color.WHITE);
		lblNDeButacas.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblNDeButacas.setBounds(0, 255, 244, 39);
		panel.add(lblNDeButacas);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setText("120\r\n");
		textField.setBounds(254, 258, 51, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSiguientePaso = new JButton("Siguiente Paso\r\n");
		btnSiguientePaso.setForeground(Color.WHITE);
		btnSiguientePaso.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		btnSiguientePaso.setBackground(new Color(0, 102, 255));
		btnSiguientePaso.setBounds(173, 382, 284, 56);
		panel.add(btnSiguientePaso);
		
		JLabel lblSeleccioneUbicacin = new JLabel("SELECCIONE UBICACI\u00D3N");
		lblSeleccioneUbicacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUbicacin.setForeground(Color.WHITE);
		lblSeleccioneUbicacin.setFont(new Font("Bebas Neue", Font.PLAIN, 45));
		lblSeleccioneUbicacin.setBounds(649, -13, 548, 117);
		panel.add(lblSeleccioneUbicacin);
		
		JLabel lblNewLabel_1 = new JLabel("VERDE: LIBRE");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bebas Neue", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(719, 375, 267, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblAsientoRojoSeleccionado = new JLabel("SELECCIONADO: AMARILLO");
		lblAsientoRojoSeleccionado.setForeground(Color.WHITE);
		lblAsientoRojoSeleccionado.setFont(new Font("Bebas Neue", Font.PLAIN, 19));
		lblAsientoRojoSeleccionado.setBounds(719, 405, 267, 39);
		panel.add(lblAsientoRojoSeleccionado);
		
		JLabel lblAsientoConPersona = new JLabel("ROJO: ASIENTO NO DISPONIBLE");
		lblAsientoConPersona.setForeground(Color.WHITE);
		lblAsientoConPersona.setFont(new Font("Bebas Neue", Font.PLAIN, 19));
		lblAsientoConPersona.setBounds(719, 436, 267, 39);
		panel.add(lblAsientoConPersona);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		 if (e.getStateChange() == ItemEvent.SELECTED) {
			  
			  ArrayList<String>listadoSalas = new ArrayList<>();
			 
			  String nombrePelicula = (String) comboBox.getSelectedItem();
			  
				listadoSalas.addAll(SecondActivity.numSala(nombrePelicula));
				
				 comboBox_2.removeAllItems();
				 
					for(int i = 0; i < listadoSalas.size(); i++){
						  
						   comboBox_2.addItem(listadoSalas.get(i));
						   
						  
					}
					
					 int itemCount = comboBox_2.getItemCount();

					   if(itemCount > 1){
						   comboBox_2.setEnabled(true);
					   }else{
						   comboBox_2.setEnabled(false);
					   }
					
					 
					   
					   
        	
        	 }else{
        		 
        	 }
         }
	
}
