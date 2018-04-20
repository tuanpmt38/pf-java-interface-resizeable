public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("truoc khi tang kich thuowc");
        System.out.println(circle.getArea());
        System.out.println("sau khi tawng kich thuowc");
        circle.resize(0.5);
        System.out.println();

        double percent = Math.random() * 100;
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(4);
        circles[1] = new Circle(3);
        circles[2] = new Circle(5);

        for (Circle cr : circles) {
            System.out.println(cr);
        }

        System.out.println("percent resize " + percent);
        for (int i = 0; i < circles.length; i++) {
            circles[i].resize(percent);
            System.out.println(circles[i]);
        }
    }
}
