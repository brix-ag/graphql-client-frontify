package ch.brix.gql.client.frontify.builders;

public class On_UpdateCollection extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateCollection() {
    super(new ch.brix.gql.client.On("UpdateCollection"));
  }
  /**
   * `Collection` details.
   */
  public On_UpdateCollection collection(UpdateCollection_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
