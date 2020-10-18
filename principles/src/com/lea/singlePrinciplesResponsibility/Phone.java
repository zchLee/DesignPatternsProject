package com.lea.singlePrinciplesResponsibility;

/**
 * @author lzc
 * @create 2020-10-18 11:30
 * 单一职责原则：
 *      有且只有一个改变类的原因
 *  怎么用？
 *      一个类实现了两个接口在Phone中实现电话的通话功能
 *
 *  但是在项目中又看难，体现单一原则，还得分项目。
 *  原则是死的，人是活的，不要强行给类增加单一原则，否则会让类猛增，根本不便于维护
 *  在项目中，Service方法里，一个方法要明确作用，粒度不能太大。
 *      比如修改密码，就只做修改密码，不要写修改用户
 */
public interface Phone extends DataTrans, ConnectionManagement {

}
