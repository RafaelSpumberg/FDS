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
        /*
         * Crie um novo modelo de carro chamado "SUVFlex". Este é FLEX (gasolina ou
   alcool) e consome 8 Km/lt de gasolina ou 6 Km/lt de alcool. O tanque é "FLEX"
   e tem 65 litros de capacidade. Por simplicidade assuma que o conteúdo do tanque 
   é sempre o do último abastecimento.
         */

        Carro SUVFlex = new Carro("SUVFlex",TipoCombustivel.GASOLINA,6,45);

        System.out.println("Tipo: ");
        System.out.println(SUVFlex);
        SUVFlex.abastece(TipoCombustivel.GASOLINA, 10);
        SUVFlex.viaja(30);

        System.out.println(SUVFlex);
        
    }
}
