package com.lea.lawofdemeter.eg2;

/**
 * @author lzc
 * @create 2020-11-3 10:03
 *
 *
 */
public class InstallSoftware {
    // 安装程序, 可以看到Wizard很多方法都暴露给InstallSoftware，耦合关系变得异常紧密，修改程序的风险也就提高了，因此需要重构
    public void installWizard(Wizard wizard) {
        // 耦合度太高，对修改不利
//        int first = wizard.first();
//        if (first > 50) {
//            int second = wizard.second();
//            if (second > 50) {
//                int third = wizard.third();
//            }
//        }
        // 修改后的wizard只对外暴露 安装方法，直接调用即可
        wizard.installWizard();
    }
}
