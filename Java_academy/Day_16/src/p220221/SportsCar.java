package p220221;

public class SportsCar extends Car {
	//�ʵ�
    String color;
    //�޼ҵ�
    public void carSet(String name, int wheel) { 	// �Ű������� �̿���
        this.name = name;
        this.wheel = wheel;        
    }
    @Override    	 		     //-�ǽ�1-�ش���� 
    public void speedUp() { 	 //-�ǽ�1-�ش���� 
        speed += 10;        	 //-�ǽ�1-�ش���� 
    }                      	     //-�ǽ�1-�ش���� 
    //�������̵��� �� �� ����    //-�ǽ�1-�ش���� ���� ��� 
    /*
    @Override
    public void stop() { 		 // 
        System.out.println("������ī�� ����");
        speed = 0;
    }
    */
}
