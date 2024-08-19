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
        System.out.println(esportivo);

        /*
         * Crie um novo modelo de carro chamado "SUV". Este é movido a gasolina, consome
   8 Km/lt, o tanque tem capacidade para 55 litros e é "FLEX" porque já prevê
   uma futura modificação nos motores.
         */
        Carro SUV = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(SUV);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(SUV);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(SUV);
    }
}
