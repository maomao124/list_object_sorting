import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 17:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String... args)
    {
        List<UserInfo> list = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            list.add(new UserInfo(3, "Zhang", simpleDateFormat.parse("2016-12-01"), 12));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        try
        {
            list.add(new UserInfo(1, "Li", simpleDateFormat.parse("2016-10-01"), 30));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        try
        {
            list.add(new UserInfo(2, "Chen", simpleDateFormat.parse("2015-10-01"), 11));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        sort<UserInfo> sortList = new sort<UserInfo>();
        // 按userId排序
        sortList.Sort(list, "getUserId", "desc");
        System.out.println("--------按userId倒序------------------");
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        // 按username排序
        sortList.Sort(list, "getUsername", null);
        System.out.println("---------按username排序-----------------");
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        // 按birthDate排序
        sortList.Sort(list, "getBirthDate", null);
        System.out.println("---------按birthDate排序-----------------");
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        sortList.Sort(list, "getAge", null);
        System.out.println("---------按Age排序-----------------");
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        System.out.println("---------按Age降序-----------------");
        list.sort((UserInfo1,UserInfo2)->UserInfo2.getAge()-UserInfo1.getAge());
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        System.out.println("---------按name降序-----------------");
        list.sort((UserInfo1,UserInfo2)->UserInfo2.getUserName().compareTo(UserInfo1.getUserName()));
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
        System.out.println("---------按name升序-----------------");
        list.sort(Comparator.comparing(UserInfo::getUserName));
        for (UserInfo user : list)
        {
            System.out.println(user.toString());
        }
    }
}
