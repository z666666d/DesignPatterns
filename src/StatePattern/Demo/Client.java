package StatePattern.Demo;

/*
 * 状态的转换基本上都是内部行为，主要在状态模式内部来维护。
 */
public class Client {
	public static void main(String[] args) {

		VoteManager vm = new VoteManager();
		for (int i = 0; i < 9; i++) {
			vm.vote("u1", "A");
		}
	}
}
