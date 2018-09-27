package CommandPattern.Demo;

/*
 * 具体命令角色：播放
 */
public class PlayCommand implements Command {

	// 持有一个接收者
	private AudioPlayer myAudio;

	public PlayCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	/*
	 * 执行方法
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.play();
	}

}
