import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): UserInfo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 17:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class UserInfo implements java.io.Serializable
{
    private Integer userId;
    private String userName;
    private Date birthDate;
    private Integer age;
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public UserInfo()
    {

    }

    public UserInfo(Integer userId, String userName, Date birthDate, Integer age)
    {
        this.userId = userId;
        this.userName = userName;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        if (userId >= 0)
        {
            this.userId = userId;
        }
        else
        {
            this.userId = 0;
        }
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }

    public SimpleDateFormat getFormat()
    {
        return format;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("用户Id：").append(userId).append('\t');
        stringbuilder.append("用户名：").append(userName).append('\t');
        stringbuilder.append("生日：").append(format.format(birthDate)).append('\t');
        stringbuilder.append("年龄：").append(age);
        return stringbuilder.toString();
    }
}
