package com.wss.debug.test;

import java.util.HashMap;

/**
 * @author 王森森
 * @create 2020/12/6 22:13
 */
@SuppressWarnings("all")
public class DebugTest {
    public static void main(String[] args){
        /**
         * 一：debug中各个键位的用处(横栏)
         * 1.show Execution point 如果你的光标在其他的地方行或者页面 点击这个按钮可以跳到当前代码的执行行
         * 2.step over            步过 一步一步往下走 如果这一行有方法不会进入方法
         * 3.step into            步入 一步一步往下走 如果这一行有方法可以进入方法（一般进入的是方法内部）
         * 4.force step into      强制步入能进去任何方法，常用来进入底层查看源代码
         * 5.step out             从步入的方法退出到方法执行处，方法已经指向完毕还没有赋值
         * 6.drop frame           回退断点
         * 7.run to cursor        运行到光标处
         */


        /**
         * 二：debug中竖栏处
         * 1.return debugTest  重新运行程序
         * 2.resume program    恢复程序运行到下一行
         * 3.stop debugTest    联系按两次关闭程序
         * 4.view breakPoints  显示所有的断点
         * 5.Mute breakPoints  使其断点哑巴  运行过程中可以点击  若想只其中某个断点不生效可以右键断点 enabled不选择
         */

        /**
         * 三：变量查看
         * 1.idea中参数所在行会显示当前变量的值
         * 2.鼠标悬浮可以显示
         * 3.variables 可以显示
         * 4.watches
         */

        /**
         * 四：计算表达式
         * 1.点击 evalute expression 或者按alt+f8 可以弹出表达式窗口 通过表达式可以查看某个方法返回值
         * 2.设置变量 可以在计算表达式的框里面 设置变量的值
         */

        /**
         * 五：智能步入
         * 1.Run  smart step into (敏捷步入)
         */

        /**
         * 六：断点条件设置
         * 1.右键断点然后condition填进去表达式
         * 点击view points    点击evaluate and log  会在执行到此时时在控制台输出值
         * 2.异常断点
         * 点击+号 java Exception breakPoints 程序中出现异常的时候会自动定位到异常处
         */

        /**
         * 七：多线程调试  idea默认是all  会阻塞其他线程
         * 1.点击view breakpoints
         * suspend 点击thread  make default
         */

        StringBuilder wss = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            wss.append(i);
        }
        System.out.println(wss.append("wss").toString());

        HashMap map = null;

        map.put("aaa","sdsds");

        System.out.println("hhhh");

        System.out.println("aini");
    }
}
