package com.number;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
    Calculator parent;
    char selectedAction = ' ';
    double currentResult = 0.0D;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
        String dispFieldText = this.parent.displayField.getText();
        double displayValue = 0.0D;
        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }

        Object src = e.getSource();
        if (src == this.parent.buttonPlus) {
            this.selectedAction = '+';
            this.currentResult = displayValue;
            this.parent.displayField.setText("");
        } else if (src == this.parent.buttonMinus) {
            this.selectedAction = '-';
            this.currentResult = displayValue;
            this.parent.displayField.setText("");
        } else if (src == this.parent.buttonDivide) {
            if (displayValue != 0.0D) {
                this.selectedAction = '/';
                this.currentResult = displayValue;
                this.parent.displayField.setText("");
            } else {
                while(displayValue == 0.0D) {
                    displayValue = Double.parseDouble(dispFieldText);
                }
            }
        } else if (src == this.parent.buttonMultiply) {
            this.selectedAction = '*';
            this.currentResult = displayValue;
            this.parent.displayField.setText("");
        } else if (src == this.parent.buttonEqual) {
            if (this.selectedAction == '+') {
                this.currentResult += displayValue;
                this.parent.displayField.setText("" + this.currentResult);
            } else if (this.selectedAction == '-') {
                this.currentResult -= displayValue;
                this.parent.displayField.setText("" + this.currentResult);
            } else if (this.selectedAction == '/') {
                this.currentResult /= displayValue;
                this.parent.displayField.setText("" + this.currentResult);
            } else if (this.selectedAction == '*') {
                this.currentResult *= displayValue;
                this.parent.displayField.setText("" + this.currentResult);
            }
        } else {
            String clickedButtonLabel = clickedButton.getText();
            this.parent.displayField.setText(dispFieldText + clickedButtonLabel);
        }

    }
}
