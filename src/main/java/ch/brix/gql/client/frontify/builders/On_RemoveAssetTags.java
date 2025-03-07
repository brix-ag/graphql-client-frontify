package ch.brix.gql.client.frontify.builders;

public class On_RemoveAssetTags extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveAssetTags() {
    super(new ch.brix.gql.client.On("RemoveAssetTags"));
  }
  /**
   * `Asset` details.
   */
  public On_RemoveAssetTags asset(RemoveAssetTags_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
