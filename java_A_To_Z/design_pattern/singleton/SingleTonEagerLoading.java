package singleton;

public class SingleTonEagerLoading {
private static final SingleTonEagerLoading singleton=new SingleTonEagerLoading();
private SingleTonEagerLoading() {
}
public static SingleTonEagerLoading getInstance() {
	return singleton;
}

}
