public class PowerOfTwo{

  public static void main(String[] args) {
    System.out.println(powerOfTwo(8));
    System.out.println(powerOfTwo(6));
  }

  public static boolean powerOfTwo(int num) {
    int range = num / 2;

    for(int i = 1; i <= range; i++) {
      if((Math.pow(2, i)) == num){
        return true;
      }
    }

    return false;
  }
}
