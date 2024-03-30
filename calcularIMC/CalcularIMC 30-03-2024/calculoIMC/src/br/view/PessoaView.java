package br.view;
import br.model.Pessoa;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import br.model.RelatorioIMC;

public class PessoaView extends JFrame{
    private JPanel pnPrincipal;
    private JPanel pnTitulo;
    private JLabel lbTitulo;
    private JPanel pnBotton;
    private JButton btnCalcularIMC;
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
    private JButton btnNovo;
    private JButton btnSalvar;
    private ArrayList <Pessoa> pessoa; // criando um array lista

    //construtor
    public PessoaView(){
        eventosPessoaView();
        pessoa = new ArrayList<>();
    }
    public ArrayList<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(ArrayList<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    //Metodo para imprimir informações das pessoas
    public void construirInformacoesPessoas() {

        /*for (Pessoa p : pessoa) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("IMC: " + String.format("%.2f", p.calcularIMC()));
            System.out.println("Estado de Saúde: " + p.getEstadoSaude());
            System.out.println("-----------------------------");
        }*/
        for (int i = 0; i < pessoa.size(); i++) {
            System.out.println("-----------------------------");
            Pessoa p = pessoa.get(i);
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("IMC: " + String.format("%.2f", p.calcularIMC()));
            System.out.println("Estado de Saúde: " + p.getEstadoSaude());
            System.out.println("-----------------------------");
        }
    }
        //eventos dos botoes
    public void eventosPessoaView(){
        Pessoa p = new Pessoa();
        btnCalcularIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                // Criar uma nova instância de Pessoa para ligar a classe pessoa.
                Pessoa p = new Pessoa();

                // Preencher os atributos da pessoa com os valores dos campos de texto
                p.setNome(txtNome.getText());
                p.setIdade(Integer.parseInt(txtIdade.getText()));
                p.setAltura(Double.parseDouble(txtAltura.getText()));
                p.setPeso(Double.parseDouble(txtPeso.getText()));

                p.clasificaSaude();
                lbIMC.setText(String.format("%.2f", p.calcularIMC()));
                lbSaude.setText(p.getEstadoSaude());
                btnNovo.setEnabled(true); // Ativar botão novo
                btnSalvar.setEnabled(true); // ativar botão salvar
                pessoa.add(p); // adiciona um objeto no ArrayList
            }
        });


        btnNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnSalvar.setEnabled(false); //Desativar botão de salvar
                txtNome.setText("");//Limpar campos,  novas pessoas no array
                txtIdade.setText("");
                txtAltura.setText("");
                txtPeso.setText("");
                btnNovo.setEnabled(false); //Desativar botão de adicionar pessoa
                lbIMC.setText("00.00");
                lbSaude.setText("Saúde");
            }
        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RelatorioIMC relato = new RelatorioIMC();
                construirInformacoesPessoas(); //chamando o metodo de imprimr pessoas que esta no ArrayList

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