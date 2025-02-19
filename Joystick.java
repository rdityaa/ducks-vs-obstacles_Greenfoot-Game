import greenfoot.*;  

public class Joystick extends Actor {
    private GreenfootImage base;
    private JoystickKnob knob;
    private int radius;

    public Joystick() {
        radius = 40;
        base = new GreenfootImage("joystick_base.png");
        base.scale(radius * 2, radius * 2);
        setImage(base);
    }

    public void addedToWorld(World world) {
        // Nambahin knob
        knob = new JoystickKnob(this);
        world.addObject(knob, getX(), getY());
    }

    public int getRadius() {
        return radius;
    }

    public int getOffsetX() {
        return knob.getOffsetX();
    }

    public int getOffsetY() {
        return knob.getOffsetY();
    }
}
