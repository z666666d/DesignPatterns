package AdapterPattern.DefaultAdapter.Demo1;

/*
 * 鲁智深是一个和尚，然而却没有吃斋、念经这些行为。所以这里鲁智深借助于适配器模式达到了剃度的目的
 */
public class 鲁智深 extends 天星 {

	public void 习武() {
		// 拳打镇关西；
		// 大闹五台山；
		// 大闹桃花村；
		// 火烧瓦官寺；
		// 倒拔垂杨柳；
	}

	public String getName() {
		return "鲁智深";
	}
}
