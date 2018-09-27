package MementoPattern.WhiteBox;
/*
 * 备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是对象的行为模式。
 * 
 * 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。
 * 备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来
 * 从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
 */

/*
 * 备忘录(Memento)角色
 * 将发起人对象的内战状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人对象的内部状态。
 * 备忘录可以保护其内容不被发起人对象之外的任何对象所读取。
 */

/*
 * 在白箱备忘录模式中，备忘录角色提供一个宽接口，备忘录角色的内部所存储的状态对所有对象公开
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
