package ch.brix.gql.client.frontify.input_objects;

public class MarkingDimensionsInput extends ch.brix.gql.client.InputObject {
  /**
   * The width of the `Marking` area in percentage of the annotated subject total width.
   */
  public MarkingDimensionsInput width(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("width", v);
    return this;
  }
  /**
   * The height of the `Marking` area in percentage of the annotated subject total height.
   */
  public MarkingDimensionsInput height(ch.brix.gql.client.frontify.scalars.PercentScalar v) {
    values.put("height", v);
    return this;
  }
}
