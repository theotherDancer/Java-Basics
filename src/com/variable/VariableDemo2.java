package com.variable;

public class VariableDemo2
{
    static void main() {

    /*我方英雄：
    attack:10  blood:100 skill:1.1 defense:10
    敌方英雄：
    attack:17  blood:100 skill:1.1 defense:5
    普通攻击造成的伤害等于攻击值减去防御值
    技能攻击造成的伤害等于攻击值乘以技能值减去防御值*/
        //定义一个变量记录我方英雄的生命值
        double myBlood = 100;
        //定义一个变量记录我方英雄的攻击值
        double myAttack = 10;
        //定义一个变量记录我方英雄的防御值
        double myDefense = 10;
        //定义一个变量记录我方英雄的技能值
        double mySkill = 1.1;
        //定义一个变量记录敌方英雄的攻击值
        double enemyAttack = 17;
        //定义一个变量记录敌方英雄的防御值
        double enemyDefense = 5;
        //定义一个变量记录敌方英雄的生命值
        double enemyBlood = 100;
        //定义一个变量记录敌方英雄的技能值
        double enemySkill = 1.1;
        //定义一个变量记录我方英雄的普通攻击造成的伤害
        double myNormalAttackDamage = myAttack - enemyDefense;
        //定义一个变量记录我方英雄的技能攻击造成的伤害
        double mySkillAttackDamage = myAttack * mySkill - enemyDefense;
        //我方英雄普通攻击敌方英雄一次，则敌方英雄剩余血量
        enemyBlood = enemyBlood - myNormalAttackDamage;
        //输出敌方英雄剩余血量
        System.out.println("我方英雄攻击一次，敌方英雄剩余血量是" + enemyBlood);

    }
}
