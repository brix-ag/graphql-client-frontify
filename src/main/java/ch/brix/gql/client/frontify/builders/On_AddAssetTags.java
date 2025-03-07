package ch.brix.gql.client.frontify.builders;

public class On_AddAssetTags extends ch.brix.gql.client.TypeBuilder {
  public On_AddAssetTags() {
    super(new ch.brix.gql.client.On("AddAssetTags"));
  }
  /**
   * `Asset` details.
   */
  public On_AddAssetTags asset(AddAssetTags_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
