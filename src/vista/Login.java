package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.MainActivity;

import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements  ActionListener {

	private JPanel contentPane;
	public static JTextField usuarioInt;
	public static JPasswordField passwordField;
	private String[] args;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dam2\\workspace\\ButacaHibernate\\images\\ticket.png"));
		lblNewLabel.setBounds(445, 55, 380, 192);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INTRODUZCA SUS CREDENCIALES DE USUARIO\r\n");
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bebas Neue", Font.PLAIN, 38));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(10, 253, 1244, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Bebas Neue", Font.PLAIN, 40));
		lblUsuario.setBounds(453, 307, 146, 41);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Bebas Neue", Font.PLAIN, 40));
		lblContrasea.setBounds(370, 359, 227, 41);
		contentPane.add(lblContrasea);
		
		usuarioInt = new JTextField();
		usuarioInt.setFont(new Font("Bebas Neue", Font.PLAIN, 25));
		usuarioInt.setBounds(609, 307, 198, 40);
		contentPane.add(usuarioInt);
		usuarioInt.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(this);
		/*
		btnEntrar.addActionListener(new ActionListener() {
			private String[] args;

			public void actionPerformed(ActionEvent e) {
				SeleccionPrincipal.main(args);
			}
		});*/
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBackground(new Color(0, 102, 255));
		btnEntrar.setFont(new Font("Bebas Neue", Font.PLAIN, 40));
		btnEntrar.setBounds(547, 421, 183, 43);
		contentPane.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Bebas Neue", Font.PLAIN, 25));
		passwordField.setBounds(607, 358, 200, 41);
		contentPane.add(passwordField);
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) { 
		// TODO Auto-generated method stub
		MainActivity m = new MainActivity();
		
		if(m.Logeo2() == true){
			
			SeleccionPrincipal f = new SeleccionPrincipal();
			
			f.setVisible(true);
			
			setVisible(false);
			
			//JOptionPane.showMessageDialog(null, "Bienvenido/a usuario: " + Login.usuarioInt.getText().toString(), "Home", JOptionPane.INFORMATION_MESSAGE);
		}else{
			
			setVisible(true);
		}
		
		//System.exit(0);
		//SeleccionPrincipal.main(args);
	}
}
