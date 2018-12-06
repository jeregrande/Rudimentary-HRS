package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;

public class ManagerMenuView {

	public ManagerMenuView() {
		build();
	}

	private static void build() {
		JFrame managerMenuPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton loadButton = new JButton();
		loadButton.setText("Load Reservations");
		loadButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Load clicked.");
			}
		});

		JButton viewButton = new JButton();
		viewButton.setText("View Reservations");
		viewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("View clicked.");
			}
		});

		JButton saveButton = new JButton();
		saveButton.setText("Save Reservations");
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Save clicked.");
			}
		});

		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Quit clicked.");
				System.out.println("--System Terminated--");
				managerMenuPage.dispose();
			}
		});

		panel.add(loadButton);
		panel.add(viewButton);
		panel.add(saveButton);
		panel.add(quitButton);

		managerMenuPage.getContentPane().add(panel);

		managerMenuPage.setSize(500, 500);
		managerMenuPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerMenuPage.pack();
		managerMenuPage.setVisible(true);
	}

	public static void main(String[] args) {
		build();
	}

}