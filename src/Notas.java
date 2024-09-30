public class Notas {
    public String name;
    public int nota1;
    public int nota2;
    public int nota3;

    public double media(){
        return nota1 + nota2 + nota3;
    }
    public double finalgrade(){
        if (media() < 60){
            return 60 - media();
        }else{
            return media();

        }
    }
}
