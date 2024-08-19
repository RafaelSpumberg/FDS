public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        /*
            1) Crie um modelo de carro chamado "Esportivo". Este é movido a gasolina, consome 6 Km/litro e o tanque tem capacidade para 45 litros.

            2) Crie um modelo de carro chamado "Utilitario". Este é movido a diesel, consome 5 Km/litro e o tanque tem capacidade para 70 litros.

            3) Crie um modelo de carro chamado "SUV". Este é movido a gasolina, consome 8 Km/litro, o tanque tem capacidade para 55 litros e 
            é "FLEX" porque já prevê uma futura modificação nos motores.

            4) Crie um modelo de carro chamado "SUVFlex". Este é FLEX 
            (gasolina ou álcool) e consome 8 Km/lt de gasolina ou 6 Km/litro de álcool. O tanque é "FLEX" e tem 65 litros de capacidade. Por simplicidade assumir que o conteúdo do tanque é sempre o do último abastecimento.

            5) Crie um modelo de carro chamado "Econo". É movido a gasolina, tanque tem capacidade para 55 litros e caracterizam-se por ser extremamente econômicos. O consumo deste quando novo é de 20 Km/litro, porém este consumo reduz 1 Km/litro a cada 5000 Km até que se estabiliza em 10 Km/litro.
         */

        //Criação do modelo utilitário
        Carro Utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);

         System.out.println("Tipos de veiculos:");
         System.out.println(Utilitario);
 
         System.out.println("\n\n----------------");
         System.out.println("\nAbastencendo carro utilitário com diesel");
         basico.abastece(TipoCombustivel.DIESEL, 70);
         System.out.println(Utiliario);
         System.out.println("\nViajando com o carro utilitário");
         Utilitario.viaja(200);
         System.out.println(Utilitario);

         //Criação do modelo SUV 

         Carro SUV = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        
         System.out.println("Tipos de veículos:");
         System.out.println(SUV);
         
         System.out.println("\n\n----------------");
         System.out.println("\nAbastecendo o SUV com gasolina");
         SUV.abastece(TipoCombustivel.GASOLINA, 30); 
         System.out.println(SUV);
         
         System.out.println("\nViajando com o SUV");
         SUV.viaja(240); 
         System.out.println(SUV);

    }
}