package vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controlador.SecondActivity;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;

public class SeleccionPago extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JButton btnPagar, btnImprimir;
	Border emptyBorder = BorderFactory.createEmptyBorder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionPago frame = new SeleccionPago();
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
	public SeleccionPago() {
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

		JLabel lblEfectivo = new JLabel("EFECTIVO");
		lblEfectivo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEfectivo.setForeground(Color.WHITE);
		lblEfectivo.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblEfectivo.setBounds(0, 37, 244, 39);
		panel_1.add(lblEfectivo);

		JLabel lblTarjetaCrditodbito = new JLabel("TARJETA CR\u00C9DITO/D\u00C9BITO");
		lblTarjetaCrditodbito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTarjetaCrditodbito.setForeground(Color.WHITE);
		lblTarjetaCrditodbito.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblTarjetaCrditodbito.setBounds(0, 95, 244, 39);
		panel_1.add(lblTarjetaCrditodbito);

		JLabel lblChequeRegalo = new JLabel("CHEQUE REGALO");
		lblChequeRegalo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChequeRegalo.setForeground(Color.WHITE);
		lblChequeRegalo.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblChequeRegalo.setBounds(0, 153, 244, 39);
		panel_1.add(lblChequeRegalo);

		JLabel lblCuponesGroupn = new JLabel("CUPONES, GROUP\u00D3N...");
		lblCuponesGroupn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuponesGroupn.setForeground(Color.WHITE);
		lblCuponesGroupn.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblCuponesGroupn.setBounds(0, 211, 244, 39);
		panel_1.add(lblCuponesGroupn);

		JLabel lblGratuito = new JLabel("GRATUITO");
		lblGratuito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGratuito.setForeground(Color.WHITE);
		lblGratuito.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblGratuito.setBounds(0, 269, 244, 39);
		panel_1.add(lblGratuito);

		btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon("./src/images/imp_blac.png"));
		btnImprimir.setEnabled(false);
		btnImprimir.setForeground(Color.WHITE);
		btnImprimir.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		btnImprimir.setBackground(new Color(0, 102, 255));
		btnImprimir.setBounds(548, 382, 284, 56);
		btnImprimir.setBorder(emptyBorder);
		btnImprimir.setFocusable(false);
		panel_1.add(btnImprimir);
		btnImprimir.addActionListener(this);

		JLabel label_4 = new JLabel("SUBTOTAL");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Bebas Neue", Font.PLAIN, 53));
		label_4.setBounds(650, 1, 548, 77);
		panel_1.add(label_4);

		btnPagar = new JButton("Pagar");
		btnPagar.setIcon(null);
		btnPagar.addActionListener(this);
		btnPagar.setForeground(Color.WHITE);
		btnPagar.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		btnPagar.setBackground(new Color(0, 102, 255));
		btnPagar.setBounds(224, 382, 284, 56);
		btnPagar.setBorder(emptyBorder);
		btnPagar.setFocusable(false);
		panel_1.add(btnPagar);

		JLabel label_5 = new JLabel("PRECIO ENTRADAS");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_5.setBounds(660, 75, 257, 39);
		panel_1.add(label_5);

		JLabel label_6 = new JLabel("DESCUENTOS");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_6.setBounds(673, 112, 244, 39);
		panel_1.add(label_6);

		JLabel label_7 = new JLabel("PRECIO CON DESCUENTO");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_7.setBounds(673, 149, 244, 39);
		panel_1.add(label_7);

		JLabel label_8 = new JLabel("IVA 21%");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_8.setBounds(673, 215, 244, 39);
		panel_1.add(label_8);

		JLabel label_9 = new JLabel("780\u20AC\r\n");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setForeground(SystemColor.controlHighlight);
		label_9.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_9.setBackground(new Color(211, 211, 211));
		label_9.setBounds(927, 75, 244, 39);
		panel_1.add(label_9);

		JLabel label_10 = new JLabel("70\u20AC\r\n");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(SystemColor.controlHighlight);
		label_10.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_10.setBounds(927, 112, 244, 39);
		panel_1.add(label_10);

		JLabel label_11 = new JLabel("710\u20AC");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setForeground(SystemColor.controlHighlight);
		label_11.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_11.setBounds(927, 149, 244, 39);
		panel_1.add(label_11);

		JLabel label_12 = new JLabel("149,10\u20AC");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setForeground(SystemColor.controlHighlight);
		label_12.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_12.setBounds(927, 215, 244, 39);
		panel_1.add(label_12);

		JLabel label_13 = new JLabel("Total a pagar\r\n");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
		label_13.setBounds(673, 286, 244, 39);
		panel_1.add(label_13);

		JLabel label_14 = new JLabel("859,10\u20AC");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setForeground(SystemColor.controlHighlight);
		label_14.setFont(new Font("Bebas Neue", Font.PLAIN, 48));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(927, 286, 244, 39);
		panel_1.add(label_14);

		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(1280, 140));
		panel_2.setBackground(Color.DARK_GRAY);

		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("./src/images/ticketpeque.png"));

		JLabel label_16 = new JLabel(SecondActivity.nombreCine(Integer.parseInt(Login.usuarioInt.getText().toString())));
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Bebas Neue", Font.PLAIN, 63));
		
		
		/*JLabel label_16 = new JLabel("Arag\u00F3 Cinema");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Bebas Neue", Font.PLAIN, 63));*/
		/*Poner la fecha actual*/
		Date date = new Date();
		//Caso 1: obtenerhora y fecha y salida por pantalla con formato:
		DateFormat hourdateFormat = new SimpleDateFormat("EEEEEEEEE dd/MM/yyyy  HH:mm");
        JLabel label_17 = new JLabel(hourdateFormat.format(date).toString());
	//	JLabel label_17 = new JLabel("LUNES 16/01/2017 15:30");
		label_17.setForeground(Color.LIGHT_GRAY);
		label_17.setFont(new Font("Bebas Neue", Font.PLAIN, 25));

		JLabel label_18 = new JLabel("USUARIO: " + Login.usuarioInt.getText().toString());
		label_18.setForeground(Color.LIGHT_GRAY);
		label_18.setFont(new Font("Bebas Neue", Font.PLAIN, 24));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(41)
					.addComponent(label_15)
					.addGap(18)
					.addComponent(label_16)
					.addPreferredGap(ComponentPlacement.RELATED, 741, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_18)
						.addComponent(label_17))
					.addGap(23))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(119, Short.MAX_VALUE)
					.addComponent(label_15)
					.addGap(21))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_16)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(label_18)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE).addComponent(panel_1,
										Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		JComboBox comboTarjeta = new JComboBox();
		comboTarjeta.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboTarjeta.setBackground(Color.WHITE);
		comboTarjeta.setBounds(254, 98, 101, 36);
		comboTarjeta.addItem("Si");
		comboTarjeta.addItem("No");
		comboTarjeta.setSelectedIndex(1);
		comboTarjeta.addItemListener(this);
		
		JComboBox comboEfectivo = new JComboBox();
		comboEfectivo.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboEfectivo.setBackground(Color.WHITE);
		comboEfectivo.setBounds(254, 40, 101, 36);
		comboEfectivo.addItem("Si");
		comboEfectivo.addItem("No");
		comboEfectivo.setSelectedIndex(1);
		comboEfectivo.addItemListener(this);
		panel_1.add(comboEfectivo);
		panel_1.add(comboTarjeta);
		

		JComboBox comboGratuito = new JComboBox();
		comboGratuito.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboGratuito.setBackground(Color.WHITE);
		comboGratuito.setBounds(254, 272, 101, 36);
		comboGratuito.addItem("Si");
		comboGratuito.addItem("No");
		comboGratuito.setSelectedIndex(1);
		comboGratuito.addItemListener(this);
		
				JComboBox comboCheque = new JComboBox();
				comboCheque.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
				comboCheque.setBackground(Color.WHITE);
				comboCheque.setBounds(254, 156, 101, 36);
				comboCheque.addItem("Si");
				comboCheque.addItem("No");
				comboCheque.setSelectedIndex(1);
				comboCheque.addItemListener(this);
				panel_1.add(comboCheque);
		
				JComboBox comboCupon = new JComboBox();
				comboCupon.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
				comboCupon.setBackground(Color.WHITE);
				comboCupon.setBounds(254, 214, 101, 36);
				comboCupon.addItem("Si");
				comboCupon.addItem("No");
				comboCupon.setSelectedIndex(1);
				comboCupon.addItemListener(this);
				panel_1.add(comboCupon);
		panel_1.add(comboGratuito);
		
		panel.setLayout(gl_panel);

		setLocationRelativeTo(null);
		setResizable(false);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == btnPagar) {

			try {
				Thread.sleep(3000);
				btnPagar.setText("Pagado");
				btnPagar.setEnabled(false);
				btnImprimir.setEnabled(true);

			} catch (InterruptedException x) {
				x.printStackTrace();
			}
		}

		if (e.getSource() == btnImprimir) {

		}

	}


	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}