package CommandPattern.Demo;

/*
 * 增加一个宏命令接口
 * 宏命令可以将多个命令记录下来一次性执行
 */
public interface MacroCommand extends Command {

	/**
	 * 宏命令聚集的管理方法
	 * 可以添加一个成员命令
	 */
	public void add(Command cmd);

	/**
	 * 宏命令聚集的管理方法
	 * 可以删除一个成员命令
	 */
	public void remove(Command cmd);

}
