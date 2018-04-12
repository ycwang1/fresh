package com.htzhny.entity;

/**
 * 用户信息
 */
public class User {
    // 成员变量
    private int userId;//用户id
    private String userName;//用户姓名
    private String userPassword;//用户密码
    private String userPhone;//用户手机号
    private String userType;//用户类型
    private String userImg;//用户头像
    private String userIdType;//用户证件类型
    private String userIdCard;//用户证件号码
    private String userBirthday;//用户生日
    private String userCompany;//用户所属单位
    private String createTime;//账户创建时间
    private String userLastLoginTime;//用户上次登录时间
    private String status;//用户状态
    // 构造函数
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
	// 成员方法
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