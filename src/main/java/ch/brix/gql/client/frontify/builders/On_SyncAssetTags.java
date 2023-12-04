package ch.brix.gql.client.frontify.builders;

public class On_SyncAssetTags extends ch.brix.gql.client.TypeBuilder {
  public On_SyncAssetTags() {
    super(new ch.brix.gql.client.On("SyncAssetTags"));
  }
  /**
   * `Asset` details.
   */
  public On_SyncAssetTags asset(SyncAssetTags_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
