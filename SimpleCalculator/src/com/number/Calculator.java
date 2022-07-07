package com.number;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonMultiply = new JButton("*");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

    Calculator() {
        BorderLayout b1 = new BorderLayout();
        this.windowContent.setLayout(b1);
        this.windowContent.add("North", this.displayField);
        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);
        p1.add(this.button0);
        p1.add(this.button1);
        p1.add(this.button2);
        p1.add(this.button3);
        p1.add(this.button4);
        p1.add(this.button5);
        p1.add(this.button6);
        p1.add(this.button7);
        p1.add(this.button8);
        p1.add(this.button9);
        p1.add(this.buttonPoint);
        p1.add(this.buttonEqual);
        this.windowContent.add("Center", p1);
        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4, 1);
        p2.setLayout(gl2);
        p2.add(this.buttonPlus);
        p2.add(this.buttonMinus);
        p2.add(this.buttonMultiply);
        p2.add(this.buttonDivide);
        this.windowContent.add("East", p2);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(this.windowContent);
        frame.pack();
        frame.setVisible(true);
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        this.button0.addActionListener(calcEngine);
        this.button1.addActionListener(calcEngine);
        this.button2.addActionListener(calcEngine);
        this.button3.addActionListener(calcEngine);
        this.button4.addActionListener(calcEngine);
        this.button5.addActionListener(calcEngine);
        this.button6.addActionListener(calcEngine);
        this.button7.addActionListener(calcEngine);
        this.button8.addActionListener(calcEngine);
        this.button9.addActionListener(calcEngine);
        this.buttonPoint.addActionListener(calcEngine);
        this.buttonPlus.addActionListener(calcEngine);
        this.buttonMinus.addActionListener(calcEngine);
        this.buttonDivide.addActionListener(calcEngine);
        this.buttonMultiply.addActionListener(calcEngine);
        this.buttonEqual.addActionListener(calcEngine);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
