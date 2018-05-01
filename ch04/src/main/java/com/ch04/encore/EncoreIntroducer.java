package com.ch04.encore;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author restep
 * @date 2018/5/1
 */
@Aspect
public class EncoreIntroducer {
    /**
     * DeclareParents注解所标注的静态属性指明了要引入了接口
     * 在这里我们所引入的是Encore接口
     *
     * value属性指定了哪种类型的bean要引入该接口
     * 在本例中 也就是所有实现Cd的类型
     * (标记符后面的加号表示是Cd的所有子类型 而不是Cd本身)
     *
     * defaultImpl属性指定了为引入功能提供实现的类
     * 在这里 我们指定的是EncoreImpl提供实现
     */
    @DeclareParents(value = "com.ch04.cd.Cd+", defaultImpl = EncoreImpl.class)
    public static Encore encore;
}
