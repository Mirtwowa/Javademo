package Display.led;

public class Display {
    private int value;
    private int limit;

    public Display(int limit){
        this.limit=limit;

    }

    public void increase(){
          value++;
          if(value==limit){
              value=0;
          }
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args){
          Display dis=new Display(24);
          for (;;){
              dis.increase();
              System.out.println(dis.getValue());
          }
    }
}
