import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): sort
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 17:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class sort<E>
{
    public void Sort(List<E> list, final String method, final String sorts)
    {
        Collections.sort(list, new Comparator()
        {
            public int compare(Object a, Object b)
            {
                int ret = 0;
                try
                {
                    Method m1 = ((E) a).getClass().getMethod(method, null);
                    Method m2 = ((E) b).getClass().getMethod(method, null);
                    if (sorts != null && "desc".equals(sorts))// 倒序
                    {
                        ret = m2.invoke(((E) b), null).toString().compareTo(m1.invoke(((E) a), null).toString());
                    }
                    else// 正序
                    {
                        ret = m1.invoke(((E) a), null).toString().compareTo(m2.invoke(((E) b), null).toString());
                    }
                }
                catch (NoSuchMethodException ne)
                {
                    System.out.println(ne);
                }
                catch (IllegalAccessException ie)
                {
                    System.out.println(ie);
                }
                catch (InvocationTargetException it)
                {
                    System.out.println(it);
                }
                return ret;
            }
        });
    }
}
