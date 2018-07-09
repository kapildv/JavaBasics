package commoninterfaces.poolpattern.limitedobjectpool;

public interface Parser<E, T> {
    public void parse(E elementToBeParsed, T result) throws Exception;

    public boolean isValid();

    public void reset();
}
