package ch.brix.gql.client.frontify.builders;

public class On_AddAssetRelations extends ch.brix.gql.client.TypeBuilder {
  public On_AddAssetRelations() {
    super(new ch.brix.gql.client.On("AddAssetRelations"));
  }
  /**
   * `Asset` details.
   */
  public On_AddAssetRelations asset(AddAssetRelations_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Related `Assets` details.
   */
  public On_AddAssetRelations relatedAssets(AddAssetRelations_relatedAssets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
