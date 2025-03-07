package ch.brix.gql.client.frontify.builders;

public class On_MarkingDimensions extends ch.brix.gql.client.TypeBuilder {
  public On_MarkingDimensions() {
    super(new ch.brix.gql.client.On("MarkingDimensions"));
  }
  /**
   * The width of the `Marking` area in percentage of the annotated subject total width, relative to the top left corner.
   */
  public On_MarkingDimensions width() {
    _add_field("width");
    return this;
  }
  /**
   * The height of the `Marking` area in percentage of the annotated subject total height, relative to the top left corner.
   */
  public On_MarkingDimensions height() {
    _add_field("height");
    return this;
  }
}
