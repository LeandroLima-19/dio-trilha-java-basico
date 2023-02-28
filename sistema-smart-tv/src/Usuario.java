public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();
        
        System.out.println("Tv Ligada? " + smarTv.ligada);

        smarTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smarTv.ligada);


        System.out.println("Canal atual: " + smarTv.canal);
        
        smarTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smarTv.canal);

        smarTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual: " + smarTv.canal);

        smarTv.mudarCanal(7);
        System.out.println("Novo status -> Canal atual: " + smarTv.canal);

        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smarTv.volume);

        smarTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual: " + smarTv.volume);
    }
}
