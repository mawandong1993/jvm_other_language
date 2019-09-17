import org.junit.Test
import org.slf4j.LoggerFactory
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

/**
 * @author mawandong
 * @date 2019/9/17 19:43
 */

class test01 {

    companion object {
        var logger = LoggerFactory.getLogger(this.javaClass)
    }


    @Test
    fun test01(){
        var data =  Date ()
        var s = LocalDateTime.now()
        logger.info(s.toString())
    }


}