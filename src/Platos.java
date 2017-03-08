import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Platos extends JFrame {

	private JPanel contentPane;

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
		
		JRadioButton rdbtnTortillaConCebolla = new JRadioButton("Tortilla con cebolla");
		
		JRadioButton rdbtnTortillaSinCebolla = new JRadioButton("Tortilla sin cebolla");
		
		JRadioButton rdbtnTortillaFrancesaCon = new JRadioButton("Tortilla francesa con jam\u00F3n");
		
		JCheckBox checkPatata = new JCheckBox("Patata");
		
		JCheckBox checkArraultza = new JCheckBox("Arraultza");
		
		JCheckBox checkLetxuga = new JCheckBox("Letxuga");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnTortillaConCebolla)
							.addGap(18)
							.addComponent(rdbtnTortillaSinCebolla)
							.addGap(18)
							.addComponent(rdbtnTortillaFrancesaCon))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(checkPatata)
							.addGap(18)
							.addComponent(checkArraultza)
							.addGap(18)
							.addComponent(checkLetxuga)
							.addGap(18)
							.addComponent(chckbxNewCheckBox_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxNewCheckBox_3)
							.addGap(18)
							.addComponent(chckbxNewCheckBox_4)
							.addGap(18)
							.addComponent(chckbxNewCheckBox_5)))
					.addContainerGap(5, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnTortillaConCebolla)
						.addComponent(rdbtnTortillaSinCebolla)
						.addComponent(rdbtnTortillaFrancesaCon))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkPatata)
						.addComponent(checkArraultza)
						.addComponent(checkLetxuga)
						.addComponent(chckbxNewCheckBox_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_3)
						.addComponent(chckbxNewCheckBox_4)
						.addComponent(chckbxNewCheckBox_5))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
