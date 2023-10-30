package ch2;

public interface Subject {
    public void registerObserver(Observer O);

    public void removeObserver(Observer O);

    public void notifyObservers();
}