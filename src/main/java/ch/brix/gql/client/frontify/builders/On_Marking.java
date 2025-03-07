package ch.brix.gql.client.frontify.builders;

public class On_Marking extends ch.brix.gql.client.TypeBuilder {
  public On_Marking() {
    super(new ch.brix.gql.client.On("Marking"));
  }
  /**
   * The `Marking` position in percentage relative to the top left corner of the annotated subject.
   */
  public On_Marking position(Marking_position callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The `Marking` dimensions in percentage relative to the annotated subject size.
   */
  public On_Marking dimensions(Marking_dimensions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
