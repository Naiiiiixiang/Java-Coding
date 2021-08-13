package hahaha.lalala.inexer1;

public class Graphic {
  private String name;

  public void setName(String name){
      this.name = name;
  }
  public Graphic(){}

  public Graphic(String  name){
      this.name = name;
  }

    /**
     * 求面积的方法
     * @return
     */
  public double getArea(){
      return 0.0;
  }
    /**
     * 求周长的方法
     */
    public double getPerimeter(){
        return 0.0;
    }
    public String getInfo(){
        return "名字是："+name+"，面积是："+getArea()+"，周长是："+getPerimeter();
    }
}
