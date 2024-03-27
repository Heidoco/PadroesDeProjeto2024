/**
 * Subject
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer oobserver);
	public void notifyObservers();
}