package Cap01_Introducao_a_Computadores.Exemplos;

// 1. A CLASSE: É o molde/planta do carro (Sem o "public" na frente)
class Carro {
    // 2. OS ATRIBUTOS: Características do carro
    String marca;
    String modelo;
    String cor;
    int ano;

    // Um método para exibir os dados
    void exibirDados() {
        System.out.println("Carro: " + marca + " " + modelo + " | Cor: " + cor + " | Ano: " + ano);
    }
}

// 3. A CLASSE PRINCIPAL: Esta sim deve ser a "public class Main" e conter o ponto de entrada (main)
public class Main {
    public static void main(String[] args) {
        
        // Criando o primeiro objeto (carro1)
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.cor = "Prata";
        carro1.ano = 2024;

        // Criando o segundo objeto (carro2)
        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.modelo = "Mustang";
        carro2.cor = "Vermelho";
        carro2.ano = 2023;

        // Exibindo dados dos carros
        System.out.println("--- Exibindo dados dos carros ---");
        carro1.exibirDados(); 
        carro2.exibirDados(); 
    }
}