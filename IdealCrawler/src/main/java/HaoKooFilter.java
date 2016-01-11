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
		subjectFilter.put("����", new String[]{
				"vv����",
				"������",
				"Lifehack",
				"������ѵ��Ӫ",
				"��������֬����һ��",
				"��ͽ����",
				"�����ߺ������",
				"������vs�����",
				"������",
				"��ɳ����",
				"GV��Ƭ",
				"����ѵ��Ӫ",
				"С����",
				"�˶�����gifͼ",
				"LEE����",
				"����114",
				"һ��Τ�½���",
				"Ī�Ƚ���",
				"CSPN",
				"���н���ѧԺ", 
				"������App", 
				"���˽���",
				"��������",
				"�¾�������", 
				"Ӳ�ɽ���", 
				"����ѵ��Ӫ", 
				"���⹤����",
				"���⹤��ʦ",
				"����װ", 
				"Keep", 
				"���н���ѧԺ",
				"����˺����",
				"Ľ�н���",
		});
		subjectFilter.put("�ܲ�", new String[]{
				"��������֬����һ��",
				"�����ߺ������",
				"������vs�����",
				"�ܲ�ָ��",
				"�ܲ�����",
				"����",
				"�ܲ�",
				"�����ݵ�90��",
				"С����",
				"������־ͼ",
				"�ܲ���",
				"��������",
				"��������", 
				"˽�˼���ʦ", 
		});
		subjectFilter.put("�٤", new String[]{
				"����",
				"�����ݵ�90��",
				"���٤", 
				"�٤΢����", 
				"�٤��ʦӪ",
		});
		subjectFilter.put("��ͽ", new String[]{
				"��ͽ����",
		});
		subjectFilter.put("Ȧ��", new String[]{
				"Lifehack",
				"�����ߺ������",
				"������vs�����",
				"GV��Ƭ",
				"LEE����",
				"CSPN",
				"����װ", 
		});
		subjectFilter.put("����", new String[]{
				"��������", 
				"CCTV5��������",
				"NBA����֮��",
				"��̳�ܱ�",
				"�Ϻ����������ձ�",
				"U����",
				"��������",
				"�����������»���",
				"���ų�������",
				"����BANK",
				"��������",
				"U����",
		});
		subjectFilter.put("��", new String[]{
				"����",
				"ȭ���ܿ�",	
				"WWE����ְҵˤ��",
				"UFC�ռ��񶷽�����",
				"����񶷷���",
				"����������",
		});
		subjectFilter.put("ѵ��", new String[]{
				"super health",
				"þŮ����ȥս��",
				"�˶�����gifͼ",
		});
		subjectFilter.put("����", new String[]{
				"�����˶�����ָ��",
				"����",
				"�����ݵ�90��",
				"������־ͼ",
				"С����",
				"�����ߺ������",
		});
		subjectFilter.put("����", new String[]{
				""
		});
	}

	public static Map<String, HaoKooFilter> authorsFilterMap = new HashMap<String, HaoKooFilter>();
	static
	{
		authorsFilterMap.put("vv����", 
				new HaoKooFilter("vv����",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		
		authorsFilterMap.put("������", 
				new HaoKooFilter("������", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		
		authorsFilterMap.put("Lifehack", 
				new HaoKooFilter("Lifehack", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPRiacf9RpN8D3oEVNZlASSOTS5knsgmsBeKUxRf1nho3D9o4r0Q9Izicg/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/pqeKtHqq92w4Wrk5Q3oudQayQkk3CSUNpDRAzYFp7mO6bjicHOe0VaspoNS7uTveBh5SALfJEW2ia4OYxr7CBVsw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOj3q9I94H3Tyk5FIUcGXOsyjWY5B6SYAp5eVM8nnHbN3NkGbozGCOQhicJHgwjHlGeFiaHI1ictVKeA/0?wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOj3q9I94H3Tyk5FIUcGXOsThXx2DmPZn7L0OALoLBMwvIJPtQ84HgyFnlOCfdWWr358Idynl8v4g/0?wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPTJPQvfLp7VzYicHY2npmrqrGfJgb5PR0Y7KeKdGcvP5OnCzvjgSGjjw/640?wxfrom=5&amp;wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeNxTeKia1ZGNKzneX6oE4HXPTJPQvfLp7VzYicHY2npmrqrGfJgb5PR0Y7KeKdGcvP5OnCzvjgSGjjw/640?wxfrom=5",
/*back start*/						"�ֻ����ַ"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOCdmaaK82ae3g2xXWkEPtLmhmlX1m0ap6ftl8LqJqCb31xr0xp5zIKFKxYQRRibUiaMsWqBibAIwF2A/0?wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/86ibYrTmViaeOCdmaaK82ae3g2xXWkEPtLpSVfaTtXJOrONHpmoKRLMA6wEL4CBJNFjHjfWKOHgicgUMSpFic29pRw/0?wx_fmt=jpeg"
											+ HaoKooFilter.IgnoreLineSeparator + "�Ķ�ԭ��"
											+ HaoKooFilter.IgnoreLineSeparator + "�ֻ����ַ"));
		
		authorsFilterMap.put("������ѵ��Ӫ",
				new HaoKooFilter("������ѵ��Ӫ", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("��������֬����һ��", 
				new HaoKooFilter("��������֬����һ��",
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/vqlbAuAicl0453GF4NlkCz0NgwRtHhRx6o6ezFSfogMfDdvuiagMYfl7LZquHCdgFcGBPkBvoCx3njOma8yYicolA/0" 
											+ HaoKooFilter.IgnoreLineSeparator + "/3.jpg",
											"http://mmbiz.qpic.cn/mmbiz/vqlbAuAicl0453GF4NlkCz0NgwRtHhRx6DH3PcjnBcTtHVsqJX0Tb47wmNCtfxagSzEKMzrWthMRHb3BiaJlo92Q/0"
											+ HaoKooFilter.IgnoreLineSeparator + "�ֻ����ַ"));
		
		authorsFilterMap.put("��ͽ����", 
				new HaoKooFilter("��ͽ����", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("�����ߺ������", 
				new HaoKooFilter("�����ߺ������", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											"�ظ��������Ȥ�ؼ���"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/hFdY52oozXiaicetQ9lDtkUETKCY9oce2JO7Q3eSJrofnIuhJNb1C7WMQJN70tAV1Kw6M6AhLPxvEtzic2nJfWREw/640?wx_fmt=png&amp;wxfrom=5&amp;wx_lazy=1"
											+ HaoKooFilter.IgnoreLineSeparator + "���̼����������֬Ӫ"
											+ HaoKooFilter.IgnoreLineSeparator + "http://haoku.b0.upaiyun.com/2400/1134892/25.jpg"));
		
		authorsFilterMap.put("������vs�����", 
				new HaoKooFilter("������vs�����", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											"�ظ��������Ȥ�ؼ���"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/hFdY52oozXiaicetQ9lDtkUETKCY9oce2JO7Q3eSJrofnIuhJNb1C7WMQJN70tAV1Kw6M6AhLPxvEtzic2nJfWREw/640?wx_fmt=png&amp;wxfrom=5&amp;wx_lazy=1"
											+ HaoKooFilter.IgnoreLineSeparator + "���̼����������֬Ӫ"
											+ HaoKooFilter.IgnoreLineSeparator + "http://haoku.b0.upaiyun.com/2400/1134892/25.jpg"));
		
		authorsFilterMap.put("������", 
				new HaoKooFilter("������",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											"�þ���һ��"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/D3bjaHiakNZKbSxEP4vfpVLUSibhhK0pZZx6DDwccgQatMsfwia7NZOGZkP69uLAtxibiboVR6JPXj4AibhroFnD5oiaA/0"
											+ HaoKooFilter.IgnoreLineSeparator + "�ظ��ؼ���"
											+ HaoKooFilter.IgnoreLineSeparator + "ʶ��ͼ�ж�ά��"));
		
		authorsFilterMap.put("�ܲ�ָ��", 
				new HaoKooFilter("�ܲ�ָ��", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		
		authorsFilterMap.put("�ܲ�����",
				new HaoKooFilter("�ܲ�����",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("��ɳ����", 
				new HaoKooFilter("��ɳ����",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("����", 
				new HaoKooFilter("����", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�ܲ�", 
				new HaoKooFilter("�ܲ�",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("GV��Ƭ", 
				new HaoKooFilter("GV��Ƭ",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("�����ݵ�90��",
				new HaoKooFilter("�����ݵ�90��",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("����ѵ��Ӫ", 
				new HaoKooFilter("����ѵ��Ӫ", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("������ѵ��Ӫ", 
				new HaoKooFilter("������ѵ��Ӫ", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("С����", 
				new HaoKooFilter("С����", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("�˶�����gifͼ", 
				new HaoKooFilter("�˶�����gifͼ",
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/oiabhxtElBWxe5icun2r9JtOQzZ6OPmxvfyRjxZEATxiaicTggruHgmeeLiaXDibTgG41rxn2Fneb22q9A87RSM9C3Ow/0",
											"http://mmbiz.qpic.cn/mmbiz/oiabhxtElBWzeNS1ic4GJFBeBj7BNlXvAjXdrgSFYwJrTNFRxNGI01r3FKfsDHxhNIxG423c8rYat8sl6cQHvjOg/0?wx_fmt=gif"));
		authorsFilterMap.put("������־ͼ", 
				new HaoKooFilter("������־ͼ",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("LEE����", 
				new HaoKooFilter("LEE����", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("����114", 
				new HaoKooFilter("����114", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("һ��Τ�½���", 
				new HaoKooFilter("һ��Τ�½���",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�ܲ���", 
				new HaoKooFilter("�ܲ���", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("Ī�Ƚ���", 
				new HaoKooFilter("Ī�Ƚ���",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		
		authorsFilterMap.put("CSPN", 
				new HaoKooFilter("CSPN", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/Xr7kndlqJOFpF9ryDDMkzBza9EZZTHk6T4xic8Fudtm0K83kF4X45pAWvvDC8AJ5BBBGv9PFcCNZ8Ckmiajian3zw/0", 
											"http://mmbiz.qpic.cn/mmbiz/Xr7kndlqJOFpF9ryDDMkzBza9EZZTHk6jDXDDicx5o5txpg0wGo0o4CH6sUvzr3meL0kSsg0vNRJAb0ZcZ9cV0Q/0"
											+ HaoKooFilter.IgnoreLineSeparator + "�ֻ����ַ"));
		
		authorsFilterMap.put("��������", 
				new HaoKooFilter("��������",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											"�ֻ����ַ"));
		
		authorsFilterMap.put("���н���ѧԺ", 
				new HaoKooFilter("���н���ѧԺ", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											"���˹ٷ�΢����@���н���ѧԺ"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0VHtxPHjxYbzwHwOVNxnqKUIr8ZU6ic6UdAbZyLoicL0libEwbbTaKGrwk4D1M7yk3G3WtnkAeL1VaicaBCsNzCAdg/0/mmbizgif?wxfrom=5&amp;wx_fmt=gif"
											+ HaoKooFilter.IgnoreLineSeparator + "�Ķ�ԭ��"
											+ HaoKooFilter.IgnoreLineSeparator + "�ֻ����ַ"));
		authorsFilterMap.put("������App", 
				new HaoKooFilter("������App", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("���˽���", 
				new HaoKooFilter("���˽���", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("��������", 
				new HaoKooFilter("��������", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "�����������ṩ������רҵ����Ȩ���Ľ�����Ѷ��ָ�������Խ�����ʳ��������������ռ���ѧ����ʽ��������������",
											"http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe1TqTc9YZbq5aOzaicb6dwwAQiaPE2TbmzQYBFXGL5Olo3bRswXdCkbia0Aqzp1P0TbPqj1iaceiaQxEyg/0"
											+ HaoKooFilter.IgnoreLineSeparator + "�Ķ�ԭ��"
											+ HaoKooFilter.IgnoreLineSeparator + "�ֻ����ַ"
											+ HaoKooFilter.IgnoreLineSeparator + "�����ķָ���"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe33vOyzMytDQWiaf1VgZaxZutbfF8pw5IGoZTqWsbiaQa9JibWCcaC7DDTP5RBpBK3ym6qFdd1o5xalQ/0?wx_fmt=png"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/qUKh7COtPe0icK36fnYwv5u1MXDfjTcNPDY1ejoD1OdyYJEBCT3XvpTyZ91vPznIvRiczpj3UoC88RmH4RT4FEicw/0"));
		
		authorsFilterMap.put("��������", 
				new HaoKooFilter("��������",
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSPWGw1HoBnCK17m48TPUb0y3SUgKdIweI2hymlB98HutzfG0hJcQd4Exee1Vy1GpA18RicSEM4Fn5w/0?wx_fmt=png",
											"http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSNicNlh0xoH33ULotnk5y4nrnYDpQ9UHBWbcIlicAfwszl5zvQ3btAteMWZBRAfRic87319pK5Xicu4aw/0?wx_fmt=png"
											+ HaoKooFilter.IgnoreLineSeparator + "��������copyright"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/6AN7ibb4SpSOT74sbYa2CbibyGUPFhjeoYzDrrtE64dqvoUSCyJictFENtO4tyxYVYo2tWcmgba3FgDvs9h9vpsvQ/0?wx_fmt=jpeg"));
		authorsFilterMap.put("�¾�������", 
				new HaoKooFilter("�¾�������", 
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("Ӳ�ɽ���", 
				new HaoKooFilter("Ӳ�ɽ���", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTqW66pNTiatRv5VZgucbym6ntI13xInzkDfDSbtusAuAMYKRt7n0FPwv6AzV1kvZz5nZwbAQgORsQ/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTnShANfkYnH1sabwwWb0UJYwKTR8icxpEq41lLEgy8X1DDiblQV4O24apJdbnjHWsN8j1baxvlI1ug/0", 
											"��ר������Ԥ��"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/0IicUItRgaiaTqW66pNTiatRv5VZgucbym6iaephRz3Fl0Ou8TdCDtqhUGVueX3UGB0icoJOTwA6lDGEKn1OmUn31Uw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "Ӳ�ɽ��������Ƹ"));
		authorsFilterMap.put("���٤", 
				new HaoKooFilter("���٤", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/xT7yN7TENODUPIKsMKdoQwbqBNWQUywCOkrPoF2lDgPERNak9vmYvMCW1VzjZSdtakKbZChnIvW5lqwibOOmnUA/0"
											+ HaoKooFilter.IgnoreLineSeparator + "��������Ե���٤԰��������Ů�����ļ�", 
											"���٤�ذ��Ƴ����٤�ѡ�����"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/OYSoPOREx3ibI5iaVTicialzWbrxbQ9TNPQAWKlDTpaAW2ljaib83Ehnic4lpa1r5A4d4zyExr3rudRLznU6ArVxHBBQ/0"));
		authorsFilterMap.put("��������", 
				new HaoKooFilter("��������", 
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "���ܾ���һ�����ʽ", 
											"http://mmbiz.qpic.cn/mmbiz/wOrzsNT2VZCmr7IribKqiaEgbK2Ftm6rpqFdGRRicaia0EZvajZtSGIXeMBBiavRL9CATyayUYh72JuQCM1yr9Gx4Gg/0"));
		authorsFilterMap.put("����ѵ��Ӫ", 
				new HaoKooFilter("����ѵ��Ӫ",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("�٤΢����", 
				new HaoKooFilter("�٤΢����", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("���⹤����", 
				new HaoKooFilter("���⹤����",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("˽�˼���ʦ", 
				new HaoKooFilter("˽�˼���ʦ",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("������", 
				new HaoKooFilter("������", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("����װ", 
				new HaoKooFilter("����װ", 
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("Keep", 
				new HaoKooFilter("Keep",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("���н���ѧԺ",
				new HaoKooFilter("���н���ѧԺ",
											"�Ķ���ֻ��һ�롣���ʣ���������", 
											""));
		authorsFilterMap.put("����", 
				new HaoKooFilter("����",
											"�Ķ���ֻ��һ�롣���ʣ���������"
											+ HaoKooFilter.IgnoreLineSeparator + "http://i2.w.yun.hjfile.cn/doc/201311/d1cb6b2d4d3843d8ad8e77a79a337039.gif"
											+ HaoKooFilter.IgnoreLineSeparator + "��ע��������Ѫ�ĸ񶷽�����Ѷ"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9RFvvEsia39MFcUmiag6ZPWic7nMxqFOpFMjmGNj4moWfQrmbpFvk0S0GOljW0SdqmIX2JH5l2P5mia7w/0",
											"����΢�ż���Ȥ����Ӫ��"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9QSAhItpjcEv4XWXDXSKRlNycpIxZ54nIpNenicZjGqsDpaibZZfTsNxGbics1VL3lz3hDbdGmOBaiaibw/0"
											+ HaoKooFilter.IgnoreLineSeparator + "http://mmbiz.qpic.cn/mmbiz/wjlO10VNp9QeAp7DwIU3uxl4xOHSHrPiahb92nH87Xqy7pwWhkHsnLQCzR3RM92H6rJhPsSTtqt8aVt9kowZOTQ/0"));
		authorsFilterMap.put("��������", 
				new HaoKooFilter("��������",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("����˺����", 
				new HaoKooFilter("����˺����",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�����������»���", 
				new HaoKooFilter("�����������»���",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("���ų�������", 
				new HaoKooFilter("���ų�������",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("ȭ���ܿ�", 
				new HaoKooFilter("ȭ���ܿ�",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("Ľ�н���", 
				new HaoKooFilter("Ľ�н���",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("CCTV5��������", 
				new HaoKooFilter("CCTV5��������",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("NBA����֮��", 
				new HaoKooFilter("NBA����֮��",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�����˶�����ָ��", 
				new HaoKooFilter("�����˶�����ָ��",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("����BANK", 
				new HaoKooFilter("����BANK",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("��̳�ܱ�", 
				new HaoKooFilter("��̳�ܱ�",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�Ϻ����������ձ�", 
				new HaoKooFilter("�Ϻ����������ձ�",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("U����", 
				new HaoKooFilter("U����",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("WWE����ְҵˤ��", 
				new HaoKooFilter("WWE����ְҵˤ��",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("����񶷷���", 
				new HaoKooFilter("WWE����ְҵˤ��",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("UFC�ռ��񶷽�����", 
				new HaoKooFilter("UFC�ռ��񶷽�����",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("super health", 
				new HaoKooFilter("super health",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("þŮ����ȥս��", 
				new HaoKooFilter("þŮ����ȥս��",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		authorsFilterMap.put("�٤��ʦӪ", 
				new HaoKooFilter("�٤��ʦӪ",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("���⹤��ʦ", 
				new HaoKooFilter("���⹤��ʦ",
											"�Ķ���ֻ��һ�롣���ʣ���������",
											""));
		
		authorsFilterMap.put("����������", 
				new HaoKooFilter("����������",
						"�Ķ���ֻ��һ�롣���ʣ���������",
						""));
		
	}
	
	public static Map<String, String> authorsInitUrl = new HashMap<String, String>();
	static
	{
		authorsInitUrl.put("vv����", 
				             "http://www.haokoo.com/user/15355/");
		
		authorsInitUrl.put("������", 
		           "http://www.haokoo.com/user/5787/");
		
		authorsInitUrl.put("Lifehack", 
		           "http://www.haokoo.com/user/5784/");
		
		authorsInitUrl.put("����", 
		           "http://www.haokoo.com/user/7230/");
		
		authorsInitUrl.put("������ѵ��Ӫ",
		           "http://www.haokoo.com/user/8512/");
		
		authorsInitUrl.put("��������֬����һ��", 
		           "http://www.haokoo.com/user/5785/");
		
		authorsInitUrl.put("��ͽ����", 
		           "http://www.haokoo.com/user/10700/");
		
		authorsInitUrl.put("�����ߺ������", 
		           "");
		authorsInitUrl.put("þŮ����ȥս��", 
		           "http://www.haokoo.com/user/17753/");
		authorsInitUrl.put("������vs�����", 
		           "http://www.haokoo.com/user/5099/");
		
		authorsInitUrl.put("������", 
		           "http://www.haokoo.com/user/7413/");
		
		authorsInitUrl.put("�ܲ�ָ��", 
		           "http://www.haokoo.com/user/179/");
		
		authorsInitUrl.put("�ܲ�����",
		           "http://www.haokoo.com/user/5791/");
		authorsInitUrl.put("��ɳ����", 
		           "");
		authorsInitUrl.put("����", 
		           "http://www.haokoo.com/user/4646/");
		authorsInitUrl.put("�ܲ�", 
		           "http://www.haokoo.com/user/14645/");
		authorsInitUrl.put("GV��Ƭ", 
		           "http://www.haokoo.com/user/13792/");
		authorsInitUrl.put("�����ݵ�90��",
		           "http://www.haokoo.com/user/5788/");
		authorsInitUrl.put("����ѵ��Ӫ", 
		           "http://www.haokoo.com/user/10711/");
		authorsInitUrl.put("������ѵ��Ӫ", 
		           "http://www.haokoo.com/user/8512/");
		authorsInitUrl.put("С����", 
		           "http://www.haokoo.com/user/4083/");
		authorsInitUrl.put("�˶�����gifͼ", 
		           "");
		
		authorsInitUrl.put("super health", 
		           "http://www.haokoo.com/user/17394/");
		authorsInitUrl.put("������־ͼ", 
		           "");
		authorsInitUrl.put("LEE����", 
		           "");
		authorsInitUrl.put("����114", 
		           "http://www.haokoo.com/user/10708/");
		authorsInitUrl.put("һ��Τ�½���", 
		           "http://www.haokoo.com/user/10715/");
		authorsInitUrl.put("�ܲ���", 
		           "");
		authorsInitUrl.put("Ī�Ƚ���", 
		           "http://www.haokoo.com/user/14523/");
		
		authorsInitUrl.put("CSPN", 
		           "http://www.haokoo.com/user/7067/");
		
		authorsInitUrl.put("��������", 
		           "http://www.haokoo.com/user/14632/");
		
		authorsInitUrl.put("���н���ѧԺ", 
		           "http://www.haokoo.com/else/3203560.html");
		authorsInitUrl.put("������App", 
		           "");
		authorsInitUrl.put("���˽���", 
		           "http://www.haokoo.com/user/12571/");
		authorsInitUrl.put("��������", 
		           "http://www.haokoo.com/user/77/");
		
		authorsInitUrl.put("��������", 
		           "");
		authorsInitUrl.put("�¾�������", 
		           "http://www.haokoo.com/user/9656/");
		authorsInitUrl.put("Ӳ�ɽ���", 
		           "http://www.haokoo.com/user/6912/");
		authorsInitUrl.put("���٤", 
		           "http://www.haokoo.com/user/6519/");
		authorsInitUrl.put("�٤��ʦӪ", 
		           "http://www.haokoo.com/user/13885/");
		authorsInitUrl.put("��������", 
		           "");
		authorsInitUrl.put("����ѵ��Ӫ", 
		           "");
		authorsInitUrl.put("�٤΢����", 
		           "");
		authorsInitUrl.put("���⹤����", 
		           "");
		authorsInitUrl.put("���⹤��ʦ",
				   "http://www.haokoo.com/user/18450/");
		authorsInitUrl.put("˽�˼���ʦ", 
		           "");
		authorsInitUrl.put("������", 
		           "");
		authorsInitUrl.put("����װ", 
		           "http://www.haokoo.com/user/4201/");
		authorsInitUrl.put("Keep", 
		           "http://www.haokoo.com/user/17442/");
		authorsInitUrl.put("���н���ѧԺ",
		           "http://www.haokoo.com/user/14627/");
		
		authorsInitUrl.put("��������", 
		           "http://www.haokoo.com/user/3703/");
		authorsInitUrl.put("����˺����", 
		           "http://www.haokoo.com/user/17403/");
		authorsInitUrl.put("�����������»���", 
		           "http://www.haokoo.com/user/5325/");
		authorsInitUrl.put("���ų�������", 
		           "");
		authorsInitUrl.put("ȭ���ܿ�", 
		           "http://www.haokoo.com/user/14630/");
		authorsInitUrl.put("Ľ�н���", 
		           "http://www.haokoo.com/user/13837/");
		authorsInitUrl.put("CCTV5��������", 
		           "");
		authorsInitUrl.put("NBA����֮��", 
		           "http://www.haokoo.com/user/4458/");
		authorsInitUrl.put("�����˶�����ָ��", 
		           "");
		authorsInitUrl.put("����BANK", 
		           "http://www.haokoo.com/user/10685/");
		authorsInitUrl.put("��̳�ܱ�", 
		           "http://www.haokoo.com/user/6482/");
		authorsInitUrl.put("�Ϻ����������ձ�", 
		           "");
		authorsInitUrl.put("U����", 
		           "http://www.haokoo.com/user/3705/");
		authorsInitUrl.put("WWE����ְҵˤ��", 
		           "http://www.haokoo.com/user/10062/");
		authorsInitUrl.put("����񶷷���", 
		           "");
		authorsInitUrl.put("UFC�ռ��񶷽�����", 
				           "");
		authorsInitUrl.put("����������",
					"http://www.haokoo.com/user/5944/");
		
	}
	
}
