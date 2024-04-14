public abstract class DrawableShape {
    private int centroX;
    private int centroY;
    private String cor;

    public DrawableShape(int centroX, int centroY, String cor) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.cor = cor;
    }

    public int getCentroX() {
        return centroX;
    }
    public int getCentroY() {
        return centroY;
    }
    public String getCor() {
        return cor;
    }

    public void Move(int deltaX, int deltaY){
        centroX += deltaX;
        centroY += deltaY;

    }
    public abstract void draw();

}
