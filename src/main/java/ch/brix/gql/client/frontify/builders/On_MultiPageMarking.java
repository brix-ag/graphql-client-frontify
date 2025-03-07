package ch.brix.gql.client.frontify.builders;

public class On_MultiPageMarking extends ch.brix.gql.client.TypeBuilder {
  public On_MultiPageMarking() {
    super(new ch.brix.gql.client.On("MultiPageMarking"));
  }
  /**
   * The `Marking` position in percent relative to the top left corner of the `Asset`.
   */
  public On_MultiPageMarking position(MultiPageMarking_position callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `Marking` dimensions in percent of `Asset` dimensions.
   */
  public On_MultiPageMarking dimensions(MultiPageMarking_dimensions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `Asset` page where the `Marking` is set.
   */
  public On_MultiPageMarking page() {
    _add_field("page");
    return this;
  }
}
