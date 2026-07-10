package ch.brix.gql.client.frontify.builders;

public class On_DeleteAssetVariant extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteAssetVariant() {
    super(new ch.brix.gql.client.On("DeleteAssetVariant"));
  }
  /**
   * `AssetVariant` Id.
   */
  public On_DeleteAssetVariant id() {
    _add_field("id");
    return this;
  }
}
