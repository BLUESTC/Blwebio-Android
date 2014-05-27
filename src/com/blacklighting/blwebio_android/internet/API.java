/**
 * 
 */
package com.blacklighting.blwebio_android.internet;

/**
 * statusnet API��������������ַ�����û���ἰ��POST��GET���ǿ��еģ�����û���ἰ�Ļ���ѡ
 * 
 * @author �Ǿ�
 * @see https://dev.twitter.com/docs/api/1.1
 * @see http://status.net/wiki/Twitter-compatible_API
 */
public class API {
	public final static String API_FORMAT = "json";
	public final static String API_ROOT = "http://studio.scie.in/blacklighting/BLK/statusnet-1.1.1/index.php/api/";

	// ������twitter ��ֲAPI��ע�⣬��Щû��ʵ��
	// ��� http://status.net/wiki/Twitter-compatible_API
	// Timeline resources
	/**
	 * ����δ����˽�ܵ��û� ( �������Զ�����û�ͷ�� ) �����20����Ϣ���÷�������Ҫ�����֤�� ֧�ָ�ʽ(format)��xml, json,
	 * rss, atom �����б��ޡ�
	 */
	public final static String PUBLICK_TIME_LINE_API = API_ROOT
			+ "statuses/public_timeline." + API_FORMAT;

	/**
	 * Returns a collection of the most recent Tweets and retweets posted by the
	 * authenticating user and the users they follow. The home timeline is
	 * central to how most users interact with the Twitter service.
	 * 
	 * Up to 800 Tweets are obtainable on the home timeline. It is more volatile
	 * for users that follow many users or follow users who tweet
	 * frequently.</br>
	 * 
	 * Parameters�� </br><strong> count (optional)</strong> </br> Specifies the
	 * number of records to retrieve. Must be less than or equal to 200.
	 * Defaults to 20. </br><strong> since_id</strong></br> (optional)Returns
	 * results with an ID greater than (that is, more recent than) the specified
	 * ID. There are limits to the number of Tweets which can be accessed
	 * through the API. If the limit of Tweets has occured since the since_id,
	 * the since_id will be forced to the oldest ID available.Example Values:
	 * 12345</br><strong> max_id </strong></br> (optional)Returns results with
	 * an ID less than (that is, older than) or equal to the specified ID.
	 * trim_user When set to either true, t or 1, each tweet returned in a
	 * timeline will include a user object including only the status authors
	 * numerical ID. Omit this parameter to receive the complete user
	 * object.Example Values: 54321 </br><strong>exclude_replies</strong></br>
	 * This parameter will prevent replies from appearing in the returned
	 * timeline. Using exclude_replies with the count parameter will mean you
	 * will receive up-to count tweets �� this is because the count parameter
	 * retrieves that many tweets before filtering out retweets and
	 * replies.Example Values: true </br><strong>trim_user</strong></br>When set
	 * to either true, t or 1, each tweet returned in a timeline will include a
	 * user object including only the status authors numerical ID. Omit this
	 * parameter to receive the complete user object. Example Values: true</br>
	 * </br><strong>contributor_details</strong></br>optional This parameter
	 * enhances the contributors element of the status response to include the
	 * screen_name of the contributor. By default only the user_id of the
	 * contributor is included Example Values:
	 * true</br><strong>include_entities</strong></br>The entities node will be
	 * disincluded when set to false. Example Values: false
	 * 
	 * @see https://dev.twitter.com/docs/api/1.1/get/statuses/home_timeline
	 */
	public final static String HOME_TIME_LINE_API = API_ROOT
			+ "statuses/home_timeline." + API_FORMAT;

	/**
	 * �������24Сʱ�ڵ����µ�20����֤�û�������Ѹ��µ���Ϣ�� ֧�ָ�ʽ ( format ) ��xml, json, rss, atom
	 * �����б�
	 * 
	 * ����</br><strong>since_id</strong></br>: ��ѡ������΢����ϢID��.
	 * ֻ����ID��since_id�󣨱�since_idʱ����ģ���΢����Ϣ���ݡ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends_timeline.xml?since_id=12345
	 * 
	 * ����</br><strong>max_id</strong></br>: ��ѡ������΢����ϢID��. ����ID������max_id��΢����Ϣ���ݡ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends_timeline.xml?max_id=54321
	 * 
	 * ����</br><strong>count</strong></br>: ��ѡ����. ÿ�η��ص�����¼�������ܳ���200��Ĭ��20.
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends_timeline.xml?count=5
	 * 
	 * ����</br><strong>page</br><strong>: ��ѡ����.
	 * ���ؽ����ҳ��š�ע�⣺�з�ҳ���ơ������û���ע���󷢱��������ͨ����෵��1,000������΢����ҳ����, Ĭ��1
	 */
	public final static String FRIENDS_TIME_LINE_API = API_ROOT
			+ "statuses/friends_timeline." + API_FORMAT;

	/**
	 * ��ʾ20������Ķ��û��Ļظ���Ϣ�� ( ��Ϣǰ׺Ϊ @username )
	 * ����APIֻ���Ÿ���֤�û������������û����յ��Ļظ���Ϣ�б��ǷǷ��ģ����������û�����˽����� ֧�ָ�ʽ ( format ) ��xml,
	 * json, rss, atom �����б�
	 * 
	 * ����</br><strong>since_id</strong></br>. ��ѡ����.
	 * ����ID����ֵsince_id�󣨱�since_idʱ����ģ����ᵽ��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/mentions.xml?since_id=12345
	 * 
	 * ����</br><strong>max_id</strong></br>. ��ѡ����. ����ID������max_id(ʱ�䲻����max_id)���ᵽ��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/mentions.xml?max_id=54321
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����. ÿ�η��ص�����¼������ҳ���С����������200��Ĭ��Ϊ20��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/mentions.xml?count=200
	 * 
	 * ����</br><strong>page</strong></br>. ��ѡ����. ���ؽ����ҳ��š�ע�⣺�з�ҳ���ơ�
	 */
	public final static String MENTIONS_API = API_ROOT + "statuses/mentions."
			+ API_FORMAT;

	public final static String REPLIES_API = API_ROOT + "statuses/replies."
			+ API_FORMAT;

	/**
	 * ������֤�û����24Сʱ�����¸��µ�20����Ϣ��ͬ����ͨ������userIdOrName�����������������������û����������Ϣ���¡�
	 * ��API���Բ���֤�� ֧�ָ�ʽ ( format )��xml, json, rss, atom �����б�
	 * 
	 * ����</br><strong>id</strong></br>�� ��ѡ����. ����ָ���û�UID��΢���ǳ�������΢����Ϣ��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/user_timeline/12345.xml
	 * 
	 * ����</br><strong>user_id</strong></br>�� ��ѡ����.
	 * �û�UID����Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ���ر�����΢���ǳ�Ϊ���ֵ��º��û�Uid�������塣
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/user_timeline.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>����ѡ����.΢���ǳƣ���Ҫ�����������û�UID��΢���ǳ�һ����
	 * ���������ʱ��
	 * 
	 * ����ʾ��:
	 * http://api.twitter.com/statuses/user_timeline.xml?screen_name=101010
	 * 
	 * ����</br><strong>since_id</strong></br>����ѡ������΢����ϢID��.
	 * ֻ����ID��since_id�󣨱�since_idʱ����ģ���΢����Ϣ����
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/user_timeline.xml?since_id=12345
	 * 
	 * ����</br><strong>max_id</strong></br>: ��ѡ������΢����ϢID��. ����ID������max_id��΢����Ϣ���ݡ�
	 * 
	 * ����ʾ��: Example:
	 * http://api.twitter.com/statuses/user_timeline.xml?max_id=54321
	 * 
	 * ����</br><strong>count</strong></br>: ��ѡ����. ÿ�η��ص�����¼������෵��200����Ĭ��20��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/user_timeline.xml?count=200
	 * 
	 * ����</br><strong>page</strong></br>�� ��ѡ����. ��ҳ���ء�ע�⣺��෵��200����ҳ���ݡ�
	 */
	public final static String USER_TIMELINE_API = API_ROOT
			+ "statuses/user_timeline." + API_FORMAT;

	/**
	 * ��API��statsnet��û��ʵ��
	 * 
	 * @deprecated
	 */
	public final static String RETWEETED_TO_ME_API = API_ROOT
			+ "statuses/retweeted_to_me." + API_FORMAT;
	/**
	 * ��API��statsnet��û��ʵ��
	 * 
	 * @deprecated
	 */
	public final static String RETWEETED_BY_ME_API = API_ROOT
			+ "statuses/retweeted_by_me." + API_FORMAT;

	/**
	 * Returns the most recent tweets authored by the authenticating user that
	 * have been retweeted by others. This timeline is a subset of the user's
	 * GET statuses/user_timeline.
	 * 
	 * </br><strong>Parameters</strong></br>Specifies the number of records to
	 * retrieve. Must be less than or equal to 100. If omitted, 20 will be
	 * assumed.
	 * 
	 * Example Values: 5</br> </br><strong>count</strong></br>Returns results
	 * with an ID greater than (that is, more recent than) the specified ID.
	 * There are limits to the number of Tweets which can be accessed through
	 * the API. If the limit of Tweets has occured since the since_id, the
	 * since_id will be forced to the oldest ID available.
	 * 
	 * Example Values: 12345</br> </br><strong>since_id</strong></br>Returns
	 * results with an ID less than (that is, older than) or equal to the
	 * specified ID.
	 * 
	 * Example Values: 54321</br> </br><strong>max_id</strong></br>Returns
	 * results with an ID less than (that is, older than) or equal to the
	 * specified ID.
	 * 
	 * Example Values: 54321</br> </br><strong>trim_user</strong></br>When set
	 * to either true, t or 1, each tweet returned in a timeline will include a
	 * user object including only the status authors numerical ID. Omit this
	 * parameter to receive the complete user object.
	 * 
	 * Example Values: true</br> </br><strong>include_entities</strong></br>The
	 * tweet entities node will be disincluded when set to false.
	 * 
	 * Example Values: false</br> </br><strong>include_entities</strong></br>The
	 * user entities node will be disincluded when set to false.
	 * 
	 * Example Values: false</br>
	 * 
	 * @see https://dev.twitter.com/docs/api/1.1/get/statuses/retweets_of_me
	 */
	public final static String RETWEETS_OF_ME_API = API_ROOT
			+ "statuses/retweeted_of_me." + API_FORMAT;

	// Status resources
	// �û���Ϣ��ط���
	/**
	 * ����ָ��Id��һ����Ϣ��������Ϣ�а���������Ϣ�� ֧�ָ�ʽ ( format ) ��xml, json �����б�:
	 * 
	 * ����</br><strong>id</strong></br>. �������(΢����ϢID)��Ҫ��ȡ�ѷ����΢��ID,��ID�����ڷ��ؿ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/show/142277.xml
	 */
	public final static String SHOW_API = API_ROOT + "statuses/show."
			+ API_FORMAT;

	/**
	 * ������֤�û�����Ϣ���������content�������ұ�����POST��ʽ���� �ɹ�ʱ��ָ����ʽ���ص�ǰ����Ϣ�� ֧�ָ�ʽ ( format
	 * )��xml, json �����б�:
	 * 
	 * ����</br><strong>status</strong></br>. ���������
	 * Ҫ���µ�΢����Ϣ��������URLEncode,��Ϣ���ݲ�����140������,Ϊ�շ���400����
	 * 
	 * ����</br><strong>in_reply_to_status_id</strong></br>. ��ѡ������@ ��Ҫ�ظ���΢����ϢID,
	 * �������ֻ����΢�������� @username ��ͷ�������塣
	 * 
	 * ����</br><strong>lat</strong></br>. ��ѡ������γ�ȣ�����ǰ΢�����ڵĵ���λ�ã���Ч��Χ -90.0��+90.0,
	 * +��ʾ��γ��ֻ���û�������geo_enabled=trueʱ�����λ�ò���Ч��
	 * 
	 * ����</br><strong>long</strong></br>. ��ѡ���������ȡ���Ч��Χ-180.0��+180.0, +��ʾ������
	 */
	public final static String UPDATE_API = API_ROOT + "statuses/update."
			+ API_FORMAT;

	/**
	 * ����ָ����idɾ��һ����Ϣ����֤�û���������Ϣ�����ߡ� ֧�ָ�ʽ ( format ) ��xml, json �����б�:
	 * 
	 * ����</br><strong>id</strong></br> ���룬��ɾ������ϢId�� ���磺
	 * 
	 * ����http://api.twitter.com/statuses/destroy/12345.json
	 * 
	 * ��������
	 * 
	 * ����http://api.twitter.com/statuses/destroy.xml?id=23456
	 */
	public final static String DESTROY_API = API_ROOT + "statuses/destroy."
			+ API_FORMAT;
	public final static String RETWEET_API = API_ROOT + "statuses/retweet."
			+ API_FORMAT;

	// User resources
	// �û������ӿ�
	/**
	 * ������֤�û��������б��ں�ÿ���û��ĵ�ǰ΢����Ϣ���������ͬ�������������������û��������б�ͨ������ָ���ķ�������id������ ֧�ָ�ʽ (
	 * format )��xml, json �����б�:
	 * 
	 * ����</br><strong>id</strong></br>. ѡ�����. Ҫ��ȡ�� UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends/12345.json
	 * 
	 * ����http://api.twitter.com/statuses/friends/12345.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. ѡ�����. Ҫ��ȡ��UID
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>. ѡ�����. Ҫ��ȡ��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends.xml?screen_name=101010
	 * 
	 * ����</br><strong>cursor</strong></br>. ѡ�����.
	 * ��ҳֻ�ܰ���100����ע�б�Ϊ�˻�ȡ������cursorĬ�ϴ�-1��ʼ��ͨ�����ӻ����cursor����ȡ����,
	 * ���û����һҳ����next_cursor����0
	 * 
	 * �����Ĺ�ע�б�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends/williamlong.xml?cursor=-1
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends/williamlong.xml?cursor=
	 * 1300794057949944903
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����.
	 * ÿ�η��ص�����¼������ҳ���С����������200,Ĭ�Ϸ���20��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/friends/bob.xml?&count=200
	 */
	public final static String FRIENDS_API = API_ROOT + "statuses/friends."
			+ API_FORMAT;

	/**
	 * ������֤�û��Ķ����ߣ��ں�ÿ�������ߵĵ�ǰ��Ϣ����friendsһ����ֻ��Ҫ��friends��ַ�е�friends�滻Ϊfollowers���ɣ�
	 * ����һ�а�������������Ҫ�ı䣬����һ�����÷��� ֧�ָ�ʽ ( format )��xml, json �����б�:
	 * 
	 * ����</br><strong>id</strong></br>. ѡ�����. Ҫ��ȡ��˿�� UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/followers/12345.json or
	 * http://api.twitter.com/statuses/followers/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. ѡ�����. Ҫ��ȡ��UID
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/followers.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>. ѡ�����. Ҫ��ȡ��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/followers.xml?screen_name=101010
	 * 
	 * ����</br><strong>cursor</strong></br>. ѡ�����.
	 * ��ҳֻ�ܰ���100����˿�б�Ϊ�˻�ȡ������cursorĬ�ϴ�-1��ʼ��ͨ�����ӻ����cursor����ȡ����ģ����û����һҳ
	 * ����next_cursor����0
	 * 
	 * ������˿�б� ʾ��:
	 * http://api.twitter.com/statuses/followers/barackobama.xml?cursor=-1 ʾ��:
	 * http://api.twitter.com/statuses/followers/barackobama.xml?cursor=
	 * 1300794057949944903
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����.
	 * ÿ�η��ص�����¼������ҳ���С����������200,Ĭ�Ϸ���20��
	 * 
	 * ����ʾ��: http://api.twitter.com/statuses/followers/bob.xml?&count=200
	 */
	public final static String FOLLOWERS_API = API_ROOT + "statuses/followers."
			+ API_FORMAT;
	/**
	 * ��ʾָ���û�����չ��Ϣ����Ҫ�����û���id����ʾ���ơ���չ��Ϣ�����û���ҳ�����á�΢�������ȣ�
	 * ��˵�����Ӧ�õĿ����߿��Ը�����Щ��ϢΪ�û��ṩ���ʵ����⡣
	 * 
	 * ����ע�⣺��API����������뷢�ԺϷ�΢���û������������Լ�/���˵���չ��Ϣ�� ֧�ָ�ʽ ( format )��xml, json �����б�
	 * 
	 * ����</br><strong>id</strong></br>. �û�UID��΢���ǳơ�
	 * 
	 * ����ʾ��: http://api.twitter.com/users/show/12345.json ��
	 * http://api.twitter.com/users/show/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>.
	 * ָ���û�UID,��Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ���ر������û��˺�Ϊ���ֵ��º��û�Uid�������塣
	 * 
	 * ����ʾ��: http://api.twitter.com/users/show.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>.
	 * ָ��΢���ǳƣ���Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ��
	 * 
	 * ����ʾ��: http://api.twitter.com/users/show.xml?screen_name=101010
	 */
	public final static String USERS_SHOW_API = API_ROOT + "users/show."
			+ API_FORMAT;

	// Direct message resources
	// ˽�Ų�������
	/**
	 * �����û�����Ϣ�б� ֧�ָ�ʽ ( format ) ��xml, json, rss, atom �����б�:
	 * 
	 * ����</br><strong>since_id</strong></br>. ��ѡ����.
	 * ����ID����ֵsince_id�󣨱�since_idʱ����ģ���˽�š�
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?since_id=12345
	 * 
	 * ����</br><strong>max_id</strong></br>. ��ѡ����. ����ID������max_id(ʱ�䲻����max_id)��˽�š�
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?max_id=54321
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����. ÿ�η��ص�����¼������ҳ���С����������200��
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?count=200
	 * 
	 * ����</br><strong>page</strong></br>. ��ѡ����. ���ؽ����ҳ��š�ע�⣺�з�ҳ���ơ�
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?page=3
	 */
	public final static String DIRECT_MESSAGES_API = API_ROOT
			+ "direct_messages." + API_FORMAT;

	/**
	 * �����û����ѷ�����Ϣ�б� ֧�ָ�ʽ ( format ) ��xml, json, rss, atom �����б�:
	 * 
	 * ����</br><strong>since_id</strong></br>. ��ѡ����.
	 * ����ID����ֵsince_id�󣨱�since_idʱ����ģ���˽�š�
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?since_id=12345
	 * 
	 * ����</br><strong>max_id</strong></br>. ��ѡ����. ����ID������max_id(ʱ�䲻����max_id)��˽�š�
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?max_id=54321
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����. ÿ�η��ص�����¼������ҳ���С����������200��
	 * 
	 * ����ʾ��: http://api.twitter.com/direct_messages.xml?count=200
	 * 
	 * ����</br><strong>page</strong></br>. ��ѡ����. ���ؽ����ҳ��š�ע�⣺�з�ҳ���ơ�
	 */
	public final static String DIRECT_MESSAGES_SENT_API = API_ROOT
			+ "direct_messages/sent." + API_FORMAT;

	/**
	 * ����֤�û��������ָ���������û�����һ��������Ϣ�������������user��text,�������ʹ��POST��ʽ�ύ��
	 * �ɹ������������ķ�����Ϣ�����������user��text������ʹ��POST��ʽ�ύ���ɹ������������ķ�����Ϣ��
	 * 
	 * ֧�ָ�ʽ ( format ) ��xml, json �����б�
	 * 
	 * ����</br><strong>user: user_id����screen_name</strong></br>
	 * 
	 * ����</br><strong>text</strong></br>: �������.
	 * Ҫ��������Ϣ���ݣ���Ҫ��URLEncode���ı���С����С��300������
	 */
	public final static String DIRECT_MESSAGES_NEW_API = API_ROOT
			+ "direct_messages/new." + API_FORMAT;

	/**
	 * @deprecated ��API��statusnet��û��ʵ�֣�
	 * 
	 *             ͨ����������Ϣid��ɾ��ָ����������Ϣ����֤�û�ֻ��ɾ������Ϊ�������յ�����Ϣ��ʹ��POST��GET���������� ֧�ָ�ʽ
	 *             ( format ) ��xml, json �����б�
	 * 
	 *             ����</br><strong>id</strong></br>. ���������Ҫɾ����˽������ID.
	 * 
	 *             ����ʾ��:
	 *             http://api.twitter.com/direct_messages/destroy/12345.json
	 */
	public final static String DIRECT_MESSAGES_DESTROY_API = API_ROOT
			+ "direct_messages/destroy." + API_FORMAT;

	// Friendships resources
	// ���ѹ�ϵ��������
	/**
	 * ������֤�û��������id����ָ�����û�֮��ĺ��ѹ�ϵ���ò���ִ�гɹ�ʱ���ر���Ϊ���ѵ��û���Ϣ��ִ��ʧ���򷵻�ʧ�ܵ�״̬�ִ���
	 * 
	 * ֧�ָ�ʽ ( format ) ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ��������Ĳ�������������һ��:
	 * 
	 * ����</br><strong>id</strong></br>. �������. Ҫ��ע���û�UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/create/12345.json or
	 * http://api.twitter.com/friendships/create/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. �������.
	 * Ҫ��ע���û�UID,��Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ��
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/create.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>.�������.
	 * Ҫ��ע��΢���ǳ�,��Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ��
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/create.xml?screen_name=101010
	 * 
	 * ����</br><strong>follow</strong></br>. ��ѡ�������ݲ�֧�֡�
	 */
	public final static String FRIENDSHIPS_CREATE_API = API_ROOT
			+ "friendships/create." + API_FORMAT;

	/**
	 * ����ע��ָͬ��id���û��ĺ��ѹ�ϵ���������ɹ�ʱ�������ر�ȡ�����ѹ�ϵ���û�����ʧ��ʱ�����᷵��ʧ����Ϣ��
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/friendships/destroy/id.format
	 * 
	 * ����֧�ָ�ʽ ( format ) ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ��������Ĳ�������������һ��:
	 * 
	 * ����</br><strong>id</strong></br>. �������. Ҫȡ����ע���û�UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/destroy/12345.json or
	 * http://api.twitter.com/friendships/destroy/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. �������.
	 * Ҫȡ����ע���û�UID,��Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ��
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/destroy.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>. �������.
	 * Ҫȡ����΢���ǳ�,��Ҫ�����������û�UID��΢���ǳ�һ�������������ʱ��
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/destroy.xml?screen_name=101010
	 */
	public final static String FRIENDSHIPS_DESTROY_API = API_ROOT
			+ "friendships/destroy." + API_FORMAT;

	/**
	 * �������������û��Ĺ�ϵ�Ƿ������ѹ�ϵ���߸����뱻����Ĺ�ϵ�������໥����Ĺ�ϵ��������磺A������B��Bû�и���A�������ض�Ӧ�ĸ�ʽ���ݣ���xml
	 * ��<result><AFollowB>true</AFollowB><BFollowA>false</BFollowA></result>
	 * 
	 * �������ʵ�ַ�� http://api.twitter.com/friendships/exists.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>user_a</strong></br>. ���������Ҫ�жϵ��û�UID
	 * 
	 * ����</br><strong>user_b</strong></br>. ���������Ҫ�жϵı���ע���û�UID
	 */
	public final static String FRIENDSHIPS_EXISTS_API = API_ROOT
			+ "friendships/create." + API_FORMAT;

	/**
	 * ���������û���ϵ����ϸ���
	 * 
	 * �������ʵ�ַ�� http://api.twitter.com/friendships/show.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * �������²����ɲ���д���粻���ȡ��ǰ�û�
	 * 
	 * ����</br><strong>source_id</strong></br>. Դ�û�UID
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/show.xml?source_id=10502
	 * 
	 * ����</br><strong>source_screen_name</strong></br>. Դ΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/show.xml?source_screen_name=bob
	 * 
	 * ���������������ѡ��һ��:
	 * 
	 * ����</br><strong>target_id</strong></br>. Ҫ�жϵ�Ŀ���û�UID
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/show.xml?target_id=10503
	 * 
	 * ����</br><strong>target_screen_name</strong></br>. Ҫ�жϵ�Ŀ��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friendships/show.xml?target_screen_name=
	 * williamlong
	 */
	public final static String FRIENDSHIPS_SHOW_API = API_ROOT
			+ "friendships/show." + API_FORMAT;

	// Friends and followers resources
	// ��ȡ�û��б���
	/**
	 * ������ȡָ�����û��������û�id�����Լ�������˵�id
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/friends/ids.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>id</strong></br>. ѡ�����. Ҫ��ȡ���ѵ�UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friends/ids/12345.xml or
	 * http://api.twitter.com/statuses/friends/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. ѡ�����. Ҫ��ȡ��UID
	 * 
	 * ����ʾ��: http://api.twitter.com/friends/ids.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>. ѡ�����. Ҫ��ȡ��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/friends/ids.xml?screen_name=101010
	 * 
	 * ����</br><strong>cursor</strong></br>. ѡ�����.
	 * ��ҳֻ�ܰ���5000��id��Ϊ�˻�ȡ������cursorĬ�ϴ�-1��ʼ��ͨ�����ӻ����cursor����ȡ����Ĺ�ע�б�
	 * 
	 * ����ʾ��: http://api.twitter.com/friends/ids.xml?cursor=-1 ʾ��:
	 * http://api.twitter.com/friends/ids.xml?cursor=1300794057949944903
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����.
	 * ÿ�η��ص�����¼������ҳ���С����������5000��Ĭ�Ϸ���500��
	 * 
	 * ����ʾ��: http://api.twitter.com/friends/ids.xml?count=200
	 */
	public final static String FRIENDS_IDS_SHOW_API = API_ROOT + "friends/ids."
			+ API_FORMAT;

	/**
	 * ������ȡָ�����û���������û�id��
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/followers/ids.format
	 * 
	 * ����֧�ָ�ʽ��xml,json
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>id</strong></br>. ѡ�����. Ҫ��ȡ���ѵ�UID��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids/12345.xml or
	 * http://api.twitter.com/statuses/friends/bob.xml
	 * 
	 * ����</br><strong>user_id</strong></br>. ѡ�������Ҫ��ȡ��UID
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids.xml?user_id=1401881
	 * 
	 * ����</br><strong>screen_name</strong></br>. ѡ�������Ҫ��ȡ��΢���ǳ�
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids.xml?screen_name=101010
	 * 
	 * ����</br><strong>cursor</strong></br>. ѡ�����.
	 * ��ҳֻ�ܰ���5000��id��Ϊ�˻�ȡ������cursorĬ�ϴ�-1��ʼ��ͨ�����ӻ����cursor����ȡ����Ĺ�ע�б�
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids.xml?cursor=-1
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids.xml?cursor=1300794057949944903
	 * 
	 * ����</br><strong>count</strong></br>. ��ѡ����.
	 * ÿ�η��ص�����¼������ҳ���С����������5000��Ĭ�Ϸ���500��
	 * 
	 * ����ʾ��: http://api.twitter.com/followers/ids.xml?count=200
	 */
	public final static String FOLLOWERS_IDS_SHOW_API = API_ROOT
			+ "followers/ids." + API_FORMAT;

	// Account resources
	// �û��ʺŷ���
	/**
	 * ����û������֤�ɹ��򷵻� http״̬Ϊ 200������ǲ��򷵻�401��״̬�ʹ�����Ϣ���˷��������ж��û�����Ƿ�Ϸ���
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/account/verify_credentials.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 */
	public final static String ACCOUNT_VERIFY_CREDENTIALS_SHOW_API = API_ROOT
			+ "account/verify_credentials." + API_FORMAT;

	/**
	 * @deprecated
	 */
	public final static String ACCOUNT_END_SESSION_API = API_ROOT
			+ "account/end_session." + API_FORMAT;

	public final static String ACCOUNT_UPDATE_LOCATION_API = API_ROOT
			+ "account/update_location." + API_FORMAT;
	/**
	 * @deprecated
	 */
	public final static String ACCOUNT_UPDATE_DELIVERY_DEVICE_API = API_ROOT
			+ "account/update_delivery_device." + API_FORMAT;
	public final static String ACCOUNT_RATE_LIMIT_STATUS_API = API_ROOT
			+ "account/rate_limit_status." + API_FORMAT;

	/**
	 * �Զ���΢��ҳ��Ĳ�����ֻ���޸Ĳ��������
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/account/update_profile.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ����������һ�²����е�һ������������ֵΪ�ַ���. ��һ�������ƣ����������ĸ�����������.
	 * 
	 * ����</br><strong>name</strong></br>. �ǳƣ���ѡ����.������20������
	 * 
	 * ����</br><strong>gender</strong></br> �Ա𣬿�ѡ����. m,�У�f,Ů��
	 * 
	 * ����</br><strong>province</strong></br> ��ѡ����. �ο�ʡ�ݳ��б����
	 * 
	 * ����</br><strong>city</strong></br> ��ѡ����. �ο�ʡ�ݳ��б����,1000Ϊ����
	 * 
	 * ����</br><strong>description</strong></br>. ��ѡ����. ������160������.
	 */
	public final static String ACCOUNT_UPDATE_PROFILE_BACKGROUND_IMAGE_API = API_ROOT
			+ "account/update_profile_background_image." + API_FORMAT;

	public final static String ACCOUNT_UPDATE_PROFILE_IMAGE_API = API_ROOT
			+ "account/update_profile_image." + API_FORMAT;

	// Favorite resources
	// �ղ���ط���
	/**
	 * ������Ȩ�û������µ�20���ղص�״̬��Ϣ��Ҳ����ͨ��id�����û�����ָ��һ���û�����ѯ�����µ�20���ղص�״̬��Ϣ��
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/favorites.format
	 * 
	 * ����֧�ָ�ʽ��xml, json, rss, atom
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>page</strong></br>�� ��ѡ����. ���ؽ����ҳ��š�ע�⣺�з�ҳ���ơ�
	 * 
	 * ����ʾ��: http://api.twitter.com/favorites/11075.xml?page=3
	 */
	public final static String FAVORITES_API = API_ROOT + "favorites."
			+ API_FORMAT;

	/**
	 * �ղ�һ��״̬��ϢPOST�ύ
	 * 
	 * �������ʵ�ַ��
	 * 
	 * ����http://api.twitter.com/favorites/create.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>id</strong></br> ���룬��Ȩ�û�Ҫ�ղص�״̬��Ϣid��
	 */
	public final static String FAVORITES_CREATE_API = API_ROOT
			+ "favorites/create." + API_FORMAT;

	/**
	 * ɾ����Ȩ�û��ղص�һ��״̬��Ϣ
	 * 
	 * �������ʵ�ַ��http://api.twitter.com/favorites/destroy/id.format
	 * 
	 * ����֧�ָ�ʽ��xml, json
	 * 
	 * ���������б�
	 * 
	 * ����</br><strong>id</strong></br> ��Ȩ�û��ղص�״̬��Ϣid��
	 */
	public final static String FAVORITES_DESTROY_API = API_ROOT
			+ "favorites/destroy." + API_FORMAT;

	// Notification resources
	/**
	 * @deprecated
	 */
	public final static String NOTIFICATIONS_FOLLOW_API = API_ROOT
			+ "notifications/follow." + API_FORMAT;

	/**
	 * @deprecated
	 */
	public final static String NOTIFICATIONS_LEAVE_API = API_ROOT
			+ "notifications/leave." + API_FORMAT;

	// Block resources
	public final static String BLOCKS_CREATE_API = API_ROOT + "blocks/create."
			+ API_FORMAT;
	public final static String BLOCKS_DESTROY_API = API_ROOT
			+ "blocks/destroy." + API_FORMAT;

	/**
	 * @deprecated
	 */
	public final static String BLOCKS_EXISTS_API = API_ROOT + "blocks/destroy."
			+ API_FORMAT;

	/**
	 * @deprecated
	 */
	public final static String BLOCKS_BLOCKING_API = API_ROOT
			+ "blocks/blocking." + API_FORMAT;

	// OAuth resources
	/**
	 * Allows a Consumer application to obtain an OAuth Request Token to request
	 * user authorization. This method fulfills Section 6.1 of the OAuth 1.0
	 * authentication flow.
	 * 
	 * It is strongly recommended you use HTTPS for all OAuth authorization
	 * steps.
	 * 
	 * Usage Note: Only ASCII values are accepted for the oauth_nonce
	 * 
	 * </br><strong>Parameters</strong></br></br>
	 * </br><strong>oauth_callback</strong></br>required For OAuth 1.0a
	 * compliance this parameter is required. The value you specify here will be
	 * used as the URL a user is redirected to should they approve your
	 * application's access to their account. Set this to oob for out-of-band
	 * pin mode. This is also how you specify custom callbacks for use in
	 * desktop/mobile applications.
	 * 
	 * Always send an oauth_callback on this step, regardless of a
	 * pre-registered callback.
	 * 
	 * Example Values: http%3A%2F%2Fthemattharris.local%2Fauth.php,
	 * twitterclient%3A%2F%2Fcallback</br>
	 * 
	 * </br><strong>x_auth_access_type</strong></br>optional Overrides the
	 * access level an application requests to a users account. Supported values
	 * are read or write. This parameter is intended to allow a developer to
	 * register a read/write application but also request read only access when
	 * appropriate.</br>
	 * 
	 * </br><strong>Example Request</strong></br> Request URL: POST
	 * https://api.twitter.com/oauth/request_token
	 * 
	 * Request POST Body: N/A
	 * 
	 * Authorization Header: OAuth
	 * oauth_nonce="K7ny27JTpKVsTgdyLdDfmQQWVLERj2zAK5BslRsqyw", oauth_callback=
	 * "http%3A%2F%2Fmyapp.com%3A3005%2Ftwitter%2Fprocess_callback",
	 * oauth_signature_method="HMAC-SHA1", oauth_timestamp="1300228849",
	 * oauth_consumer_key="OqEqJeafRSF11jBMStrZz",
	 * oauth_signature="Pc%2BMLdv028fxCErFyi8KXFM%2BddU%3D", oauth_version="1.0"
	 * 
	 * Response: oauth_token=Z6eEdO8MOmk394WozF5oKyuAv855l4Mlqo7hhlSLik&
	 * oauth_token_secret
	 * =Kd75W4OQfb2oJTV0vzGzeXftVAwgMnEK9MumzYcM&oauth_callback_confirm
	 */
	public final static String OAUTH_REQUEST_TOKEN_API = API_ROOT
			+ "oauth/request_token";

	/**
	 * Allows a Consumer application to use an OAuth Request Token to request
	 * user authorization. This method fulfills Section 6.2 of the OAuth 1.0
	 * authentication flow. Desktop applications must use this method (and
	 * cannot use GET oauth/authenticate).
	 * 
	 * Please use HTTPS for this method, and all other OAuth token negotiation
	 * steps.
	 * 
	 * Usage Note: An oauth_callback is never sent to this method, provide it to
	 * POST oauth/request_token instead.
	 * 
	 * </br><strong>Parameters</strong></br>
	 * </br><strong>force_login</strong></br>Forces the user to enter their
	 * credentials to ensure the correct users account is authorized.</br>
	 * </br><strong>screen_name</strong></br>Prefills the username input box of
	 * the OAuth login screen with the given value.</br> </br><strong>Example
	 * Request</strong></br> Send the user to the oauth/authorize step in a web
	 * browser, including an oauth_token parameter:
	 * https://api.twitter.com/oauth
	 * /authorize?oauth_token=Z6eEdO8MOmk394WozF5oKyuAv855l4Mlqo7hhlSLik
	 */
	public final static String OAUTH_AUTHORIZE_API = API_ROOT
			+ "oauth/authorize";

	/**
	 * Allows a Consumer application to exchange the OAuth Request Token for an
	 * OAuth Access Token. This method fulfills Section 6.3 of the OAuth 1.0
	 * authentication flow.
	 * 
	 * The OAuth access token may also be used for xAuth operations.
	 * 
	 * Please use HTTPS for this method, and all other OAuth token negotiation
	 * steps.
	 * 
	 * </br><strong>Parameters</strong></br>
	 * </br><strong>x_auth_password</strong></br>The password of the user for
	 * which to obtain a token for. Required when using xAuth
	 * </br><strong>x_auth_username</strong></br>The username of the user to
	 * obtain a token for. Required when using xAuth
	 * </br><strong>x_auth_mode</strong></br>Set this value to client_auth,
	 * without the quotes. Required when using xAuth
	 * </br><strong>oauth_verifier</strong></br>If using the OAuth web-flow, set
	 * this parameter to the value of the oauth_verifier returned in the
	 * callback URL. If you are using out-of-band OAuth, set this value to the
	 * pin-code. When using xAuth, this value should not be included.
	 * 
	 * For OAuth 1.0a compliance this parameter is required unless you are using
	 * xAuth. Currently Twitter supports both OAuth 1.0 and OAuth 1.0a which
	 * means we do not error if this value isn't included. OAuth 1.0a is now
	 * strictly enforced and applications not using the oauth_verifier will fail
	 * to complete the OAuth flow. If you're not receiving an oauth_verifier in
	 * your callback, verify that you're explicitly setting your oauth_callback
	 * on POST oauth/request_token.
	 * 
	 * </br><strong>Example Request</strong></br> Response to a successful
	 * request
	 * 
	 * oauth_token=6253282-eWudHldSbIaelX7swmsiHImEL4KinwaGloHANdrY&
	 * oauth_token_secret=
	 * 2EEfA6BG3ly3sR3RjE0IBSnlQu4ZrUzPiYKmrkVU&user_id=6253282&screen_name=twitte
	 * r a
	 */
	public final static String OAUTH_ACCESS_TOKEN_API = API_ROOT
			+ "oauth/authorize";

	// ������statusnet ˽��API
	/**
	 * GET Shows a group's timeline. Similar to other timeline resources
	 * params:page (int), count (int), max_id (int), since_id (int), format
	 * (string, 'xml', 'json', 'atom', or 'rss'), callback (string, JSON-P
	 * callback) [format is required]
	 */
	public final static String GROUPS_TMELINE_API = API_ROOT
			+ "statusnet/groups/timeline." + API_FORMAT;
	/**
	 * GET Show a groups profile. params: id (string, group ID or nickname),
	 * group_id (int), group_name (string), format (string, 'xml' or 'json'),
	 * callback (string, JSON-P callback) [format is required; must also include
	 * a param identifying a group]
	 */
	public final static String GROUPS_SHOW_API = API_ROOT
			+ "statusnet/groups/show." + API_FORMAT;

	/**
	 * POST Create a new group. params: nickname (string, name of the group),
	 * full_name (string), homepage (string), description (string), location
	 * (string), aliases (string, comma-separated), format (string, 'xml' or
	 * 'json'), callback (string, JSON-P callback function) [format and nickname
	 * are required]
	 */
	public final static String GROUPS_CREATE_API = API_ROOT
			+ "statusnet/groups/create." + API_FORMAT;

	/**
	 * POST Join a group. params: id (string, group ID or nickname), group_id
	 * (int), group_name (string), format (string, 'xml' or 'json'), callback
	 * (string, JSON-P callback) [format is required; must also include a param
	 * identifying a group]
	 */
	public final static String GROUPS_JOIN_API = API_ROOT
			+ "statusnet/groups/join." + API_FORMAT;

	/**
	 * POST leave a group. params: id (string, group ID or nickname), group_id
	 * (int), group_name (string), format (string, 'xml' or 'json'), callback
	 * (string, JSON-P callback) [format is required; must also include a param
	 * identifying a group]
	 */
	public final static String GROUPS_LEAVE_API = API_ROOT
			+ "statusnet/groups/leave." + API_FORMAT;

	/**
	 * GET Show the groups a given user is a member of. params: id (string, user
	 * ID or nickname), user_id (int), screen_name (string), format (string,
	 * 'xml' or 'json'), callback (string, JSON-P callback) [format is required;
	 * must also include a param identifying a user]
	 */
	public final static String GROUPS_LIST_API = API_ROOT
			+ "statusnet/groups/list." + API_FORMAT;

	/**
	 * GET List all local groups. params: page (int), count (int), format
	 * (string, 'xml', 'json', 'atom', or 'rss'), callback (string, JSON-P
	 * callback) [format is required]
	 */
	public final static String GROUPS_LIST_ALL_API = API_ROOT
			+ "statusnet/groups/list_all." + API_FORMAT;

	/**
	 * GET List the members of a given group. params: id (string, group ID or
	 * nickname), group_id (int), group_name (string), format (string, 'xml' or
	 * 'json'), callback (string, JSON-P callback) [format is required; must
	 * also include a param identifying a group]
	 */
	public final static String GROUPS_MEMBERSHIP_API = API_ROOT
			+ "statusnet/groups/membership." + API_FORMAT;

	/**
	 * GET Determine whether a given user is a member of a given group. params:
	 * id (string, user ID or nickname), user_id (int), group_id (int),
	 * screen_name (string), group_name (string), format (string, 'xml' or
	 * 'json'), callback (string, JSON-P callback) [format is required; must
	 * also include a param identifying a user, and a param identifying a group]
	 */
	public final static String GROUPS_IS_MEMBER_API = API_ROOT
			+ "statusnet/groups/ismembership." + API_FORMAT;

	/**
	 * Shows a tag's timeline. Similar to other timeline resources.
	 */
	public final static String TAGS_TIMELINE_API = API_ROOT
			+ "statusnet/tags/timeline." + API_FORMAT;

	/**
	 * Twitpic-style endpoint for uploading an image. Returns a URL that can be
	 * used in a status update. Format post data as multipart/form-data.
	 */
	public final static String MEDIA_UPLOAD_API = API_ROOT + "media/upload."
			+ API_FORMAT;

}
