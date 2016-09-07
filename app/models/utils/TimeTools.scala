package models.utils


object TimeTools {
  def time[A](opName: String, f: => A) = {
    val s = System.nanoTime
    val ret = f
    println(s"[log] $opName took : "+(System.nanoTime-s)/1e6+"ms")
    ret
  }
}
