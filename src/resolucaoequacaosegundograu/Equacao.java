/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoequacaosegundograu;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author anderson
 */
public class Equacao extends JFrame{
    private JPanel pnlPrincipal;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JLabel lblTitulo;
    private JLabel lblRaiz;
    private JButton btnCalcular;
    private double a;
    private double b;
    private double c;
    
    public Equacao(){
        super("Formula Geral de Resolução de Equação do Segundo Grau");
        this.setSize(440,160);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pnlPrincipal = new JPanel();
        lblA = new JLabel();
        lblA.setText("A=");
        lblB = new JLabel();
        lblB.setText("B=");
        lblC = new JLabel();
        lblC.setText("C=");
        lblTitulo = new JLabel(); 
        lblTitulo.setText("Formula Geral de Resolução de Equação do Segundo Grau");
        lblRaiz = new JLabel();
        txtA = new JTextField();
        txtA.setColumns(5);
        txtB = new JTextField();
        txtB.setColumns(5);
        txtC = new JTextField();
        txtC.setColumns(5);
        btnCalcular = new JButton("Obter raízes");
        
        btnCalcular.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    a = Integer.parseInt(txtA.getText());
                    b = Integer.parseInt(txtB.getText());
                    c = Integer.parseInt(txtC.getText());
                    double delta = b*b-4*a*c;
                    if(delta > 0){
                        lblRaiz.setText("Duas raízes");
                    }
                    else if(delta == 0){
                        lblRaiz.setText("Uma raíz");
                    }
                    else if(delta < 0){
                        lblRaiz.setText("Nenhuma raíz");
                    }
                }
            });
        pnlPrincipal.add(lblTitulo);
        pnlPrincipal.add(lblA);
        pnlPrincipal.add(txtA);
        pnlPrincipal.add(lblB);
        pnlPrincipal.add(txtB);
        pnlPrincipal.add(lblC);
        pnlPrincipal.add(txtC);
        pnlPrincipal.add(btnCalcular);
        pnlPrincipal.add(lblRaiz);
        this.add(pnlPrincipal);
    }
}
