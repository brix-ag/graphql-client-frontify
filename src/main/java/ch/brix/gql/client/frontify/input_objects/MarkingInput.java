package ch.brix.gql.client.frontify.input_objects;

public class MarkingInput extends ch.brix.gql.client.InputObject {
  /**
   * The `Marking` position in percentage, in relation to the top left corner of the `Asset`.
   */
  public MarkingInput position(ch.brix.gql.client.frontify.input_objects.MarkingPositionInput v) {
    values.put("position", v);
    return this;
  }
  /**
   * The `Marking` dimensions in percentage of the annotated subject dimensions.
   */
  public MarkingInput dimensions(ch.brix.gql.client.frontify.input_objects.MarkingDimensionsInput v) {
    values.put("dimensions", v);
    return this;
  }
  /**
   * The timeframe of the `Marking` area in percentage of total video length. Applicable to `Video` type `Assets` only.
   */
  public MarkingInput timeframe(ch.brix.gql.client.frontify.input_objects.MarkingTimeframeInput v) {
    values.put("timeframe", v);
    return this;
  }
  /**
   * The `Marking` page. Applicable to `Assets` with the type `Document` only.
   */
  public MarkingInput page(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("page", v);
    return this;
  }
}
