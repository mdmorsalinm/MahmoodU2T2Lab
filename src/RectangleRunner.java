public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        System.out.println("Plot 1 length: " + plot1.getLength());
        System.out.println("Plot 1 width: " + plot1.getWidth());
        System.out.println("Plot 1 area: " + (plot1.getLength() * plot1.getWidth()));

        System.out.println("Plot 2 length: " + plot2.getLength());
        System.out.println("Plot 2 width: " + plot2.getWidth());
        System.out.println("Plot 2 area: " + (plot2.getLength() * plot2.getWidth()));

        System.out.println("Plot 3 length: " + plot3.getLength());
        System.out.println("Plot 3 width: " + plot3.getWidth());
        System.out.println("Plot 3 area: " + (plot3.getLength() * plot3.getWidth()));
    }
}