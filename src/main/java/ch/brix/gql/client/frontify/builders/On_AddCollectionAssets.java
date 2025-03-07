package ch.brix.gql.client.frontify.builders;

public class On_AddCollectionAssets extends ch.brix.gql.client.TypeBuilder {
  public On_AddCollectionAssets() {
    super(new ch.brix.gql.client.On("AddCollectionAssets"));
  }
  /**
   * `Collection` details.
   */
  public On_AddCollectionAssets collection(AddCollectionAssets_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
