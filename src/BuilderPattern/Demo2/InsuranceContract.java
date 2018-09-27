package BuilderPattern.Demo2;

/**
 * 产品类：保险合同
 * 
 * 在本例中，产品类中包含了一个构建器内部类
 * 由于在本例中，构建器的作用就是用来构建指定的产品，所以完全没有必要用一个单独的类
 * 
 * @author Administrator
 *
 */

public class InsuranceContract {

	// 保险合同编号
	private String contractId;
	/**
	 * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
	 * 也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
	 */
	private String personName;
	// 被保险公司的名称
	private String companyName;
	// 保险开始生效日期
	private long beginDate;
	// 保险失效日期，一定会大于保险开始生效日期
	private long endDate;
	// 其他数据
	private String otherData;

	// 私有构造方法，内部类建造者调用以创建对象
	// 私有是为了防止客户端不使用构建器来构建产品对象，直接通过new创建对象会导致构建的对象有问题
	private InsuranceContract(ConcreteBuilder builder) {
		this.contractId = builder.contractId;
		this.personName = builder.personName;
		this.companyName = builder.companyName;
		this.beginDate = builder.beginDate;
		this.endDate = builder.endDate;
		this.otherData = builder.otherData;
	}

	/**
	 * 保险合同的一些操作
	 */
	public void someOperation() {
		System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");
	}

	// 建造者模式的简化
	// 用建造者模式来建造特定的对象，没有必要定义Builder接口，直接提供一个具体建造者类即可
	public static class ConcreteBuilder {
		private String contractId;
		private String personName;
		private String companyName;
		private long beginDate;
		private long endDate;
		private String otherData;

		/**
		 * 构造方法，传入必须要有的参数
		 * @param contractId     保险合同编号
		 * @param beginDate        保险合同开始生效日期
		 * @param endDate        保险合同失效日期
		 */
		public ConcreteBuilder(String contractId, long beginDate, long endDate) {
			this.contractId = contractId;
			this.beginDate = beginDate;
			this.endDate = endDate;
		}

		// 通过setter方法传入可选参数
		// 被保险人员的名称
		public ConcreteBuilder setPersonName(String personName) {
			this.personName = personName;
			return this;
		}

		// 被保险公司的名称
		public ConcreteBuilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		// 其他数据
		public ConcreteBuilder setOtherData(String otherData) {
			this.otherData = otherData;
			return this;
		}

		/**
		* 构建真正的对象并返回
		* @return    构建的保险合同对象
		*/
		public InsuranceContract build() {

			// 1.在合同创建时必须要有合同编号
			if (contractId == null || contractId.trim().length() == 0) {
				throw new IllegalArgumentException("合同编号不能为空");
			}

			// 2.判断是不是个人合同
			boolean signPerson = (personName != null && personName.trim().length() > 0);

			// 3.判断是不是公司合同
			boolean signCompany = (companyName != null && companyName.trim().length() > 0);

			// 4.可以和个人签订，也可以和某个公司签订，但是一份保险合同不能同时与个人和公司签订
			if (signPerson && signCompany) {
				throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
			}
			if (signPerson == false && signCompany == false) {
				throw new IllegalArgumentException("一份保险合同不能没有签订对象");
			}

			// 5.判断保险合同是否有生效日期
			if (beginDate <= 0) {
				throw new IllegalArgumentException("一份保险合同必须有开始生效的日期");
			}

			// 6.判断保险合同是否有失效日期
			if (endDate <= 0) {
				throw new IllegalArgumentException("一份保险合同必须有失效的日期");
			}

			// 7.失效日期必须大于生效日期
			if (endDate < beginDate) {
				throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
			}

			// 8.通过私有构造器创建一份保险合同
			return new InsuranceContract(this);

		}
	}

}
