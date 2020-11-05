public class AsciiCharSequence implements CharSequence{

    private byte[] sequence;

    public AsciiCharSequence(byte[] sequence){
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return this.sequence.length;
    }

    @Override
    public char charAt(int index){
        return (char) sequence[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subSequence = new byte[end - start];
        for (int i = start, j = 0; i < end; i++, j++){
            subSequence[j] = this.sequence[i];
        }
        return new AsciiCharSequence(subSequence);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.sequence.length; i++){
            s.append((char) this.sequence[i]);
        }
        return s.toString();
    }
}
