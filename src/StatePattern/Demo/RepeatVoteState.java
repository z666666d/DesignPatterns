package StatePattern.Demo;

/*
 * 重复投票
 */
public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		// 重复投票，暂时不做处理
		System.out.println("请不要重复投票");
	}

}
