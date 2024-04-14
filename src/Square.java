public class Square extends DrawableShape{
    private int comprimento;

    public Square(int centerX, int centerY, String color, int comprimento) {
        super(centerX, centerY, color);
        this.comprimento = comprimento;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void acesso(){

    }
    public void mutacao(){

    }
    public int calcularArea(){
        return comprimento*comprimento;
    }
    public int perimetroQuadrado(){
        return 4*comprimento;
    }
    @Override
    public void draw() {
        System.out.println("Desenhando Quadrado com: (" + getCentroX() + ", " + getCentroY() + ") com comprimento: " + comprimento + " e cor: " + getCor());
    }

}
