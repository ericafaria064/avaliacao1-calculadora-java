/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.uniplan.view;

import br.com.uniplan.service.Calculos;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Erica Irdes de Faria
 */
public class View extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Avaliações");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 5, 5));

        JLabel label1 = new JLabel("Inforne a nota da avaliação 1:");
        JTextField text1 = new JTextField("");

        JLabel label2 = new JLabel("Inforne a nota da avaliação 2:");
        JTextField text2 = new JTextField("");

        JLabel label3 = new JLabel("Inforne a nota da avaliação 3:");
        JTextField text3 = new JTextField("");

        JLabel somaLabel = new JLabel("Soma das Avaliações:");
        JTextField somaField = new JTextField();
        somaField.setEditable(false);

        JLabel mediaLabel = new JLabel("Média das Avaliações:");
        JTextField mediaField = new JTextField();
        mediaField.setEditable(false);

        JLabel situacaoLabel = new JLabel("Situação:");
        JButton situacaoButton = new JButton("Verificar");

        JTextField resultadoField = new JTextField();
        resultadoField.setEditable(false);

        situacaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a1 = Double.parseDouble(text1.getText());
                double a2 = Double.parseDouble(text2.getText());
                double a3 = Double.parseDouble(text3.getText());

                Calculos calc = new Calculos();
                calc.setAvaliacao1(a1);
                calc.setAvaliacao2(a2);
                calc.setAvaliacao3(a3);

                double soma = calc.soma();
                double media = calc.media();

                somaField.setText(String.format("%.2f", soma));
                mediaField.setText(String.format("%.2f", media));

                resultadoField.setText(calc.situacao());
            }
        });

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(label3);
        frame.add(text3);
        frame.add(somaLabel);
        frame.add(somaField);
        frame.add(mediaLabel);
        frame.add(mediaField);
        frame.add(situacaoLabel);
        frame.add(situacaoButton);
        frame.add(new JLabel(""));
        frame.add(resultadoField);

        frame.setVisible(true);
    }

}
