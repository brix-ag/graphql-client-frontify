package ch.brix.gql.client.frontify.builders;

public class On_AddAssetLicense extends ch.brix.gql.client.TypeBuilder {
  public On_AddAssetLicense() {
    super(new ch.brix.gql.client.On("AddAssetLicense"));
  }
  /**
   * `Asset` details.
   */
  public On_AddAssetLicense asset(AddAssetLicense_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `License` details.
   */
  public On_AddAssetLicense license(AddAssetLicense_license callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
