package com.sun.test.designModel.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式（Interpreter Pattern）是一种按照规定语法进行解析的方案，在现在项目中使
 * 用较少，其定义如下：Given a language, define a representation for its grammar along with an
 * interpreter that uses the representation to interpret sentences in the language.（给定一门语言，定义
 * 它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。）
 * <p>
 * 解释器模式的优点
 * 解释器是一个简单语法分析工具，它最显著的优点就是扩展性，修改语法规则只要修改
 * 相应的非终结符表达式就可以了，若扩展语法，则只要增加非终结符类就可以了。
 * 解释器模式的缺点
 * ● 解释器模式会引起类膨胀
 * 每个语法都要产生一个非终结符表达式，语法规则比较复杂时，就可能产生大量的类文
 * 件，为维护带来了非常多的麻烦。
 * ● 解释器模式采用递归调用方法
 * 每个非终结符表达式只关心与自己有关的表达式，每个表达式需要知道最终的结果，必
 * 须一层一层地剥茧，无论是面向过程的语言还是面向对象的语言，递归都是在必要条件下使
 * 用的，它导致调试非常复杂。想想看，如果要排查一个语法错误，我们是不是要一个断点一
 * 个断点地调试下去，直到最小的语法单元。
 * ● 效率问题
 * 解释器模式由于使用了大量的循环和递归，效率是一个不容忽视的问题，特别是一用于
 * 解析复杂、冗长的语法时，效率是难以忍受的。
 * <p>
 * 解释器模式使用的场景
 * ● 重复发生的问题可以使用解释器模式
 * 例如，多个应用服务器，每天产生大量的日志，需要对日志文件进行分析处理，由于各
 * 个服务器的日志格式不同，但是数据要素是相同的，按照解释器的说法就是终结符表达式都
 * 是相同的，但是非终结符表达式就需要制定了。在这种情况下，可以通过程序来一劳永逸地
 * 解决该问题。
 * ● 一个简单语法需要解释的场景
 * 为什么是简单？看看非终结表达式，文法规则越多，复杂度越高，而且类间还要进行递
 * 归调用（看看我们例子中的栈）。想想看，多个类之间的调用你需要什么样的耐心和信心去
 * 排查问题。因此，解释器模式一般用来解析比较标准的字符集，例如SQL语法分析，不过该
 * 部分逐渐被专用工具所取代。
 * 在某些特用的商业环境下也会采用解释器模式，我们刚刚的例子就是一个商业环境，而
 * 且现在模型运算的例子非常多，目前很多商业机构已经能够提供出大量的数据进行分析。
 * <p>
 * 解释器模式的注意事项
 * 尽量不要在重要的模块中使用解释器模式，否则维护会是一个很大的问题。在项目中可
 * 以使用shell、JRuby、Groovy等脚本语言来代替解释器模式，弥补Java编译型语言的不足。我
 * 们在一个银行的分析型项目中就采用JRuby进行运算处理，避免使用解释器模式的四则运
 * 算，效率和性能各方面表现良好。
 * Created by sunleic on 2017/8/2.
 */
public class Client {
    //运行四则运算
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
    }

    //获得表达式
    private static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得值映射
    private static HashMap<String, Integer> getValue(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        //解析有几个参数要传递
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
