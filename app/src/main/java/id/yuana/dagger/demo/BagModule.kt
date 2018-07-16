package id.yuana.dagger.demo

import dagger.Module
import dagger.Provides

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Mon 16 2018 14.44
 */
@Module
class BagModule {

    @Provides
    @Choose(LOVE)
    fun sayLove(): Info = Info("Love Dagger :P")

    @Provides
    @Choose(HELLO)
    fun sayHello(): Info = Info("Hello Dagger :P")

}
