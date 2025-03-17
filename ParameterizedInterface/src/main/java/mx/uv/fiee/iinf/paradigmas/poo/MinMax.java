package mx.uv.fiee.iinf.paradigmas.poo;
/*
    Equipo:
    zS22019636 Jorge Samuel Solano Dorantes
    zs22002241 Alan Osmar Peña Polo
*/
public class MinMax<T extends Comparable<T>> implements IMinMax<T> {
    private final T[] valor;

    public MinMax(T[] valor) {
        this.valor = valor;
    }

    @Override
    public T min() {
        T minimo = valor[0];
        for(T v : valor){
            if(v.compareTo(minimo) < 0)
            {
                minimo = v;
            }
        }

        return minimo;
    }

    @Override
    public T max() {
        T maximo = valor[0];
        for(T v : valor){
            if(v.compareTo(maximo) > 0){
                maximo = v;
            }
        }

        return maximo;
    }

}