import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class musuh
 */
public class musuh extends Actor
{
    private int speed = -3;        // Kecepatan musuh
    private int count = 0;         // Counter untuk mengatur arah
    private int health = 3;        // Jumlah health musuh
    private boolean kenaTembak = false; // Status apakah musuh telah terkena peluru

    public musuh()
    {
        getImage().mirrorHorizontally(); // Balikkan gambar secara horizontal
    }

    public void act()
    {
        move();            // Gerakkan musuh
        count++;           // Tingkatkan counter
        kenaTembakPelor(); // Periksa apakah musuh terkena peluru
    }

    // Logika untuk pergerakan musuh
    public void move()
    {
        if (count < 85) {
            setLocation(getX() + speed, getY()); // Gerakkan musuh ke arah saat ini
        } else {
            speed = -speed;                     // Balikkan arah
            getImage().mirrorHorizontally();    // Balikkan gambar
            count = 0;                          // Reset counter
        }
    }

    // Logika untuk terkena peluru
    public void kenaTembakPelor()
    {
        Actor pelor = getOneIntersectingObject(pelor.class); // Periksa apakah ada peluru yang menyentuh
        if (pelor != null && !kenaTembak) { // Jika musuh terkena peluru dan belum ditandai
            health--;                // Kurangi health musuh
            kenaTembak = true;       // Tandai bahwa musuh terkena peluru
            getWorld().removeObject(pelor); // Hapus peluru dari dunia
        }

        if (pelor == null) {
            kenaTembak = false; // Reset tanda jika peluru sudah tidak menyentuh
        }

        if (health <= 0) {
            // Tambahkan skor sebelum menghapus musuh
            MyWorld world = (MyWorld) getWorld(); // Ambil referensi ke dunia
            if (world != null) {
                world.increaseScore(5); // Tambah skor sebesar 5
            }

            // Hapus musuh dari dunia
            getWorld().removeObject(this);
        }
    }
}
