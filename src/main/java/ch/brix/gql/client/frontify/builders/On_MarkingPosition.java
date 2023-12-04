package ch.brix.gql.client.frontify.builders;

public class On_MarkingPosition extends ch.brix.gql.client.TypeBuilder {
  public On_MarkingPosition() {
    super(new ch.brix.gql.client.On("MarkingPosition"));
  }
  /**
   * The horizontal position of the `Marking` in percentage, in relation to the `Asset` total width.
   */
  public On_MarkingPosition x() {
    _add_field("x");
    return this;
  }
  /**
   * The vertical position of the `Marking` in percentage, in relation to the `Asset` total height.
   */
  public On_MarkingPosition y() {
    _add_field("y");
    return this;
  }
}
