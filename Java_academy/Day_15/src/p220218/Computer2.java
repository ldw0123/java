// p.212

package p220218;

public class Computer2 {

	public static void main(String[] args) {
		
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);
		
		Amd gc2 = new Amd();
		g.display(gc2);
		
		Nvidia gc3 = new Nvidia();
		g.display(gc3);
	}

}
