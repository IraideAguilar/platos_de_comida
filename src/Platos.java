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
	private JCheckBox checkPatata;
	private JCheckBox checkArraultza;
	private JCheckBox checkLetxuga;
	private JCheckBox checkPernilla;
	private JCheckBox checkPimienta;
	private JCheckBox checkPiperra;
	private JButton buttonComprobar;
	private JCheckBox checkTxorizoa;
	private JCheckBox checkKinpula;

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
		radioTortillaConCebolla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                  limpiarFormulario();
			}
		});

		buttonGroup.add(radioTortillaConCebolla);

		JRadioButton radioTortillaSinCebolla = new JRadioButton("Tortilla sin cebolla");
		radioTortillaSinCebolla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});

		buttonGroup.add(radioTortillaSinCebolla);

		JRadioButton radioTortillaFrancesaCon = new JRadioButton("Tortilla francesa con jam\u00F3n");
		radioTortillaFrancesaCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});

		buttonGroup.add(radioTortillaFrancesaCon);

		checkPatata = new JCheckBox("Patata");

		checkArraultza = new JCheckBox("Arraultza");

		checkLetxuga = new JCheckBox("Letxuga");

		checkPernilla = new JCheckBox("pernilla");

		checkPimienta = new JCheckBox("pimienta");

		checkPiperra = new JCheckBox("piperra");

		checkTxorizoa = new JCheckBox("txorizoa");

		buttonComprobar = new JButton("comprobar");

		checkKinpula = new JCheckBox("Kinpula");

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

	public void limpiarFormulario() {
		checkPatata.setSelected(false);
		checkPimienta.setSelected(false);
		checkKinpula.setSelected(false);
		checkLetxuga.setSelected(false);
		checkArraultza.setSelected(false);
		checkPiperra.setSelected(false);
		checkPernilla.setSelected(false);
        buttonComprobar.setBackground(new Color(240,240,240));
	}
}
