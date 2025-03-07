package ch.brix.gql.client.frontify.builders;

public class On_SimpleMarking extends ch.brix.gql.client.TypeBuilder {
  public On_SimpleMarking() {
    super(new ch.brix.gql.client.On("SimpleMarking"));
  }
  /**
   * The `Marking` position in percent relative to the top left corner of the `Asset`.
   */
  public On_SimpleMarking position(SimpleMarking_position callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `Marking` dimensions in percent of `Asset` dimensions.
   */
  public On_SimpleMarking dimensions(SimpleMarking_dimensions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
