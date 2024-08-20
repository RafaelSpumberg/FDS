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

        Carro esportivo = new Carro("Esportivo",TipoCombustivel.GASOLINA,6,45);

        System.out.println("Tipo: ");
        System.out.println(esportivo);
        esportivo.abastece(TipoCombustivel.GASOLINA, 10);
        esportivo.viaja(30);

        System.out.println(esportivo);

        //Criação do Carro SUV
        Carro SUV = new Carro("SUV",TipoCombustivel.GASOLINA,8,55);

        System.out.println("Tipo: ");
        System.out.println(SUV);
        SUV.abastece(TipoCombustivel.GASOLINA, 100);
        SUV.viaja(50);

        System.out.println(SUV);
                      
        
        /*
         * Crie um novo modelo de carro chamado "SUVFlex". Este é FLEX (gasolina ou
        alcool) e consome 8 Km/lt de gasolina ou 6 Km/lt de alcool. O tanque é "FLEX"
        e tem 65 litros de capacidade. Por simplicidade assuma que o conteúdo do tanque 
        é sempre o do último abastecimento.
         */

        Carro SUVFlex = new Carro("SUVFlex",TipoCombustivel.FLEX,6,45);

        System.out.println("Tipo: ");
        System.out.println(SUVFlex);
        SUVFlex.abastece(TipoCombustivel.ALCOOL, 40);
        SUVFlex.viaja(30);

        System.out.println(SUVFlex);

        //Criação carro Econo
        //O consumo deste quando novo é de 20 Km/lt, porém este consumo reduz 1 Km/lt a
        //cada 5000 Km até que se estabiliza em 10 Km/lt.
        Carro Econo = new Carro("Econo",TipoCombustivel.GASOLINA,20,55);

        System.out.println("Tipo: ");
        System.out.println(Econo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo Econo com gasolina");
        System.out.println("\nViajando com o Econo");
        Econo.viaja(10000); // Viagem de 10.000 km
        System.out.println("Após viagem de 10.000 km:");
        System.out.println(Econo);

        Econo.viaja(5000); // Viagem adicional de 5.000 km
        System.out.println("Após viagem adicional de 5.000 km:");
        System.out.println(Econo);
       
    }
}
