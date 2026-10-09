package com.zhangyihang.mysort;

public class a04_Recursion {
    /*求1~100的和等于100+1~99的和
    求1~99的和等于99+1~98的和
    求1~98的和等于98+1~97的和
    求1~2的和等于2+1~1的和
    求1~1的和等于1              */
    static void main(String[] args) {
        System.out.println(getSum(100));
        System.out.println(gatFactorial(20));
    }
    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + getSum(number - 1);
        /*执行过程：先"递"下去，再"归"回来
        递：getsum(100) 自己不算，先挂起，去问 getsum(99)……一路压到 getsum(1)。
        此刻栈里同时躺着 100 个调用帧，每一帧都留着一句待办的「number +」。
        归：getsum(1) 返回 1 → getsum(2) = 2 + 1 = 3 →
        getsum(3) = 3 + 3 = 6 → … → getsum(100) = 100 + 4950 = 5050。
        展开式：getsum(100) = 100 + (99 + (98 + … + (2 + 1)))，括号由内向外求值，这就是"归"的方向。
         */
    }
    public static  int gatFactorial(int number){
        if (number == 1) {
            return 1;
        }
        return number*gatFactorial(number-1);
    }
}