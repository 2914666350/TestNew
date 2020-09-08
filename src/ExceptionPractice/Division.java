package ExceptionPractice;

public class Division {
    public static double div(double x, double y) throws Exception{
        double num=0;
            try{
                if(y==0) throw new ArithmeticException("分母不能为零");
                num=x/y;
            }catch (Exception e){
                e.printStackTrace();
            }
        return num;
    }
     public static void main(String[] args) {
        try{
            System.out.println(div(2,0));
        }catch(Exception e){
            e.printStackTrace();
        }
     }
}
