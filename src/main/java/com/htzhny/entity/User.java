package com.htzhny.entity;

/**
 * �û���Ϣ
 */
public class User {
    // ��Ա����
    private int userId;//�û�id
    private String userName;//�û�����
    private String userPassword;//�û�����
    private String userPhone;//�û��ֻ���
    private String userType;//�û�����
    private String userImg;//�û�ͷ��
    private String userIdType;//�û�֤������
    private String userIdCard;//�û�֤������
    private String userBirthday;//�û�����
    private String userCompany;//�û�������λ
    private String createTime;//�˻�����ʱ��
    private String userLastLoginTime;//�û��ϴε�¼ʱ��
    private String status;//�û�״̬
    // ���캯��
    public User() {
    }
    public User(Integer userId, String userName, String userPassword) {
        this.userId=userId;
        this.userName=userName;
        this.userPassword =userPassword;
    }
    public User(Integer userId, String userName, String userPassword, String userPhone, String userType, String userImg,
			String userIdType, String userIdCard, String userBirthday, String userCompany, String createTime,
			String userLastLoginTime, String status) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userType = userType;
		this.userImg = userImg;
		this.userIdType = userIdType;
		this.userIdCard = userIdCard;
		this.userBirthday = userBirthday;
		this.userCompany = userCompany;
		this.createTime = createTime;
		this.userLastLoginTime = userLastLoginTime;
		this.status = status;
	}
	// ��Ա����
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserIdType() {
		return userIdType;
	}

	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(String userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userPhone="
				+ userPhone + ", userType=" + userType + ", userImg=" + userImg + ", userIdType=" + userIdType
				+ ", userIdCard=" + userIdCard + ", userBirthday=" + userBirthday + ", userCompany=" + userCompany
				+ ", createTime=" + createTime + ", userLastLoginTime=" + userLastLoginTime + ", status=" + status
				+ "]";
	}
}