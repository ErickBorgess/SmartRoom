public class Relatorio {
    private Sensor sensor;

    public void gerarRelatorio() {
        System.out.println("[SENSOR]: "+sensor.getTipo()+"\n");
    }
}
