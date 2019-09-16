public class Canvas {
    private char[][] screen;
    private int sizeX;
    private  int sizeY;

    Canvas(int x, int y) {
        screen = new char[x][y];
        this.sizeX = x;
        this.sizeY = y;
        int i,j;
        for (j=0; j< y ; j++) {
            for (i=0; i< x ; i++) {
                screen[i][j] = '□';
            }
        }
    }

    public void draw(int x, int y) {
        screen[x][y] = '■';
    }

    public void display() {
        int i,j;
        for (j=0; j < sizeY; j++) {
            for (i=0; i < sizeX; i++) {
                System.out.print(screen[i][j]);
            }
            System.out.println("\n");
        }
    }
}
