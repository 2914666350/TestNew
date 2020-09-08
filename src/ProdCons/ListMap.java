package ProdCons;


import java.util.*;

public class ListMap {
    static Map<String, Integer> map1=new HashMap<String, Integer>();
    static Map<String, Integer> map2=new HashMap<String, Integer>();
    static Map<String, Integer> map3=new HashMap<String, Integer>();
    static Map<String, Integer> map4=new HashMap<String, Integer>();
    static Map<String, Integer> map5=new HashMap<String, Integer>();

  public static void main(String[] args) {
      int[][] a=new int[5][7];
      int num=0;
      for(int i=0;i<5;i++){
          for(int j=0;j<7;j++){
              int max=35,min=1;
              num++;
              a[i][j]=(int) (Math.random()*(max-min)+min);
              switch (i){
                  case 0:
                      map1.put("第"+num+"个数",a[i][j]);break;
                  case 1:
                      map2.put("第"+num+"个数",a[i][j]);break;
                  case 2:
                      map3.put("第"+num+"个数",a[i][j]);break;
                  case 3:
                      map4.put("第"+num+"个数",a[i][j]);break;
                  case 4:
                      map5.put("第"+num+"个数",a[i][j]);break;
              }
          }
      }
      List<Map> listMap=new ArrayList<>();
      listMap.add(map1);
      listMap.add(map2);
      listMap.add(map3);
      listMap.add(map4);
      listMap.add(map5);

      Iterator<Map> iterator=listMap.iterator();
      while(iterator.hasNext()){
          System.out.println(iterator.next());
      }
  }
}
