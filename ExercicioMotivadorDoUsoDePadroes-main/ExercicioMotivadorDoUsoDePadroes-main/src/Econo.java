public class Econo extends Carro {

    private double quilometragem;

    public Econo() {
        super("Econo", TipoCombustivel.GASOLINA, 20, 55);
        this.quilometragem = 0;
    }

    // Atualiza o consumo de combustível com base na quilometragem
    private void atualizarConsumo() {
        int kmDecremento = (int) (quilometragem / 5000);
        double novoConsumo = Math.max(10, 20 - kmDecremento); // Consumo mínimo de 10 km/litro
        Motor motor = getMotor();
        //motor.setConsumo(novoConsumo);
    }

    // Sobrescreve o método viaja para incluir a atualização do consumo
    @Override
    public boolean viaja(int distancia) {
        atualizarConsumo(); // Atualiza o consumo antes de viajar
        boolean resultado = super.viaja(distancia);
        if (resultado) {
            quilometragem += distancia;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Quilometragem=" + quilometragem + " km";
    }

    // Método para obter o Motor (necessário para acessar e alterar o consumo)
    private Motor getMotor() {
        return (Motor) this.motor; // Acesso ao motor na classe base
    }
    
}
