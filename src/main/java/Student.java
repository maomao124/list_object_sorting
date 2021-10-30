/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 18:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student implements Comparable<Student>
{

    private String name;
    private Integer age;

    public Student(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public Student()
    {

    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public int compareTo(Student stu)
    {
        //return this.age - stu.age;
        return this.name.compareTo(stu.getName());
    }
}
