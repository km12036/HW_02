import scala.io.StdIn.readLine

object Tree extends App {

  //first tree using argument
  var treeHeight=3

  if (args.length==0)
  {treeHeight}
  else if (args(0).toInt<3) {treeHeight}
  else {treeHeight=args(0).toInt}

  for (i <- 1 to treeHeight)
  {
    println(" "*(treeHeight-i)+"*"*(i*2-1))
  }

  println()

  // second tree using read line
  print("Please enter height for another tree: ")
  var height=readLine().toInt

  if (height<3)
  {
    height=3}
  else {
    height
  }
  for (i <- 1 to height)
  {
    println(" "*(height-i)+"*"*(i*2-1))
  }

}
