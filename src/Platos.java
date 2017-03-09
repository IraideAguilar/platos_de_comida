import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Platos extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Platos frame = new Platos();
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
	public Platos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JRadioButton radioTortillaConCebolla = new JRadioButton("Tortilla con cebolla");
		buttonGroup.add(radioTortillaConCebolla);

		JRadioButton radioTortillaSinCebolla = new JRadioButton("Tortilla sin cebolla");
		buttonGroup.add(radioTortillaSinCebolla);

		JRadioButton radioTortillaFrancesaCon = new JRadioButton("Tortilla francesa con jam\u00F3n");
		buttonGroup.add(radioTortillaFrancesaCon);

		JCheckBox checkPatata = new JCheckBox("Patata");

		JCheckBox checkArraultza = new JCheckBox("Arraultza");

		JCheckBox checkLetxuga = new JCheckBox("Letxuga");

		JCheckBox checkPernilla = new JCheckBox("pernilla");

		JCheckBox checkPimienta = new JCheckBox("pimienta");

		JCheckBox checkPiperra = new JCheckBox("piperra");

		JCheckBox checkTxorizoa = new JCheckBox("txorizoa");

		JButton buttonComprobar = new JButton("comprobar");
		buttonComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioTortillaConCebolla.isSelected()) {
					if (checkArraultza.isSelected() && checkPatata.isSelected() && checkKinpula.isSelected()
							&& !checkLetxuga.isSelected() && !checkPimienta.isSelected() && !checkTxorizoa.isSelected()
							&& !checkPiperra.isSelected()) {
						buttonComprobar.setBackground(Color.green);
					} else {
						buttonComprobar.setBackground(Color.red);
					}
				}
			
				if (radioTortillaSinCebolla.isSelected()) {
					if (checkArraultza.isSelected() && checkPatata.isSelected() && !checkKinpula.isSelected()
							&& !checkLetxuga.isSelected() && !checkPimienta.isSelected() && !checkTxorizoa.isSelected()
							&& !checkPiperra.isSelected()) {
						buttonComprobar.setBackground(Color.green);
					} else {
						buttonComprobar.setBackground(Color.red);
					}
				}

				if (radioTortillaFrancesaCon.isSelected()) {
					if (checkArraultza.isSelected() && !checkPatata.isSelected() && !checkKinpula.isSelected()
							&& !checkLetxuga.isSelected() && !checkPimienta.isSelected() && !checkTxorizoa.isSelected()
							&& !checkPiperra.isSelected()) {
						buttonComprobar.setBackground(Color.green);
					} else {
						buttonComprobar.setBackground(Color.red);
					}
				}

			}
		});

		JCheckBox checkKinpula = new JCheckBox("Kinpula");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(radioTortillaConCebolla)
										.addGap(18).addComponent(radioTortillaSinCebolla).addGap(18).addComponent(
												radioTortillaFrancesaCon))
								.addGroup(
										gl_contentPane.createSequentialGroup().addComponent(checkPatata).addGap(18)
												.addComponent(checkArraultza)
												.addGap(18).addComponent(checkLetxuga).addGap(18)
												.addComponent(checkPernilla))
								.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING).addComponent(buttonComprobar).addGroup(
												gl_contentPane.createSequentialGroup().addComponent(checkPimienta)
														.addGap(18).addComponent(checkPiperra)
														.addGap(18).addComponent(checkTxorizoa)))
										.addGap(18).addComponent(checkKinpula)))
						.addContainerGap(5, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(29)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(radioTortillaConCebolla)
						.addComponent(radioTortillaSinCebolla).addComponent(radioTortillaFrancesaCon))
				.addGap(28)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(checkPatata)
						.addComponent(checkArraultza).addComponent(checkLetxuga).addComponent(checkPernilla))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(checkPimienta)
						.addComponent(checkPiperra).addComponent(checkTxorizoa).addComponent(checkKinpula))
				.addGap(34).addComponent(buttonComprobar).addContainerGap(50, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
