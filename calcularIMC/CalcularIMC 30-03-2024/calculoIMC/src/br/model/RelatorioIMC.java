package br.model;
import javax.swing.*;
import br.model.Pessoa;
import br.view.PessoaView;

public class RelatorioIMC {
    private int totalPessoa;
    private int totalMagra;
    private int totalObsesidade1;
    private int totalObesidade2;
    private int totalObesidade3;
    private double mediaIdade;
    private double mediaAltura;
    private double mediaPeso;
    private double maiorIdade;
    private double maiorAltura;
    private double maiorPeso;
    private double menorIdade;
    private double menorAltura;
    private double menorPeso;


    public RelatorioIMC() {

    }
    PessoaView pw = new PessoaView();
    Pessoa pe = new Pessoa();

    public int getTotalPessoa() {
        return totalPessoa;
    }

    public void setTotalPessoa(int totalPessoa) {
        this.totalPessoa = totalPessoa;
    }

    public int getTotalMagra() {
        return totalMagra;
    }

    public void setTotalMagra(int totalMagra) {
        this.totalMagra = totalMagra;
    }

    public int getTotalObsesidade1() {
        return totalObsesidade1;
    }

    public void setTotalObsesidade1(int totalObsesidade1) {
        this.totalObsesidade1 = totalObsesidade1;
    }

    public int getTotalObesidade2() {
        return totalObesidade2;
    }

    public void setTotalObesidade2(int totalObesidade2) {
        this.totalObesidade2 = totalObesidade2;
    }

    public int getTotalObesidade3() {
        return totalObesidade3;
    }

    public void setTotalObesidade3(int totalObesidade3) {
        this.totalObesidade3 = totalObesidade3;
    }

    public double getMediaIdade() {
        return mediaIdade;
    }

    public void setMediaIdade(double mediaIdade) {
        this.mediaIdade = mediaIdade;
    }

    public double getMediaAltura() {
        return mediaAltura;
    }

    public void setMediaAltura(double mediaAltura) {
        this.mediaAltura = mediaAltura;
    }

    public double getMediaPeso() {
        return mediaPeso;
    }

    public void setMediaPeso(double mediaPeso) {
        this.mediaPeso = mediaPeso;
    }

    public double getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(double maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public double getMaiorAltura() {
        return maiorAltura;
    }

    public void setMaiorAltura(double maiorAltura) {
        this.maiorAltura = maiorAltura;
    }

    public double getMaiorPeso() {
        return maiorPeso;
    }

    public void setMaiorPeso(double maiorPeso) {
        this.maiorPeso = maiorPeso;
    }

    public double getMenorIdade() {
        return menorIdade;
    }

    public void setMenorIdade(double menorIdade) {
        this.menorIdade = menorIdade;
    }

    public double getMenorAltura() {
        return menorAltura;
    }

    public void setMenorAltura(double menorAltura) {
        this.menorAltura = menorAltura;
    }

    public double getMenorPeso() {
        return menorPeso;
    }

    public void setMenorPeso(double menorPeso) {
        this.menorPeso = menorPeso;
    }

    int i;
    public void calcularEstatistica(){

    }
    public void adicionarAmostra(){

    }
    public void atualizarAmostra(Pessoa pessoa){

    }
    public void consultarAmostra2(Pessoa pessoa){

    }
    public void removerAmostra(Pessoa cpf){

    }
    public void carregarDados(String path){

    }
    public void salvarDados(String path){

    }

    public static void main(String[] args) {
        
    }

}
