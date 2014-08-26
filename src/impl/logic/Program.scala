package impl.logic

/**
 * A program consists of a list of declarations and constraints.
 */
case class Program(constraints: List[Constraint], lattices: Map[Symbol.PredicateSymbol, Lattice]) {
  /**
   * Returns the list of facts.
   */
  def facts: List[Constraint.Fact] = constraints collect {
    case f@Constraint.Fact(head) => f
  }

  /**
   * Returns the list of rules.
   */
  def rules: List[Constraint.Rule] = constraints collect {
    case r@Constraint.Rule(head, body) => r
  }
}
