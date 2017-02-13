package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controlador.SecondActivity;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.UIManager;

public class SeleccionDescuento extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton button, btnPasoAtrs;
	Border emptyBorder = BorderFactory.createEmptyBorder();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDescuento frame = new SeleccionDescuento();
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
	public SeleccionDescuento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.GRAY);
		
		JLabel lblDescuentoCarnetJove = new JLabel("DESCUENTO CARNET JOVE\r\n");
		lblDescuentoCarnetJove.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentoCarnetJove.setForeground(Color.WHITE);
		lblDescuentoCarnetJove.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblDescuentoCarnetJove.setBounds(0, 105, 244, 39);
		panel_1.add(lblDescuentoCarnetJove);
		
		JLabel lblDescuentoDesempleado = new JLabel("DESCUENTO DESEMPLEADO\r\n");
		lblDescuentoDesempleado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentoDesempleado.setForeground(Color.WHITE);
		lblDescuentoDesempleado.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblDescuentoDesempleado.setBounds(0, 179, 244, 39);
		panel_1.add(lblDescuentoDesempleado);
		
		JLabel lblDescuentoPensionista = new JLabel("DESCUENTO PENSIONISTA\r\n");
		lblDescuentoPensionista.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentoPensionista.setForeground(Color.WHITE);
		lblDescuentoPensionista.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblDescuentoPensionista.setBounds(0, 255, 244, 39);
		panel_1.add(lblDescuentoPensionista);
		
		JComboBox<Integer> comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(254, 105, 101, 36);
		
		/****************************************************************/
		ArrayList<Integer>listaButacasSeleccionadas = new ArrayList<>();
		int numButacas = Integer.parseInt(SeleccionPrincipal.textField.getText().toString());
		for(int i = 0; i < numButacas + 1; i++){
			listaButacasSeleccionadas.add(i);
		}
		
		for(int i = 0; i < listaButacasSeleccionadas.size(); i++){
			comboBox.addItem(listaButacasSeleccionadas.get(i));
		}
		/****************************************************************/
		comboBox.setSelectedItem(null);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(254, 179, 101, 36);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(254, 255, 101, 36);
		panel_1.add(comboBox_2);
		
		JLabel label_3 = new JLabel("N\u00BA de Butacas Selec.");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_3.setBounds(0, 27, 244, 39);
		panel_1.add(label_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(254, 30, 48, 36);
		textField.setText(SeleccionPrincipal.textField.getText().toString());
		panel_1.add(textField);
		
		button = new JButton("Siguiente Paso\r\n");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		button.setBackground(new Color(0, 102, 255));
		button.setBounds(548, 382, 284, 56);
		button.addActionListener(this);
		button.setBorder(emptyBorder);
		button.setFocusable(false);
		panel_1.add(button);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtotal.setForeground(Color.BLACK);
		lblSubtotal.setFont(new Font("Bebas Neue", Font.PLAIN, 53));
		lblSubtotal.setBounds(650, 1, 548, 77);
		panel_1.add(lblSubtotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(1280, 140));
		panel_2.setBackground(Color.DARK_GRAY);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("./src/images/ticketpeque.png"));
		
		JLabel label_9 = new JLabel(SecondActivity.nombreCine(Integer.parseInt(Login.usuarioInt.getText().toString())));
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Bebas Neue", Font.PLAIN, 63));
		
		/*JLabel label_9 = new JLabel("Arag\u00F3 Cinema");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Bebas Neue", Font.PLAIN, 63));*/
		/*Poner la fecha actual*/
		Date date = new Date();
		//Caso 1: obtenerhora y fecha y salida por pantalla con formato:
		DateFormat hourdateFormat = new SimpleDateFormat("EEEEEEEEE dd/MM/yyyy  HH:mm");

        JLabel label_10 = new JLabel(hourdateFormat.format(date).toString());
        
		//JLabel label_10 = new JLabel("LUNES 16/01/2017 15:30");
		label_10.setForeground(Color.LIGHT_GRAY);
		label_10.setFont(new Font("Bebas Neue", Font.PLAIN, 25));
		
		JLabel label_11 = new JLabel("USUARIO: " + Login.usuarioInt.getText().toString());
		label_11.setForeground(Color.LIGHT_GRAY);
		label_11.setFont(new Font("Bebas Neue", Font.PLAIN, 24));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(41)
					.addComponent(label_8)
					.addGap(18)
					.addComponent(label_9)
					.addPreferredGap(ComponentPlacement.RELATED, 719, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_11)
						.addComponent(label_10))
					.addGap(23))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(119, Short.MAX_VALUE)
					.addComponent(label_8)
					.addGap(21))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_9)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label_11)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1264, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1268, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1259, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 681, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		btnPasoAtrs = new JButton("Paso Anterior");
		btnPasoAtrs.setForeground(Color.WHITE);
		btnPasoAtrs.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		btnPasoAtrs.setBackground(new Color(0, 102, 255));
		btnPasoAtrs.setBounds(224, 382, 284, 56);
		btnPasoAtrs.addActionListener(this);
		btnPasoAtrs.setBorder(emptyBorder);
		btnPasoAtrs.setFocusable(false);
		panel_1.add(btnPasoAtrs);
		
		JLabel lblPrecioEntradas = new JLabel("PRECIO ENTRADAS");
		lblPrecioEntradas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioEntradas.setForeground(Color.WHITE);
		lblPrecioEntradas.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblPrecioEntradas.setBounds(673, 75, 244, 39);
		panel_1.add(lblPrecioEntradas);
		
		JLabel lblDescuentos = new JLabel("DESCUENTOS");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setForeground(Color.WHITE);
		lblDescuentos.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblDescuentos.setBounds(673, 112, 244, 39);
		panel_1.add(lblDescuentos);
		
		JLabel lblPrecioConDescuento = new JLabel("PRECIO CON DESCUENTO");
		lblPrecioConDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioConDescuento.setForeground(Color.WHITE);
		lblPrecioConDescuento.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblPrecioConDescuento.setBounds(673, 149, 244, 39);
		panel_1.add(lblPrecioConDescuento);
		
		JLabel lblIva = new JLabel("IVA 21%");
		lblIva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIva.setForeground(Color.WHITE);
		lblIva.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblIva.setBounds(673, 215, 244, 39);
		panel_1.add(lblIva);
		
		JLabel label_1 = new JLabel("780\u20AC\r\n");
		label_1.setBackground(new Color(211, 211, 211));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(SystemColor.controlHighlight);
		label_1.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_1.setBounds(927, 75, 244, 39);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("70\u20AC\r\n");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(SystemColor.controlHighlight);
		label_2.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_2.setBounds(927, 112, 244, 39);
		panel_1.add(label_2);
		
		JLabel label_4 = new JLabel("710\u20AC");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(SystemColor.controlHighlight);
		label_4.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_4.setBounds(927, 149, 244, 39);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("149,10\u20AC");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(SystemColor.controlHighlight);
		label_5.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_5.setBounds(927, 215, 244, 39);
		panel_1.add(label_5);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar\r\n");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAPagar.setForeground(Color.WHITE);
		lblTotalAPagar.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
		lblTotalAPagar.setBounds(673, 286, 244, 39);
		panel_1.add(lblTotalAPagar);
		
		JLabel label = new JLabel("859,10\u20AC");
		label.setBackground(UIManager.getColor("Button.light"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(SystemColor.controlHighlight);
		label.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
		label.setBounds(927, 286, 244, 39);
		panel_1.add(label);
		panel.setLayout(gl_panel);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			SeleccionPago f = new SeleccionPago();
			
			f.setVisible(true);	
			setVisible(false);
		}
		
		if(e.getSource() == btnPasoAtrs){
			SeleccionPrincipal f = new SeleccionPrincipal();
			f.setVisible(true);
			setVisible(false);
		}
	}
}
