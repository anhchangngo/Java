public class Button {
	private Boolean label;
	private String color;

	public boolean getLabel() {
		return label;
	}

	public void setLabel(boolean newLabel) {
		label = newLabel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
        System.out.println("Button's color : " + color);
	}

	public void dePress(boolean label) {
		String result = (label) ? "ON" : "OFF" ;
		System.out.println("dePress : " + result);
	}

	public void unDepress(boolean label) {
		String result = (!label) ? "ON" : "OFF";
		System.out.println("unDepress : " + result);
	}
}