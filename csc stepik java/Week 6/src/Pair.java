import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class Pair <T,M>{

    private final T t;
    private final M m;

    private Pair(T t, M m) {
        this.t = t;
        this.m = m;
    }


    public static <T,M> Pair<T,M> of(T t, M m) {
        return new Pair<>(t,m);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Pair)){
            return false;
        }
        Pair<T,M> other = (Pair<T,M>) obj;
        return (Objects.equals(other.getFirst(), this.getFirst()) && Objects.equals(other.getSecond(), this.getSecond()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirst(), this.getSecond());
    }

    public T getFirst(){
        return t;
    }

    public M getSecond(){
        return m;
    }
}
