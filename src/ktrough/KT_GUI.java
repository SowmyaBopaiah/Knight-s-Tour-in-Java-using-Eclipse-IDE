package ktrough;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class KT_GUI implements ActionListener{

	private JLabel lblkT = new JLabel("KNIGHT'S TOUR");
	private JLabel lblboardSize = new JLabel("Enter the size of the Chessboard:");
	private JSpinner numboardSize;
	private JRadioButton rbWD = new JRadioButton("Warnsdorf Algorithm");
	private JRadioButton rbBT = new JRadioButton("Backtracking Algorithm");
	private JButton btnStart = new JButton("START TOUR");
	private JFrame mainDialog;
	
	KT_GUI ()
	{
		mainDialog = new JFrame("Knight's Tour");
		mainDialog.setResizable(false);
		mainDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainDialog.setSize(600,400);
		mainDialog.setLayout(null);
		mainDialog.setVisible(true);
		
		mainDialog.add(lblkT);
		
		mainDialog.add(lblboardSize);
		
		SpinnerNumberModel limit = new SpinnerNumberModel(8,1,40,1);  
		numboardSize = new JSpinner(limit);
		mainDialog.add(numboardSize);
		
		
		
		ButtonGroup bOrW = new ButtonGroup();
		bOrW.add(rbBT); bOrW.add(rbWD);
		mainDialog.add(rbWD);	mainDialog.add(rbBT);
		
		mainDialog.add(btnStart);
		
		
		
		lblkT.setFont(new Font("Serif",Font.BOLD,30));
		lblboardSize.setFont(new Font("Serif",Font.BOLD,20));
		rbBT.setFont(new Font("Serif",Font.BOLD,20));
		rbWD.setFont(new Font("Serif",Font.BOLD,20));
		btnStart.setFont(new Font("Serif",Font.BOLD,20));
		numboardSize.setFont(new Font("Serif",Font.PLAIN,19));
		
		
		lblkT.setBounds(150,30, 300,30);
		lblboardSize.setBounds(40,80,300,30);
		numboardSize.setBounds(360,87, 100,20);
		rbBT.setBounds(350, 150, 300,30);
		rbWD.setBounds(50, 150, 300,30);
		btnStart.setBounds(180,240, 200,30);
		
		btnStart.addActionListener(this);
		mainDialog.setLayout(null);
		mainDialog.setVisible(true);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				
		new KT_GUI();	

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int boardSize = (int)numboardSize.getValue();
		
		if(rbWD.isSelected())
		{
			mainDialog.setVisible(false);
			new KT_Warnsdorf_GUI(boardSize);
		}	
		else if(rbBT.isSelected())
		{
			mainDialog.setVisible(false);
			new KT_Backtracking_GUI(boardSize);
		}
	}
	
}



