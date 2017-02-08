package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import javax.swing.JCheckBoxMenuItem;

public class SeleccionPago extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblTarjetaCrditodbito = new JLabel("TARJETA CR\u00C9DITO/D\u00C9BITO");
		lblTarjetaCrditodbito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTarjetaCrditodbito.setForeground(Color.WHITE);
		lblTarjetaCrditodbito.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblTarjetaCrditodbito.setBounds(0, 85, 244, 39);
		panel_1.add(lblTarjetaCrditodbito);
		
		JLabel lblChequeRegalo = new JLabel("CHEQUE REGALO");
		lblChequeRegalo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChequeRegalo.setForeground(Color.WHITE);
		lblChequeRegalo.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblChequeRegalo.setBounds(0, 149, 244, 39);
		panel_1.add(lblChequeRegalo);
		
		JLabel lblCuponesGroupn = new JLabel("CUPONES, GROUP\u00D3N...");
		lblCuponesGroupn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuponesGroupn.setForeground(Color.WHITE);
		lblCuponesGroupn.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblCuponesGroupn.setBounds(0, 215, 244, 39);
		panel_1.add(lblCuponesGroupn);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(254, 152, 101, 36);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(254, 218, 101, 36);
		panel_1.add(comboBox_2);
		
		JLabel lblEfectivo = new JLabel("EFECTIVO");
		lblEfectivo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEfectivo.setForeground(Color.WHITE);
		lblEfectivo.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblEfectivo.setBounds(0, 27, 244, 39);
		panel_1.add(lblEfectivo);
		
		JButton button = new JButton("Siguiente Paso\r\n");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		button.setBackground(new Color(0, 102, 255));
		button.setBounds(548, 382, 284, 56);
		panel_1.add(button);
		
		JLabel label_4 = new JLabel("SUBTOTAL");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Bebas Neue", Font.PLAIN, 53));
		label_4.setBounds(650, 1, 548, 77);
		panel_1.add(label_4);
		
		JButton button_1 = new JButton("Paso Anterior");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Bebas Neue", Font.PLAIN, 46));
		button_1.setBackground(new Color(0, 102, 255));
		button_1.setBounds(224, 382, 284, 56);
		panel_1.add(button_1);
		
		JLabel label_5 = new JLabel("PRECIO ENTRADAS");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_5.setBounds(673, 75, 244, 39);
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
		label_15.setIcon(new ImageIcon("C:\\Users\\dam2\\workspace\\ButacaHibernate\\images\\ticketpeque.png"));
		
		JLabel label_16 = new JLabel("Arag\u00F3 Cinema");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Bebas Neue", Font.PLAIN, 63));
		
		JLabel label_17 = new JLabel("LUNES 16/01/2017 15:30");
		label_17.setForeground(Color.LIGHT_GRAY);
		label_17.setFont(new Font("Bebas Neue", Font.PLAIN, 25));
		
		JLabel label_18 = new JLabel("USUARIO: 589621");
		label_18.setForeground(Color.LIGHT_GRAY);
		label_18.setFont(new Font("Bebas Neue", Font.PLAIN, 24));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1259, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(41)
					.addComponent(label_15)
					.addGap(18)
					.addComponent(label_16)
					.addPreferredGap(ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_18))
					.addGap(36))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 140, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
					.addContainerGap(44, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1254, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1268, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1259, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblGratuito = new JLabel("GRATUITO");
		lblGratuito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGratuito.setForeground(Color.WHITE);
		lblGratuito.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblGratuito.setBounds(0, 274, 244, 39);
		panel_1.add(lblGratuito);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setBackground(Color.GRAY);
		chckbxNewCheckBox.setFont(new Font("Bebas Neue", Font.PLAIN, 49));
		chckbxNewCheckBox.setBounds(254, 36, 30, 30);
		panel_1.add(chckbxNewCheckBox);
		
		Checkbox checkbox = new Checkbox("\r\n");
		checkbox.setBackground(Color.GRAY);
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 40));
		checkbox.setBounds(257, 85, 138, 41);
		panel_1.add(checkbox);
		panel.setLayout(gl_panel);
	}
}
