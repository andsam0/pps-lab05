package it.unibo.pps.polyglot.a05b

import it.unibo.pps.polyglot.a05b.Logics

/** solution and descriptions at https://bitbucket.org/mviroli/oop2019-esami/src/master/a05b/sol2/ */
class LogicsImpl(private val size: Int) extends Logics:
  private val random = scala.util.Random(42)
  private var tickCount = 0
  private val initial: (Int, Int) = (random.nextInt(size-2)+1,random.nextInt(size-2)+1)

  override def tick(): Unit = tickCount += 1

  override def isOver: Boolean = false

  override def hasElement(x: Int, y: Int): Boolean = true
