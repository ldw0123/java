package p220221;

public class SportsCar extends Car {
	//필드
    String color;
    //메소드
    public void carSet(String name, int wheel) { 	// 매개변수를 이용함
        this.name = name;
        this.wheel = wheel;        
    }
    @Override    	 		     //-실습1-해당없음 
    public void speedUp() { 	 //-실습1-해당없음 
        speed += 10;        	 //-실습1-해당없음 
    }                      	     //-실습1-해당없음 
    //오버라이딩을 할 수 없음    //-실습1-해당없음 이하 모두 
    /*
    @Override
    public void stop() { 		 // 
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */
}
