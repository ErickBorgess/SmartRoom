public class Main1 {
    public static void main(String[] args) {
        Sensor sensorTemp = new Sensor("temperatura");
        Coletor coletor = new Coletor();
        //sensorTemp.coletarDados();
        sensorTemp.gerarRelatorio();
        sensorTemp.condicoes();
    }
}
