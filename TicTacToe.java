/** Made By Jeremiah
* For Fun :)
*/

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe extends JFrame {
	JButton one = new JButton("     ");
	JButton two = new JButton("     ");
	JButton three = new JButton("     ");
	JButton four = new JButton("     ");
	JButton five = new JButton("     ");
	JButton six = new JButton("     ");
	JButton seven = new JButton("     ");
	JButton eight = new JButton("     ");
	JButton nine = new JButton("     ");

	JTextField winner = new JTextField();

	String b1Claimer = "12414a241";
	String b2Claimer = "1241s4241";
	String b3Claimer = "1241f4241";
	String b4Claimer = "12414h1";
	String b5Claimer = "124r1";
	String b6Claimer = "1241j441";
	String b7Claimer = "12442l41";
	String b8Claimer = "12414p1";
	String b9Claimer = "12414m24";

	JButton reset = new JButton("Reset");

	JPanel board = new JPanel();
	JPanel whoIsUp = new JPanel();
	JPanel backround = new JPanel();

	boolean player1Up = true;

	public static void main(String[] args) {
		TicTacToe gui = new TicTacToe();
		gui.run();
	}

	public void run() {
		setTitle("Tic-Tac-Toe");
		GridBagLayout layout = new GridBagLayout();
		board.setLayout(layout);
		whoIsUp.setLayout(layout);
		backround.setLayout(layout);
		board.setBackground(Color.black);
		whoIsUp.setBackground(Color.white);
		backround.setBackground(Color.white);
		winner.setText("No One Has Won Yet!");
		winner.setEditable(false);

		one.addActionListener(new b1Clicked());
		two.addActionListener(new b2Clicked());
		three.addActionListener(new b3Clicked());
		four.addActionListener(new b4Clicked());
		five.addActionListener(new b5Clicked());
		six.addActionListener(new b6Clicked());
		seven.addActionListener(new b7Clicked());
		eight.addActionListener(new b8Clicked());
		nine.addActionListener(new b9Clicked());
		reset.addActionListener(new bResetClicked());

		GridBagConstraints location = getConstraints(0, 0);
		location = getConstraints(0, 0);
		board.add(one, location);
		location = getConstraints(1, 0);
		board.add(two, location);
		location = getConstraints(2, 0);
		board.add(three, location);
		location = getConstraints(0, 1);
		board.add(four, location);
		location = getConstraints(1, 1);
		board.add(five, location);
		location = getConstraints(2, 1);
		board.add(six, location);
		location = getConstraints(0, 2);
		board.add(seven, location);
		location = getConstraints(1, 2);
		board.add(eight, location);
		location = getConstraints(2, 2);
		board.add(nine, location);
		location = getConstraints(0, 0);
		backround.add(board, location);
		location = getConstraints(0, 0);
		whoIsUp.add(winner, location);
		location = getConstraints(0, 1);
		whoIsUp.add(reset, location);
		location = getConstraints(0, 1);
		backround.add(whoIsUp, location);

		add(backround);
		setSize(250, 200);
		setVisible(true);

	}

	public void swapPlayers() {
		if (player1Up) {
			player1Up = false;
		} else {
			player1Up = true;
		}
	}

	public void lockButtons() {
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
	}
	
	public void checkIfWon() {
		if (b1Claimer == b2Claimer && b2Claimer == b3Claimer) {
			winner.setText("\"" + b1Claimer + "\" Has Won!");
			lockButtons();
		}
		if (b4Claimer == b5Claimer && b5Claimer == b6Claimer) {
			winner.setText("\"" + b4Claimer + "\" Has Won!");
			lockButtons();
		}
		if (b7Claimer == b8Claimer && b8Claimer == b9Claimer) {
			winner.setText("\"" + b7Claimer + "\" Has Won!");
			lockButtons();
		}

		if (b1Claimer == b4Claimer && b4Claimer == b7Claimer) {
			winner.setText("\"" + b1Claimer + "\" Has Won!");
			lockButtons();
		}
		if (b2Claimer == b5Claimer && b5Claimer == b8Claimer) {
			winner.setText("\"" + b2Claimer + "\" Has Won!");
			lockButtons();
		}
		if (b3Claimer == b6Claimer && b6Claimer == b9Claimer) {
			winner.setText("\"" + b3Claimer + "\" Has Won!");
			lockButtons();
		}

		if (b1Claimer == b5Claimer && b5Claimer == b9Claimer) {
			winner.setText("\"" + b1Claimer + "\" Has Won!");
			lockButtons();
		}
		if (b3Claimer == b5Claimer && b5Claimer == b7Claimer) {
			winner.setText("\"" + b3Claimer + "\" Has Won!");
			lockButtons();
		}
		swapPlayers();
	}

	class b1Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				one.setEnabled(false);
				one.setText(" O ");
				b1Claimer = "O";

			} else {
				one.setEnabled(false);
				one.setText(" X ");
				b1Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b2Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				two.setEnabled(false);
				two.setText(" O ");
				b2Claimer = "O";

			} else {
				two.setEnabled(false);
				two.setText(" X ");
				b2Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b3Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				three.setEnabled(false);
				three.setText(" O ");
				b3Claimer = "O";

			} else {
				three.setEnabled(false);
				three.setText(" X ");
				b3Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b4Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				four.setEnabled(false);
				four.setText(" O ");
				b4Claimer = "O";

			} else {
				four.setEnabled(false);
				four.setText(" X ");
				b4Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b5Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				five.setEnabled(false);
				five.setText(" O ");
				b5Claimer = "O";

			} else {
				five.setEnabled(false);
				five.setText(" X ");
				b5Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b6Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				six.setEnabled(false);
				six.setText(" O ");
				b6Claimer = "O";

			} else {
				six.setEnabled(false);
				six.setText(" X ");
				b6Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b7Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				seven.setEnabled(false);
				seven.setText(" O ");
				b7Claimer = "O";

			} else {
				seven.setEnabled(false);
				seven.setText(" X ");
				b7Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b8Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				eight.setEnabled(false);
				eight.setText(" O ");
				b8Claimer = "O";

			} else {
				eight.setEnabled(false);
				eight.setText(" X ");
				b8Claimer = "X";
			}
			checkIfWon();
		}
	}

	class b9Clicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (player1Up) {
				nine.setEnabled(false);
				nine.setText(" O ");
				b9Claimer = "O";

			} else {
				nine.setEnabled(false);
				nine.setText(" X ");
				b9Claimer = "X";
			}
			checkIfWon();
		}
	}

	class bResetClicked implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			one.setText("     ");
			two.setText("     ");
			three.setText("     ");
			four.setText("     ");
			five.setText("     ");
			six.setText("     ");
			seven.setText("     ");
			eight.setText("     ");
			nine.setText("     ");
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			b1Claimer = "12414a241";
			b2Claimer = "1241s4241";
			b3Claimer = "1241f4241";
			b4Claimer = "12414h1";
			b5Claimer = "124r1";
			b6Claimer = "1241j441";
			b7Claimer = "12442l41";
			b8Claimer = "12414p1";
			b9Claimer = "12414m24";
			player1Up = true;
			winner.setText("No One Has Won Yet!");

		}
	}

	private GridBagConstraints getConstraints(int x, int y) {
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(5, 5, 0, 5);
		c.gridx = x;
		c.gridy = y;
		return c;
	}

}
