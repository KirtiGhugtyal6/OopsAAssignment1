package oops1
import scala.collection.mutable.ListBuffer

object MainQueue extends App{
  val list = ListBuffer(6,1,5,4,3,9)
  println("Queue is: ")
  for(i <- list.indices)
    print(list(i)+" ")

  var doubleQueue = new DoubleQueue(list)
  println("\n\nQueue Elements After doing the doubling: ")
  for(i <- list.indices)
    print(list(i)+" ")

  var squareQueue = new DoubleQueue(list)
  println("\nQueue Elements After doing the squaring: ")
  for(i <- list.indices)
    print(list(i)+" ")

  squareQueue.dequeue(list)
  println("\nAfter dequeue a element in queue: ")
  for(i <- list.indices)
    print(list(i)+" ")
  squareQueue.dequeue(list)
  println("\nAfter enqueue a element in queue: ")
  for(i <- list.indices)
    print(list(i)+" ")
}
