/* */
public class ButtonTestDrive {
	public static void main(String[] args) {
		Button B = new Button();

		B.setLabel(true);
		B.setColor("red");
		B.dePress(B.getLabel());
		B.unDepress(B.getLabel());

        System.out.println();
		
        B.setLabel(false);
		B.setColor("green");
		B.dePress(B.getLabel());
		B.unDepress(B.getLabel());
	}
}