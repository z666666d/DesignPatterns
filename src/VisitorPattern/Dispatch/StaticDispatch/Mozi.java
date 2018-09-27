package VisitorPattern.Dispatch.StaticDispatch;

/*
 * 墨子骑马的例子
 * 通过三个重载方法，分别接受马(Horse)、白马(WhiteHorse)、黑马(BlackHorse)等类型的参数
 * 虽然例子中wh、bh是不同的真实类型，但是静态类型都是Horse
 * 重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
 * 所以均调用的是ride(Horse h)方法
 */
public class Mozi {
	public void ride(Horse h) {
		System.out.println("骑马");
	}

	public void ride(WhiteHorse wh) {
		System.out.println("骑白马");
	}

	public void ride(BlackHorse bh) {
		System.out.println("骑黑马");
	}

	public static void main(String[] args) {
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		Mozi mozi = new Mozi();
		mozi.ride(wh);
		mozi.ride(bh);
	}
}
