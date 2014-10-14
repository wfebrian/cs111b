//********************************************************************
//  TwoSorts.java       
//  Author: Abner Pinto, Alan Chan, Nanthana Thanonklin and Wesley Febrian
//  CS 111B Assignment K7 due date: May 1, 2013   
//
//  Demonstrate command of arrays and simple sorting techniques
//  Algorithm:
//  1. initialize arrays and variables
//  2. init() method
//  3. paint() method
//  4. display
//********************************************************************

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.*;
import java.util.Random;

public class TwoSorts extends Applet
{
	private int[] insertion_A;
	private int[] selection_A;
	private boolean[] numbersUsed;
	private Random generator;
	private int insert_index;
	private int select_index;
	private Button b1;
	private int n;
	private int count;
	private Label label_1;
	private Label label_2;

	public TwoSorts()
	{
		this.generator = new Random();
	}

	public void init()
	{
		this.insertion_A = new int[20];
		this.selection_A = new int[20];
		this.numbersUsed = new boolean[20];

		setBackground(Color.green);
		setSize(350, 200);

		for (int i = 0; i < 20; i++)
		{
			this.n = this.generator.nextInt(20);
			while (this.numbersUsed[this.n] == true)
			this.n = this.generator.nextInt(20);
			this.insertion_A[i] = (this.n + 1);
			this.selection_A[i] = (this.n + 1);
			this.numbersUsed[this.n] = true;
		}

		this.b1 = new Button("Sort me!");
		this.b1.addActionListener(new ButtonListener());
		add(this.b1);

		this.label_1 = new Label("Blue: Insertion");
		this.label_1.setForeground(Color.blue);
		add(this.label_1);

		this.label_2 = new Label("Red: Selection");
		this.label_2.setForeground(Color.red);
		add(this.label_2);

		this.insert_index = 1;
		this.select_index = 0;
		this.count = 0;
	}

	public void paint(Graphics g)
	{
		if ((this.insert_index < this.insertion_A.length) || (this.select_index < this.selection_A.length - 1))
		{
			g.setColor(Color.red);
			displayInsertion(g);

			g.setColor(Color.blue);
			displaySelection(g);

			int key = this.insertion_A[this.insert_index];
			int position = this.insert_index;

			while ((position > 0) && (this.insertion_A[(position - 1)] > key))
			{
				this.insertion_A[position] = this.insertion_A[(position - 1)];
				position--;
			}

			this.insertion_A[position] = key;

			int max = this.select_index;
			for (int scan = this.select_index + 1; scan < this.selection_A.length; scan++)
			{
				if (this.selection_A[scan] > this.selection_A[max])
				{
				max = scan;
				}
			}

			int temp = this.selection_A[max];
			this.selection_A[max] = this.selection_A[this.select_index];
			this.selection_A[this.select_index] = temp;

			this.insert_index += 1;
			this.select_index += 1;
		}

		else
		{
			g.setColor(Color.gray);
			displayInsertion(g);
			displaySelection(g);

			this.label_1.setForeground(Color.black);
			this.label_1.setText("DONE!");
			this.label_2.setText("");
		}
	}

	public void displayInsertion(Graphics g)
	{
		for (int i = 0; i < this.insertion_A.length; i++)
			g.fillRect(20 + i * 12, 100, 10, 2 * this.insertion_A[i]);
	}

	public void displaySelection(Graphics g)
	{
		for (int i = 0; i < this.selection_A.length; i++)
			g.fillRect(20 + i * 12, 100 - 2 * this.selection_A[i], 10, 2 * this.selection_A[i]);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count++;
			repaint();
		}
	}
}
