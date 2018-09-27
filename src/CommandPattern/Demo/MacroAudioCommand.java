package CommandPattern.Demo;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {

	// 存放命令集合
	private List<Command> commandList = new ArrayList<Command>();

	/**
	 * 执行方法，按顺序执行所有命令
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("---------------自动回放保存的命令---------------");
		for (Command cmd : commandList) {
			cmd.execute();
		}
		System.out.println("---------------回放完成---------------");
	}

	/**
	 * 宏命令聚集管理方法
	 */
	@Override
	public void add(Command cmd) {
		// TODO Auto-generated method stub
		commandList.add(cmd);
	}

	/**
	 * 宏命令聚集管理方法
	 */
	@Override
	public void remove(Command cmd) {
		// TODO Auto-generated method stub
		commandList.remove(cmd);
	}

}
