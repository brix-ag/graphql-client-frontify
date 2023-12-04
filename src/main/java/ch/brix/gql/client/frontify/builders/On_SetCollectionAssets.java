package ch.brix.gql.client.frontify.builders;

public class On_SetCollectionAssets extends ch.brix.gql.client.TypeBuilder {
  public On_SetCollectionAssets() {
    super(new ch.brix.gql.client.On("SetCollectionAssets"));
  }
  /**
   * `Collection` details.
   */
  public On_SetCollectionAssets collection(SetCollectionAssets_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
