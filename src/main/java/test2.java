import java.util.*;

/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 18:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static int getIntRandom(int min, int max)         //空间复杂度和时间复杂度更低
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static int getIntRandom1(int min, int max)          //获取int型的随机数
    {
        if (min > max)
        {
            min = max;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String... args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明", 1));
        list.add(new Student("小红", 4));
        list.add(new Student("小刚", 3));
        list.add(new Student("小鸡", 5));
        list.add(new Student("小狗", 2));
        list.add(new Student("小鸡2", 8));
        list.add(new Student("小狗2", 9));
        for (int i = 0; i < 30; i++)
        {
            Student student = new Student();
            student.setName("测试" + getIntRandom(0, 100) + "号");
            student.setAge(getIntRandom(1, 50));
            list.add(student);
        }
        //使用Collections集合工具类进行排序
        Collections.sort(list);
        //Collections.reverse(list);  //降序
        for (Student student : list)
        {
            System.out.println(student);
        }
        System.out.println();
        //使用Collections集合工具类进行排序
        Collections.sort(list, new Comparator<Student>()
        {
            @Override
            public int compare(Student stu1, Student stu2)
            {
                //升序排序
                return stu1.getAge() - stu2.getAge();
            }
        });
        for (Student student : list)
        {
            System.out.println(student);
        }
        //方法3
        System.out.println();
        Collections.sort(list, (stu1, stu2) -> stu1.getName().compareTo(stu2.getName()));
        for (Student student : list)
        {
            System.out.println(student);
        }
        System.out.println();
        //Collections.sort(list,(stu1, stu2)->stu1.getAge() - stu2.getAge());
        //list.sort((stu1, stu2)->stu1.getAge() - stu2.getAge());
        list.sort(Comparator.comparingInt(Student::getAge));
        Collections.reverse(list);
        for (Student student : list)
        {
            System.out.println(student);
        }
    }
}
