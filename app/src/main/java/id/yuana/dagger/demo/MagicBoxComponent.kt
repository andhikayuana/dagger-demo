package id.yuana.dagger.demo

import dagger.Component

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Mon 16 2018 14.32
 */
@Component(modules = [BagModule::class])
interface MagicBoxComponent {

    fun poke(app: MainActivity)
}
