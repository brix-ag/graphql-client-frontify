package ch.brix.gql.client.frontify.builders;

public class On_RemoveCollectionAssets extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCollectionAssets() {
    super(new ch.brix.gql.client.On("RemoveCollectionAssets"));
  }
  /**
   * `Collection` details.
   */
  public On_RemoveCollectionAssets collection(RemoveCollectionAssets_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
