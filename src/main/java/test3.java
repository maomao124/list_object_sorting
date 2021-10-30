/**
 * Project name(项目名称)：List对象排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/30
 * Time(创建时间)： 19:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test3
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test.main();
        System.out.println("-------------------");
        test2.main();
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
             double final_runtime;
             final_runtime = (endTime - startTime);
             final_runtime = final_runtime / 1000;
             System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
         }
        else
        {
             double final_runtime;
             final_runtime = (endTime - startTime) / 10000;
             final_runtime = final_runtime / 100000;
             System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
