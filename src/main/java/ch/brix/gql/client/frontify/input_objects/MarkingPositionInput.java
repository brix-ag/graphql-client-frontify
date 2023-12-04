package ch.brix.gql.client.frontify.input_objects;

public class MarkingPositionInput extends ch.brix.gql.client.InputObject {
  /**
   * The horizontal position of the `Marking` in percentage, in relation to the `Asset` top left corner.
   */
  public MarkingPositionInput x(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("x", v);
    return this;
  }
  /**
   * The vertical position of the `Marking` in percentage, in relation to the `Asset` top left corner.
   */
  public MarkingPositionInput y(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("y", v);
    return this;
  }
}
