import greenfoot.*;  

public class JoystickKnob extends Actor {
    private Joystick joystick;
    private GreenfootImage knobImage;
    private int knobRadius;
    private int offsetX, offsetY;

    public JoystickKnob(Joystick joystick) {
        this.joystick = joystick;
        knobRadius = 15;

        // Nyeting gambar buat Knob
        knobImage = new GreenfootImage("joystick_knob.png");
        knobImage.scale(knobRadius * 2, knobRadius * 2);
        setImage(knobImage);
    }

    public void act() {
        if (Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int dx = mouse.getX() - joystick.getX();
            int dy = mouse.getY() - joystick.getY();
            double distance = Math.sqrt(dx * dx + dy * dy);

            if (distance < joystick.getRadius()) {
                offsetX = dx;
                offsetY = dy;
            } else {
                offsetX = (int) (dx * joystick.getRadius() / distance);
                offsetY = (int) (dy * joystick.getRadius() / distance);
            }

            setLocation(joystick.getX() + offsetX, joystick.getY() + offsetY);
        } else if (Greenfoot.mouseDragEnded(this)) {
            offsetX = 0;
            offsetY = 0;
            setLocation(joystick.getX(), joystick.getY());
        }
    }

    public int getOffsetX() {
        return offsetX;
    }

    public int getOffsetY() {
        return offsetY;
    }
}
