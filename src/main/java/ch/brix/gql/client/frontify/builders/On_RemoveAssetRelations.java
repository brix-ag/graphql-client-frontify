package ch.brix.gql.client.frontify.builders;

public class On_RemoveAssetRelations extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveAssetRelations() {
    super(new ch.brix.gql.client.On("RemoveAssetRelations"));
  }
  /**
   * `Asset` details.
   */
  public On_RemoveAssetRelations asset(RemoveAssetRelations_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Related `Asset` items details.
   */
  public On_RemoveAssetRelations relatedAssets(RemoveAssetRelations_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
