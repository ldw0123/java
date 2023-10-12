// p.210

package p220218;

public class Computer {

	public static void main(String[] args) {

		GraphicCard gc = new GraphicCard();
		gc.process(); 	// 원래 그래픽카드 process
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();

	}

}
