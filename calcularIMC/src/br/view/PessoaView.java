package br.view;
import br.model.Pessoa;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PessoaView extends JFrame{
    private JPanel pnPrincipal;
    private JPanel pnTitulo;
    private JLabel lbTitulo;
    private JPanel pnBotton;
    private JButton btnCalcularIMC;
    private JButton btnFechar;
    private JPanel pnCenter;
    private JPanel pnforme;
    private JPanel pnResultado;
    private JLabel lbNome;
    private JTextField txtNome;
    private JLabel lbIdade;
    private JTextField txtIdade;
    private JLabel lbPeso;
    private JTextField txtPeso;
    private JLabel lbAltura;
    private JTextField txtAltura;
    private JLabel lbIMC;
    private JLabel lbSaude;
    private Pessoa p;

    //construtor
    public PessoaView(){
        eventosPessoaView();
        this.p = new Pessoa();

    }

    //eventos
    public void eventosPessoaView(){
        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        btnCalcularIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                p.setNome(txtNome.getText());
                p.setIdade(Integer.parseInt(txtIdade.getText()));
                p.setAltura(Double.parseDouble(txtAltura.getText()));
                p.setPeso(Double.parseDouble(txtPeso.getText()));

                p.clasificaSaude();
                lbIMC.setText(String.format("%.2f", p.calcularIMC()));
                lbSaude.setText(p.getEstadoSaude());
                System.out.println(p.getPeso());
                System.out.println(p.getNome());
                System.out.println(p.getIdade());
                System.out.println(p.getAltura());
            }
        });


    }

    //Metodo Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("PessoaView");
        frame.setContentPane(new PessoaView().pnPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
