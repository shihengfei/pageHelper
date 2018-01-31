package com.baobao.test;

/**
 * 测试分页助手插件
 * <p>Company: www.qinmei.com</p> 
 * @author 史恒飞 ，tel ： 18516417728
 * @version 1.0 ， 2018年1月31日上午8:26:32
 */
public class TestPageHelper {

	/**	使用分页插件前需要在mybatis配置文件中配置
	 * <!-- 配置分页插件 -->
		<plugins>
			<plugin interceptor="com.github.pagehelper.PageHelper">
				<property name="dialect" value="mysql"/>
			</plugin>
		</plugins>
	*/
	
	/*@Test
	public void testPage(){
		// 加载spring 容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		// 获取 itemMapper 对象
		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
		// 设置分页
		PageHelper.startPage(1, 15);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		// 从查询结果中获取数据
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		// 总页数
		System.out.println(pageInfo.getPages());
		// 总记录数
		System.out.println(pageInfo.getTotal());
		// 每页条数
		System.out.println(list.size());
		
	}*/
}
