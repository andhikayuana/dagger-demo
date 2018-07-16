package id.yuana.dagger.demo

import javax.inject.Qualifier

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Mon 16 2018 14.52
 **/

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: String = "")