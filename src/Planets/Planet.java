package Planets;

import java.awt.*;

public class Planet {
    public int radius;
    public double mass;
    public double x;
    public double y;
    public double velx;
    public double vely;
    public Color color;

        public Planet(double x, double y, double mass,
                      int radius, Color color) {
            this.x = x;
            this.y = y;
            this.mass = mass;
            this.radius = radius;
            this.color = color;
            this.velx = 0;
            this.vely = 0;
        }
    public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(
                    (int)(x - radius),
                    (int)(y - radius),
                    radius * 2,
                    radius * 2
            );
    }
    public void update() {
        this.x += velx;
        this.y += vely;
    }

}
