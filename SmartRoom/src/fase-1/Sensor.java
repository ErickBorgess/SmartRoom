public class Sensor {
    private String tipoSensor;
    private Coletor coletor;
    private Relatorio relatorio;

    public Sensor(String sensor) {
        cadastrarSensor(sensor);
    }

    private void cadastrarSensor(String sensor) {
        this.tipoSensor = sensor;
    }

    public String getTipo() {
        return tipoSensor;
    }

    public void coletarDados(String sensor) {
        coletor.lerSensores(sensor);
    }

    public void gerarRelatorio() {
        relatorio.gerarRelatorio();
    }

    public void condicoes() {
        switch (tipoSensor) {
            case "temperatura":
                //fazer ação com ar
                System.out.println("ligar ar");
                break;
            case "luminosidade":
                //fazer ação com luz
                break;
            case "presenca":
                //fazer ação com presenca
                break;
            default:
                System.out.println("Sensor não cadastrado!");
                break;
        }
    }
}
