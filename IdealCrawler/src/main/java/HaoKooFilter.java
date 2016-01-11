import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HaoKooFilter {

	public String author;
	public String frontIgnoreLine;
	public String backIgnoreLine;
	public static String IgnoreLineSeparator = "##";
	
	public HaoKooFilter(String author, String frontIgnoreLine, String backIgnoreLine)
	{
		this.author = author;
		this.frontIgnoreLine = frontIgnoreLine;
		this.backIgnoreLine = backIgnoreLine;
	}
	
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFrontIgnoreLine() {
		return frontIgnoreLine;
	}
	public void setFrontIgnoreLine(String frontIgnoreLine) {
		this.frontIgnoreLine = frontIgnoreLine;
	}
	public String getBackIgnoreLine() {
		return backIgnoreLine;
	}
	public void setBackIgnoreLine(String backIgnoreLine) {
		this.backIgnoreLine = backIgnoreLine;
	}


	public static Map<String, String[]> subjectFilter= new HashMap<String, String[]>();
	static
	{
		subjectFilter.put("健身", new String[]{
				"vv健身",
				"肌肉网",
				"Lifehack",
				"肌肉男训练营",
				"增肌、减脂分享一刻",
				"囚徒健身",
				"人鱼线和马甲线",
				"人鱼线vs马甲线",
				"爱健身",
				"浩沙健身",
				"GV钙片",
				"健身训练营",
				"小腹基",
				"运动健身gif图",
				"LEE健身",
				"健身114",
				"一兆韦德健身",
				"莫比健身",
				"CSPN",
				"型男健身学院", 
				"动起来App", 
				"虎扑健身",
				"火辣健身",
				"陈静健美城", 
				"硬派健身", 
				"肌肉训练营", 
				"肌肉工程网",
				"肌肉工程师",
				"男人装", 
				"Keep", 
				"型男健身学院",
				"腹肌撕裂者",
				"慕尚健身",
		});
		subjectFilter.put("跑步", new String[]{
				"增肌、减脂分享一刻",
				"人鱼线和马甲线",
				"人鱼线vs马甲线",
				"跑步指南",
				"跑步心情",
				"瘦瘦",
				"跑步",
				"帮你瘦到90斤",
				"小腹基",
				"减肥励志图",
				"跑步吧",
				"跑者世界",
				"城市悦跑", 
				"私人减肥师", 
		});
		subjectFilter.put("瑜伽", new String[]{
				"瘦瘦",
				"帮你瘦到90斤",
				"练瑜伽", 
				"瑜伽微社区", 
				"瑜伽导师营",
		});
		subjectFilter.put("囚徒", new String[]{
				"囚徒健身",
		});
		subjectFilter.put("圈内", new String[]{
				"Lifehack",
				"人鱼线和马甲线",
				"人鱼线vs马甲线",
				"GV钙片",
				"LEE健身",
				"CSPN",
				"男人装", 
		});
		subjectFilter.put("体育", new String[]{
				"虎扑体育", 
				"CCTV5体育新闻",
				"NBA篮球之家",
				"体坛周报",
				"上海东方体育日报",
				"U体育",
				"乐视体育",
				"五星体育赛事互动",
				"新闻晨报体育",
				"体育BANK",
				"乐视体育",
				"U体育",
		});
		subjectFilter.put("格斗", new String[]{
				"格斗迷",
				"拳击周刊",	
				"WWE美国职业摔角",
				"UFC终极格斗锦标赛",
				"教你格斗防身",
				"飞龙精武会馆",
		});
		subjectFilter.put("训练", new String[]{
				"super health",
				"镁女罩我去战斗",
				"运动健身gif图",
		});
		subjectFilter.put("减肥", new String[]{
				"健康运动瘦身指南",
				"瘦瘦",
				"帮你瘦到90斤",
				"减肥励志图",
				"小腹基",
				"人鱼线和马甲线",
		});
		subjectFilter.put("极限", new String[]{
				""
		});
	}

	public static Map<String, HaoKooFilter> authorsFilterMap = new HashMap<String, HaoKooFilter>();
	static
	{
		authorsFilterMap.put("vv健身", 
				new HaoKooFilter("vv健身",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		
		authorsFilterMap.put("肌肉网", 
				new HaoKooFilter("肌肉网", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		
		authorsFilterMap.put("Lifehack", 
				new HaoKooFilter("Lifehack", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPRiacf9RpN8D3oEVNZlASSOTS5knsgmsBeKUxRf1nho3D9o4r0Q9Izicg/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/pqeKtHqq92w4Wrk5Q3oudQayQkk3CSUNpDRAzYFp7mO6bjicHOe0VaspoNS7uTveBh5SALfJEW2ia4OYxr7CBVsw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOj3q9I94H3Tyk5FIUcGXOsyjWY5B6SYAp5eVM8nnHbN3NkGbozGCOQhicJHgwjHlGeFiaHI1ictVKeA/0?wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOj3q9I94H3Tyk5FIUcGXOsThXx2DmPZn7L0OALoLBMwvIJPtQ84HgyFnlOCfdWWr358Idynl8v4g/0?wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPTJPQvfLp7VzYicHY2npmrqrGfJgb5PR0Y7KeKdGcvP5OnCzvjgSGjjw/640?wxfrom=5&amp;wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPTJPQvfLp7VzYicHY2npmrqrGfJgb5PR0Y7KeKdGcvP5OnCzvjgSGjjw/640?wxfrom=5",
/*back start*/						"手机版地址"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOCdmaaK82ae3g2xXWkEPtLmhmlX1m0ap6ftl8LqJqCb31xr0xp5zIKFKxYQRRibUiaMsWqBibAIwF2A/0?wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOCdmaaK82ae3g2xXWkEPtLpSVfaTtXJOrONHpmoKRLMA6wEL4CBJNFjHjfWKOHgicgUMSpFic29pRw/0?wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "阅读原文"
											+ HaoKooFilter.IgnoreLineSeparator + "手机版地址"));
		
		authorsFilterMap.put("肌肉男训练营",
				new HaoKooFilter("肌肉男训练营", 
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("增肌、减脂分享一刻", 
				new HaoKooFilter("增肌、减脂分享一刻",
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/vqlbAuAicl0453GF4NlkCz0NgwRtHhRx6o6ezFSfogMfDdvuiagMYfl7LZquHCdgFcGBPkBvoCx3njOma8yYicolA/0" 
											+ HaoKooFilter.IgnoreLineSeparator + "/3.jpg",
											"http://mmbiz.qpic.cn/mmbiz/vqlbAuAicl0453GF4NlkCz0NgwRtHhRx6DH3PcjnBcTtHVsqJX0Tb47wmNCtfxagSzEKMzrWthMRHb3BiaJlo92Q/0"
											+ HaoKooFilter.IgnoreLineSeparator + "手机版地址"));
		
		authorsFilterMap.put("囚徒健身", 
				new HaoKooFilter("囚徒健身", 
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("人鱼线和马甲线", 
				new HaoKooFilter("人鱼线和马甲线", 
											"阅读，只需一秒。精彩，尽在掌握",
											"回复任意感兴趣关键词"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/hFdY52oozXiaicetQ9lDtkUETKCY9oce2JO7Q3eSJrofnIuhJNb1C7WMQJN70tAV1Kw6M6AhLPxvEtzic2nJfWREw/640?wx_fmt=png&amp;wxfrom=5&amp;wx_lazy=1"
											+ HaoKooFilter.IgnoreLineSeparator + "立刻加入人马君减脂营"
											+ HaoKooFilter.IgnoreLineSeparator + "http://haoku.b0.upaiyun.com/2400/1134892/25.jpg"));
		
		authorsFilterMap.put("人鱼线vs马甲线", 
				new HaoKooFilter("人鱼线vs马甲线", 
											"阅读，只需一秒。精彩，尽在掌握",
											"回复任意感兴趣关键词"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/hFdY52oozXiaicetQ9lDtkUETKCY9oce2JO7Q3eSJrofnIuhJNb1C7WMQJN70tAV1Kw6M6AhLPxvEtzic2nJfWREw/640?wx_fmt=png&amp;wxfrom=5&amp;wx_lazy=1"
											+ HaoKooFilter.IgnoreLineSeparator + "立刻加入人马君减脂营"
											+ HaoKooFilter.IgnoreLineSeparator + "http://haoku.b0.upaiyun.com/2400/1134892/25.jpg"));
		
		authorsFilterMap.put("爱健身", 
				new HaoKooFilter("爱健身",
											"阅读，只需一秒。精彩，尽在掌握", 
											"好就赞一下"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/D3bjaHiakNZKbSxEP4vfpVLUSibhhK0pZZx6DDwccgQatMsfwia7NZOGZkP69uLAtxibiboVR6JPXj4AibhroFnD5oiaA/0"
											+ HaoKooFilter.IgnoreLineSeparator + "回复关键词"
											+ HaoKooFilter.IgnoreLineSeparator + "识别图中二维码"));
		
		authorsFilterMap.put("跑步指南", 
				new HaoKooFilter("跑步指南", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		
		authorsFilterMap.put("跑步心情",
				new HaoKooFilter("跑步心情",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("浩沙健身", 
				new HaoKooFilter("浩沙健身",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("瘦瘦", 
				new HaoKooFilter("瘦瘦", 
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("跑步", 
				new HaoKooFilter("跑步",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("GV钙片", 
				new HaoKooFilter("GV钙片",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("帮你瘦到90斤",
				new HaoKooFilter("帮你瘦到90斤",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("健身训练营", 
				new HaoKooFilter("健身训练营", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("肌肉男训练营", 
				new HaoKooFilter("肌肉男训练营", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("小腹基", 
				new HaoKooFilter("小腹基", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("运动健身gif图", 
				new HaoKooFilter("运动健身gif图",
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/oiabhxtElBWxe5icun2r9JtOQzZ6OPmxvfyRjxZEATxiaicTggruHgmeeLiaXDibTgG41rxn2Fneb22q9A87RSM9C3Ow/0",
											"http://mmbiz.qpic.cn/mmbiz/oiabhxtElBWzeNS1ic4GJFBeBj7BNlXvAjXdrgSFYwJrTNFRxNGI01r3FKfsDHxhNIxG423c8rYat8sl6cQHvjOg/0?wx_fmt=gif"));
		authorsFilterMap.put("减肥励志图", 
				new HaoKooFilter("减肥励志图",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("LEE健身", 
				new HaoKooFilter("LEE健身", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("健身114", 
				new HaoKooFilter("健身114", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("一兆韦德健身", 
				new HaoKooFilter("一兆韦德健身",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("跑步吧", 
				new HaoKooFilter("跑步吧", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("莫比健身", 
				new HaoKooFilter("莫比健身",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		
		authorsFilterMap.put("CSPN", 
				new HaoKooFilter("CSPN", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/Xr7kndlqJOFpF9ryDDMkzBza9EZZTHk6T4xic8Fudtm0K83kF4X45pAWvvDC8AJ5BBBGv9PFcCNZ8Ckmiajian3zw/0", 
											"http://mmbiz.qpic.cn/mmbiz/Xr7kndlqJOFpF9ryDDMkzBza9EZZTHk6jDXDDicx5o5txpg0wGo0o4CH6sUvzr3meL0kSsg0vNRJAb0ZcZ9cV0Q/0"
											+ HaoKooFilter.IgnoreLineSeparator + "手机版地址"));
		
		authorsFilterMap.put("跑者世界", 
				new HaoKooFilter("跑者世界",
											"阅读，只需一秒。精彩，尽在掌握",
											"手机版地址"));
		
		authorsFilterMap.put("型男健身学院", 
				new HaoKooFilter("型男健身学院", 
											"阅读，只需一秒。精彩，尽在掌握", 
											"新浪官方微博：@型男健身学院"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0VHtxPHjxYbzwHwOVNxnqKUIr8ZU6ic6UdAbZyLoicL0libEwbbTaKGrwk4D1M7yk3G3WtnkAeL1VaicaBCsNzCAdg/0/mmbizgif?wxfrom=5&amp;wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "阅读原文"
											+ HaoKooFilter.IgnoreLineSeparator + "手机版地址"));
		authorsFilterMap.put("动起来App", 
				new HaoKooFilter("动起来App", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("虎扑健身", 
				new HaoKooFilter("虎扑健身", 
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("虎扑体育", 
				new HaoKooFilter("虎扑体育", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "我们致力于提供国内最专业、最权威的健身资讯和指导。热衷健康饮食、倡导健康生活，普及科学健身方式，传递正能量。",
											"http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe1TqTc9YZbq5aOzaicb6dwwAQiaPE2TbmzQYBFXGL5Olo3bRswXdCkbia0Aqzp1P0TbPqj1iaceiaQxEyg/0"
											+ HaoKooFilter.IgnoreLineSeparator + "阅读原文"
											+ HaoKooFilter.IgnoreLineSeparator + "手机版地址"
											+ HaoKooFilter.IgnoreLineSeparator + "华丽的分割线"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe33vOyzMytDQWiaf1VgZaxZutbfF8pw5IGoZTqWsbiaQa9JibWCcaC7DDTP5RBpBK3ym6qFdd1o5xalQ/0?wx_fmt=png"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe0icK36fnYwv5u1MXDfjTcNPDY1ejoD1OdyYJEBCT3XvpTyZ91vPznIvRiczpj3UoC88RmH4RT4FEicw/0"));
		
		authorsFilterMap.put("火辣健身", 
				new HaoKooFilter("火辣健身",
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSPWGw1HoBnCK17m48TPUb0y3SUgKdIweI2hymlB98HutzfG0hJcQd4Exee1Vy1GpA18RicSEM4Fn5w/0?wx_fmt=png",
											"http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSNicNlh0xoH33ULotnk5y4nrnYDpQ9UHBWbcIlicAfwszl5zvQ3btAteMWZBRAfRic87319pK5Xicu4aw/0?wx_fmt=png"
											+ HaoKooFilter.IgnoreLineSeparator + "火辣健身copyright"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSOT74sbYa2CbibyGUPFhjeoYzDrrtE64dqvoUSCyJictFENtO4tyxYVYo2tWcmgba3FgDvs9h9vpsvQ/0?wx_fmt=jpeg"));
		authorsFilterMap.put("陈静健美城", 
				new HaoKooFilter("陈静健美城", 
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("硬派健身", 
				new HaoKooFilter("硬派健身", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTqW66pNTiatRv5VZgucbym6ntI13xInzkDfDSbtusAuAMYKRt7n0FPwv6AzV1kvZz5nZwbAQgORsQ/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTnShANfkYnH1sabwwWb0UJYwKTR8icxpEq41lLEgy8X1DDiblQV4O24apJdbnjHWsN8j1baxvlI1ug/0", 
											"本专题下期预告"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTqW66pNTiatRv5VZgucbym6iaephRz3Fl0Ou8TdCDtqhUGVueX3UGB0icoJOTwA6lDGEKn1OmUn31Uw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "硬派健身继续招聘"));
		authorsFilterMap.put("练瑜伽", 
				new HaoKooFilter("练瑜伽", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/xT7yN7TENODUPIKsMKdoQwbqBNWQUywCOkrPoF2lDgPERNak9vmYvMCW1VzjZSdtakKbZChnIvW5lqwibOOmnUA/0"
											+ HaoKooFilter.IgnoreLineSeparator + "这里是有缘的瑜伽园，魅力男女生爱的家", 
											"练瑜伽重磅推出“瑜伽搜”服务"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/OYSoPOREx3ibI5iaVTicialzWbrxbQ9TNPQAWKlDTpaAW2ljaib83Ehnic4lpa1r5A4d4zyExr3rudRLznU6ArVxHBBQ/0"));
		authorsFilterMap.put("城市悦跑", 
				new HaoKooFilter("城市悦跑", 
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "悦跑就是一种生活方式", 
											"http://mmbiz.qpic.cn/mmbiz/wOrzsNT2VZCmr7IribKqiaEgbK2Ftm6rpqFdGRRicaia0EZvajZtSGIXeMBBiavRL9CATyayUYh72JuQCM1yr9Gx4Gg/0"));
		authorsFilterMap.put("肌肉训练营", 
				new HaoKooFilter("肌肉训练营",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("瑜伽微社区", 
				new HaoKooFilter("瑜伽微社区", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("肌肉工程网", 
				new HaoKooFilter("肌肉工程网",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("私人减肥师", 
				new HaoKooFilter("私人减肥师",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("健身迷", 
				new HaoKooFilter("健身迷", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("男人装", 
				new HaoKooFilter("男人装", 
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("Keep", 
				new HaoKooFilter("Keep",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("型男健身学院",
				new HaoKooFilter("型男健身学院",
											"阅读，只需一秒。精彩，尽在掌握", 
											""));
		authorsFilterMap.put("格斗迷", 
				new HaoKooFilter("格斗迷",
											"阅读，只需一秒。精彩，尽在掌握"
											+ HaoKooFilter.IgnoreLineSeparator + "http://i2.w.yun.hjfile.cn/doc/201311/d1cb6b2d4d3843d8ad8e77a79a337039.gif"
											+ HaoKooFilter.IgnoreLineSeparator + "关注，掌握热血的格斗健身资讯"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9RFvvEsia39MFcUmiag6ZPWic7nMxqFOpFMjmGNj4moWfQrmbpFvk0S0GOljW0SdqmIX2JH5l2P5mia7w/0",
											"格斗迷微信既有趣又有营养"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9QSAhItpjcEv4XWXDXSKRlNycpIxZ54nIpNenicZjGqsDpaibZZfTsNxGbics1VL3lz3hDbdGmOBaiaibw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9QeAp7DwIU3uxl4xOHSHrPiahb92nH87Xqy7pwWhkHsnLQCzR3RM92H6rJhPsSTtqt8aVt9kowZOTQ/0"));
		authorsFilterMap.put("乐视体育", 
				new HaoKooFilter("乐视体育",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("腹肌撕裂者", 
				new HaoKooFilter("腹肌撕裂者",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("五星体育赛事互动", 
				new HaoKooFilter("五星体育赛事互动",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("新闻晨报体育", 
				new HaoKooFilter("新闻晨报体育",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("拳击周刊", 
				new HaoKooFilter("拳击周刊",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("慕尚健身", 
				new HaoKooFilter("慕尚健身",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("CCTV5体育新闻", 
				new HaoKooFilter("CCTV5体育新闻",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("NBA篮球之家", 
				new HaoKooFilter("NBA篮球之家",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("健康运动瘦身指南", 
				new HaoKooFilter("健康运动瘦身指南",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("体育BANK", 
				new HaoKooFilter("体育BANK",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("体坛周报", 
				new HaoKooFilter("体坛周报",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("上海东方体育日报", 
				new HaoKooFilter("上海东方体育日报",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("U体育", 
				new HaoKooFilter("U体育",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("WWE美国职业摔角", 
				new HaoKooFilter("WWE美国职业摔角",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("教你格斗防身", 
				new HaoKooFilter("WWE美国职业摔角",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("UFC终极格斗锦标赛", 
				new HaoKooFilter("UFC终极格斗锦标赛",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("super health", 
				new HaoKooFilter("super health",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("镁女罩我去战斗", 
				new HaoKooFilter("镁女罩我去战斗",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		authorsFilterMap.put("瑜伽导师营", 
				new HaoKooFilter("瑜伽导师营",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("肌肉工程师", 
				new HaoKooFilter("肌肉工程师",
											"阅读，只需一秒。精彩，尽在掌握",
											""));
		
		authorsFilterMap.put("飞龙精武会馆", 
				new HaoKooFilter("飞龙精武会馆",
						"阅读，只需一秒。精彩，尽在掌握",
						""));
		
	}
	
	public static Map<String, String> authorsInitUrl = new HashMap<String, String>();
	static
	{
		authorsInitUrl.put("vv健身", 
				             "http://www.haokoo.com/user/15355/");
		
		authorsInitUrl.put("肌肉网", 
		           "http://www.haokoo.com/user/5787/");
		
		authorsInitUrl.put("Lifehack", 
		           "http://www.haokoo.com/user/5784/");
		
		authorsInitUrl.put("格斗迷", 
		           "http://www.haokoo.com/user/7230/");
		
		authorsInitUrl.put("肌肉男训练营",
		           "http://www.haokoo.com/user/8512/");
		
		authorsInitUrl.put("增肌、减脂分享一刻", 
		           "http://www.haokoo.com/user/5785/");
		
		authorsInitUrl.put("囚徒健身", 
		           "http://www.haokoo.com/user/10700/");
		
		authorsInitUrl.put("人鱼线和马甲线", 
		           "");
		authorsInitUrl.put("镁女罩我去战斗", 
		           "http://www.haokoo.com/user/17753/");
		authorsInitUrl.put("人鱼线vs马甲线", 
		           "http://www.haokoo.com/user/5099/");
		
		authorsInitUrl.put("爱健身", 
		           "http://www.haokoo.com/user/7413/");
		
		authorsInitUrl.put("跑步指南", 
		           "http://www.haokoo.com/user/179/");
		
		authorsInitUrl.put("跑步心情",
		           "http://www.haokoo.com/user/5791/");
		authorsInitUrl.put("浩沙健身", 
		           "");
		authorsInitUrl.put("瘦瘦", 
		           "http://www.haokoo.com/user/4646/");
		authorsInitUrl.put("跑步", 
		           "http://www.haokoo.com/user/14645/");
		authorsInitUrl.put("GV钙片", 
		           "http://www.haokoo.com/user/13792/");
		authorsInitUrl.put("帮你瘦到90斤",
		           "http://www.haokoo.com/user/5788/");
		authorsInitUrl.put("健身训练营", 
		           "http://www.haokoo.com/user/10711/");
		authorsInitUrl.put("肌肉男训练营", 
		           "http://www.haokoo.com/user/8512/");
		authorsInitUrl.put("小腹基", 
		           "http://www.haokoo.com/user/4083/");
		authorsInitUrl.put("运动健身gif图", 
		           "");
		
		authorsInitUrl.put("super health", 
		           "http://www.haokoo.com/user/17394/");
		authorsInitUrl.put("减肥励志图", 
		           "");
		authorsInitUrl.put("LEE健身", 
		           "");
		authorsInitUrl.put("健身114", 
		           "http://www.haokoo.com/user/10708/");
		authorsInitUrl.put("一兆韦德健身", 
		           "http://www.haokoo.com/user/10715/");
		authorsInitUrl.put("跑步吧", 
		           "");
		authorsInitUrl.put("莫比健身", 
		           "http://www.haokoo.com/user/14523/");
		
		authorsInitUrl.put("CSPN", 
		           "http://www.haokoo.com/user/7067/");
		
		authorsInitUrl.put("跑者世界", 
		           "http://www.haokoo.com/user/14632/");
		
		authorsInitUrl.put("型男健身学院", 
		           "http://www.haokoo.com/else/3203560.html");
		authorsInitUrl.put("动起来App", 
		           "");
		authorsInitUrl.put("虎扑健身", 
		           "http://www.haokoo.com/user/12571/");
		authorsInitUrl.put("虎扑体育", 
		           "http://www.haokoo.com/user/77/");
		
		authorsInitUrl.put("火辣健身", 
		           "");
		authorsInitUrl.put("陈静健美城", 
		           "http://www.haokoo.com/user/9656/");
		authorsInitUrl.put("硬派健身", 
		           "http://www.haokoo.com/user/6912/");
		authorsInitUrl.put("练瑜伽", 
		           "http://www.haokoo.com/user/6519/");
		authorsInitUrl.put("瑜伽导师营", 
		           "http://www.haokoo.com/user/13885/");
		authorsInitUrl.put("城市悦跑", 
		           "");
		authorsInitUrl.put("肌肉训练营", 
		           "");
		authorsInitUrl.put("瑜伽微社区", 
		           "");
		authorsInitUrl.put("肌肉工程网", 
		           "");
		authorsInitUrl.put("肌肉工程师",
				   "http://www.haokoo.com/user/18450/");
		authorsInitUrl.put("私人减肥师", 
		           "");
		authorsInitUrl.put("健身迷", 
		           "");
		authorsInitUrl.put("男人装", 
		           "http://www.haokoo.com/user/4201/");
		authorsInitUrl.put("Keep", 
		           "http://www.haokoo.com/user/17442/");
		authorsInitUrl.put("型男健身学院",
		           "http://www.haokoo.com/user/14627/");
		
		authorsInitUrl.put("乐视体育", 
		           "http://www.haokoo.com/user/3703/");
		authorsInitUrl.put("腹肌撕裂者", 
		           "http://www.haokoo.com/user/17403/");
		authorsInitUrl.put("五星体育赛事互动", 
		           "http://www.haokoo.com/user/5325/");
		authorsInitUrl.put("新闻晨报体育", 
		           "");
		authorsInitUrl.put("拳击周刊", 
		           "http://www.haokoo.com/user/14630/");
		authorsInitUrl.put("慕尚健身", 
		           "http://www.haokoo.com/user/13837/");
		authorsInitUrl.put("CCTV5体育新闻", 
		           "");
		authorsInitUrl.put("NBA篮球之家", 
		           "http://www.haokoo.com/user/4458/");
		authorsInitUrl.put("健康运动瘦身指南", 
		           "");
		authorsInitUrl.put("体育BANK", 
		           "http://www.haokoo.com/user/10685/");
		authorsInitUrl.put("体坛周报", 
		           "http://www.haokoo.com/user/6482/");
		authorsInitUrl.put("上海东方体育日报", 
		           "");
		authorsInitUrl.put("U体育", 
		           "http://www.haokoo.com/user/3705/");
		authorsInitUrl.put("WWE美国职业摔角", 
		           "http://www.haokoo.com/user/10062/");
		authorsInitUrl.put("教你格斗防身", 
		           "");
		authorsInitUrl.put("UFC终极格斗锦标赛", 
				           "");
		authorsInitUrl.put("飞龙精武会馆",
					"http://www.haokoo.com/user/5944/");
		
	}
	
}
