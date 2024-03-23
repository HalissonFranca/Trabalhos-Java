package br.model;

public class Pessoa {

    private int id;
    private String nome;
    public float cpf;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private String estadoSaude;



    public Pessoa(/*String nome, int idade, double altura, double peso*/){
        /*this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;*/
    }

    public double calcularIMC(){
        return this.imc = this.peso / (altura * altura);
    }

    public void clasificaSaude(){
        this.imc = calcularIMC();
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("IMC: " + getImc());
        if(getImc() <18.5){
            this.estadoSaude = "Magra";
        }else if(getImc() < 24.9){
            this.estadoSaude = "Saudavel";
        }else if(getImc() < 29.9){
            this.estadoSaude = "Obsidade I";
        }else if(getImc() < 39.9){
            this.estadoSaude = "Osidade II";
        }else if(getImc() > 40){
            this.estadoSaude = "Obsidade II";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    public void setCpf(float cpf){
        this.cpf = cpf;
    }
    public float getCpf(){
        return cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

}