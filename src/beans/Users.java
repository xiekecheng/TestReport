package beans;

/**
 * @program: TestReport
 * @description: 用户表
 * @author: Mr.Xie
 * @create: 2018-08-26 18:30
 **/
public class Users {
    /**
     * 买家ID
     */
    private int userId;
    /**
     * 买家姓名
     */
    private String name;
    /**
     * 买家年龄
     */
    private int age;
    /**
     * 买家性别
     */
    private String sex;
    /**
     * 买家所在地区
     */
    private String area;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getArea() {
        return area;
    }
}
