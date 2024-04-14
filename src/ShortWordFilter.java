public class ShortWordFilter implements Filter{
    private int tamanho;
    public ShortWordFilter(int tamanho) {
        this.tamanho = tamanho;
    }

@Override
    public boolean accept(Object x) {
        if (x instanceof String) {
            String word = (String) x;
            return word.length() < tamanho;
        }
        return false;
    }
}
