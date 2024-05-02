public class ShapeTestDrive {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Circle c = new Circle(4, 5, 6);
        Cylinder cy = new Cylinder(7, 2, 5, 3);

        System.out.println("Shape Type : " + p.calName() + " x " + p.getX() + " y " + p.getY());
        System.out.println("\nShape Type : " + c.calName() + " x " + c.getX() + " y " + c.getY() + " r " + c.getR());
        System.out.println("Area : " + c.calArea());

        System.out.println("\nShape Type : " + cy.calName() + " x " + cy.getX() + " y " + cy.getY() + " r " + cy.getR() + " h " + cy.getH());
        System.out.println("Area : " + c.calArea());
        System.out.println("Volume : " + cy.calVolume());
    }
}