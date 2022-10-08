public class Main {
    public static void main(String[] args) {
     //   System.out.println("Hi");

  Coordinate Church = new Coordinate();
  Church.x=50.43464044842177;
  Church.y=30.55725228516998;

  Dynasties Li = new Dynasties();
  Li.Warrior=13;
  Li.Archer=24;
  Li.Rider=46;


  Dynasties Ming = new Dynasties();
  Ming.Warrior=9;
  Ming.Archer=35;
  Ming.Rider=12;


  int Li_Attack = (Li.Warrior+ Li.Archer+ Li.Rider)*860;
        System.out.println(Li_Attack);

  int Ming_Attack = (int) (Li_Attack*1.5);
        System.out.println(Ming_Attack);


    }
}