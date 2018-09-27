package CommandPattern;

/*
 * 命令(Command)角色
 * 声明了一个给所有具体命令类的抽象接口。
 */
public interface Command {
	/**
	* 执行方法
	*/
	void execute();
}
