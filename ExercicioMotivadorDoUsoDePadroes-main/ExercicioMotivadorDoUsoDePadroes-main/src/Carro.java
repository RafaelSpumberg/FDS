public class Carro {

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;
    private double quilometragem;

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
        this.quilometragem = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    public double getQuilometragem(){
        return quilometragem;
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        if (modelo.equals("SUVFlex")) {
            if (tipoCombustivel == TipoCombustivel.ALCOOL) {
                motor.setConsumo(6);
            } else if (tipoCombustivel == TipoCombustivel.GASOLINA) {
                motor.setConsumo(8);
            }
        }     
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    private void atualizarConsumoEcono() {
        if (modelo.equals("Econo")) {
            int kmDecremento = (int) (quilometragem / 5000);
            double novoConsumo = Math.max(10, 20 - kmDecremento);
            motor.setConsumo(novoConsumo);
        }
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = motor.combustivelNecessario(distancia);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * motor.getConsumo();
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {
        if(modelo.equals("Econo")){
            atualizarConsumoEcono();
        }
        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(motor.combustivelNecessario(distancia));
            quilometragem += distancia; 
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}
