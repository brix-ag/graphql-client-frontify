package ch.brix.gql.client.frontify.builders;

public class On_CreateCollection extends ch.brix.gql.client.TypeBuilder {
  public On_CreateCollection() {
    super(new ch.brix.gql.client.On("CreateCollection"));
  }
  /**
   * The newly created `Collection` details.
   */
  public On_CreateCollection collection(CreateCollection_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
