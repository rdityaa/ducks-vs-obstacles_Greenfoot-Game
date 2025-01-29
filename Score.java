import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor {
    private int score = 0; // Variabel untuk menyimpan skor

    public Score() {
        updateImage(); // Perbarui tampilan saat objek dibuat
    }

    public void addScore(int value) {
        score += value; // Tambahkan skor
        updateImage();  // Perbarui tampilan
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(150, 30); // Ukuran area skor
        image.setColor(Color.WHITE); // Warna teks
        image.setFont(new Font("Arial", true, false, 20)); // Font teks
        image.drawString("Score: " + score, 10, 20); // Gambar teks di layar
        setImage(image); // Tetapkan gambar ke objek ini
    }
}
