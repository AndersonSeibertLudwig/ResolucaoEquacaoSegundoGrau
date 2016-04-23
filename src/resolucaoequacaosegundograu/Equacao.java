/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaoequacaosegundograu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.math.*;
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
    private JTextField txtResolucao1;
    private JTextField txtResolucao2;
    private JTextField txtResolucao3;
    private JTextField txtResolucao4;
    private JTextField txtResolucao5;
    private JTextField txtResolucao6;
    private JTextField txtResolucao7;
    private JTextField txtResolucao8;
    private JTextField txtResolucao9;
    private JTextField txtResolucao10;
    private JTextField txtResolucao11;
    private JTextField txtResolucao12;
    private JButton btnCalcular;
    private double a;
    private double b;
    private double c;
    
    public Equacao(){
        super("Formula Geral de Resolução de Equação do Segundo Grau");
        this.setSize(440,400);
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
        txtResolucao1 =  new JTextField();
        txtResolucao1.setEditable(false);
        txtResolucao1.setColumns(30);
        txtResolucao1.setBorder(null);
        txtResolucao2 =  new JTextField();
        txtResolucao2.setEditable(false);
        txtResolucao2.setColumns(30);
        txtResolucao2.setBorder(null);
        txtResolucao3 =  new JTextField();
        txtResolucao3.setEditable(false);
        txtResolucao3.setColumns(30);
        txtResolucao3.setBorder(null);
        txtResolucao4 =  new JTextField();
        txtResolucao4.setEditable(false);
        txtResolucao4.setColumns(30);
        txtResolucao4.setBorder(null);
        txtResolucao5 =  new JTextField();
        txtResolucao5.setEditable(false);
        txtResolucao5.setColumns(30);
        txtResolucao5.setBorder(null);
        txtResolucao6 =  new JTextField();
        txtResolucao6.setEditable(false);
        txtResolucao6.setColumns(30);
        txtResolucao6.setBorder(null);
        txtResolucao7 =  new JTextField();
        txtResolucao7.setEditable(false);
        txtResolucao7.setColumns(30);
        txtResolucao7.setBorder(null);
        txtResolucao8 =  new JTextField();
        txtResolucao8.setEditable(false);
        txtResolucao8.setColumns(30);
        txtResolucao8.setBorder(null);
        txtResolucao9 =  new JTextField();
        txtResolucao9.setEditable(false);
        txtResolucao9.setColumns(30);
        txtResolucao9.setBorder(null);
        txtResolucao10 =  new JTextField();
        txtResolucao10.setEditable(false);
        txtResolucao10.setColumns(30);
        txtResolucao10.setBorder(null);
        txtResolucao11 =  new JTextField();
        txtResolucao11.setEditable(false);
        txtResolucao11.setColumns(30);
        txtResolucao11.setBorder(null);
        txtResolucao12 =  new JTextField();
        txtResolucao12.setEditable(false);
        txtResolucao12.setColumns(30);
        txtResolucao12.setBorder(null);
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
                    try{
                        a = Double.parseDouble(txtA.getText());
                        b = Double.parseDouble(txtB.getText());
                        c = Double.parseDouble(txtC.getText());
                        double quadradoB;
                        double ac;
                        double resultadoDelta;
                        double invB = -b;
                        double aa = 2*a;
                        txtResolucao1.setText("Delta = b²-4ac");
                        quadradoB = b*b;
                        ac = 4*a*c;
                        resultadoDelta = quadradoB-ac;
                        double raizDelta = Math.sqrt(resultadoDelta);
                        double somaRaizDelta = invB+raizDelta;
                        double subtraiRaizDelta = invB-raizDelta;
                        txtResolucao2.setText("Delta = ("+b+")²-4("+a+")("+c+")");
                        txtResolucao3.setText("Delta ="+quadradoB+"-("+ac+")");
                        txtResolucao4.setText("Delta ="+resultadoDelta);
                        if(resultadoDelta>0){
                            txtResolucao4.setText(txtResolucao4.getText()+" A equação possui duas raízes");
                            txtResolucao5.setText("-b+-raiz(Delta)/2a");
                            txtResolucao6.setText(invB+"+-raiz("+resultadoDelta+")/"+aa);
                            txtResolucao7.setText("x' = "+invB+"+"+raizDelta+"/"+aa);
                            txtResolucao8.setText("x' = "+somaRaizDelta+"/"+aa);
                            txtResolucao9.setText("x' = "+somaRaizDelta/aa);
                            txtResolucao10.setText("x'' = "+invB+"-"+raizDelta+"/"+aa);
                            txtResolucao11.setText(subtraiRaizDelta+"/"+aa);
                            txtResolucao12.setText("x'' = "+somaRaizDelta/aa);
                        }
                        else if(resultadoDelta==0){
                            txtResolucao4.setText(txtResolucao4.getText()+" A equação possui uma raiz");
                            txtResolucao5.setText("-b+-raiz(Delta)/2a");
                            txtResolucao6.setText(invB+"+-raiz("+resultadoDelta+")/"+aa);
                            txtResolucao7.setText("x' = "+invB+"+"+raizDelta+"/"+aa);
                            txtResolucao8.setText("x' = "+somaRaizDelta+"/"+aa);
                            txtResolucao9.setText("x' = "+somaRaizDelta/aa);
                        }
                        else{
                            txtResolucao4.setText(txtResolucao4.getText()+" A equação não possui raiz");
                        }
                    }
                    catch(Exception e){
                        txtResolucao1.setText("Numero invalido");
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
        pnlPrincipal.add(txtResolucao1);
        pnlPrincipal.add(txtResolucao2);
        pnlPrincipal.add(txtResolucao3);
        pnlPrincipal.add(txtResolucao4);
        pnlPrincipal.add(txtResolucao5);
        pnlPrincipal.add(txtResolucao6);
        pnlPrincipal.add(txtResolucao7);
        pnlPrincipal.add(txtResolucao8);
        pnlPrincipal.add(txtResolucao9);
        pnlPrincipal.add(txtResolucao10);
        pnlPrincipal.add(txtResolucao11);
        pnlPrincipal.add(txtResolucao12);
        this.add(pnlPrincipal);
    }
}
