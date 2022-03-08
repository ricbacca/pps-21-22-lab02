package u02exercises

object Ex8 extends App {

  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def filter[A](opt: Option[A])(predicate:A=>Boolean): Option[A] = opt match
      case Some(a) if predicate(a) => Some(a)
      case _ => None()

    def map[A](opt: Option[A])(predicate:A=>Boolean): Option[Boolean] = opt match
      case Some(a) => Some(predicate(a))
      case _ => None()

    def map2[A, B](firstOpt: Option[A], secondOpt:Option[A])(f: (A, A) => Option[B]): Option[B] = (firstOpt, secondOpt) match
      case (Some(a), Some(b)) => f(a, b)
      case _ => None()

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()
}
